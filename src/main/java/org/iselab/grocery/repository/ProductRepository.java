->RefactoringNumber->52773<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_1;[];[max])
->RefactoringNumber->52782<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_4;[products];[findAll|findById])
->RefactoringNumber->52785<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_4;[];[save])
->RefactoringNumber->52792<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_4;[class_1];[])
->RefactoringNumber->52800<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_10;[];[findByName])
->RefactoringNumber->52811<-PushDownField(Class_4;org.iselab.grocery.repository.ProductRepository;[class_1];[])
->RefactoringNumber->52823<-PullUpMethod(Class_10;org.iselab.grocery.repository.ProductRepository;[];[findByName])
->RefactoringNumber->52830<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_20;[];[removeById])
->RefactoringNumber->52836<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_4;[];[removeById])
->RefactoringNumber->52837<-IncreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[class_1];[])
->RefactoringNumber->52868<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_4;[];[max])
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
