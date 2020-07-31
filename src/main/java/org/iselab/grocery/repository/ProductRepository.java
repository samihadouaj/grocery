->RefactoringNumber->21<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_1;[];[findByName|removeById])
->RefactoringNumber->32<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_7;[products];[findAll|save])
->RefactoringNumber->43<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_12;[class_7];[findByName])
->RefactoringNumber->59<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_12;[];[save])
->RefactoringNumber->83<-MoveMethod(Class_15;org.iselab.grocery.repository.ProductRepository;[];[closeScanner])
->RefactoringNumber->112<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_29;[];[closeScanner|findById])
<-endRefactoring marker->
package org.iselab.grocery.repository;

import java.util.ArrayList;
import java.util.List;

import org.iselab.grocery.domain.Product;

public class ProductRepository {

    private static List<Product> products = new ArrayList<>();

    public void save(Product product) {
        products.add(product);
    }

    public List<Product> findAll() {
        return products;
    }
    
    public Product findById(int id) {

        for (Product product : products) {

            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public List<Product> findByName(String name) {

        List<Product> found = new ArrayList<>();

        for (Product products : products) {

            if (products.getName().toLowerCase().contains(name.toLowerCase())) {
                found.add(products);
            }
        }

        return found;
    }
    
    public Product removeById(int id) {

        Product found = findById(id);

        if (found == null) {
            return null;
        }

        products.remove(found);

        return found;
    }
}
