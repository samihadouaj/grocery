->RefactoringNumber->11586<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[products];[])
->RefactoringNumber->11587<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_2;[];[findAll|findByName|max])
->RefactoringNumber->11592<-IncreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[class_2];[])
->RefactoringNumber->11596<-IncreaseMethodSecurity(org.iselab.grocery.repository.ProductRepository;;[];[findByName])
->RefactoringNumber->11639<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->11658<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_37;[];[])
->RefactoringNumber->11665<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_37;[];[findAll])
->RefactoringNumber->11673<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.MainClass;[order];[])
->RefactoringNumber->11682<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_46;[];[findByName|save])
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
