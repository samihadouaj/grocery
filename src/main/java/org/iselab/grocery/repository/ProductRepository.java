->RefactoringNumber->28<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_2;[];[findAll|removeById|save])
->RefactoringNumber->29<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_3;[];[findByName])
->RefactoringNumber->43<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[class_3];[])
->RefactoringNumber->48<-MoveMethod(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[];[max])
->RefactoringNumber->101<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_39;[products];[findByName])
->RefactoringNumber->115<-MoveMethod(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[];[max])
->RefactoringNumber->119<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_49;[order];[findByName])
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
