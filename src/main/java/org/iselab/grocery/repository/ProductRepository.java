->RefactoringNumber->42618<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_2;[];[findAll|findByName])
->RefactoringNumber->42620<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->42626<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_4;[];[removeById|save])
->RefactoringNumber->42635<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_9;[];[])
->RefactoringNumber->42636<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_10;[order];[max])
->RefactoringNumber->42657<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_19;[];[findAll])
->RefactoringNumber->42714<-IncreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[class_2];[])
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

    public boolean max(int a, int b) {
        if(a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
    }
    
}
