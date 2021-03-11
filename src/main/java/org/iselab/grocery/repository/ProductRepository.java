->RefactoringNumber->31<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->34<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.repository.ProductRepository;[input];[])
->RefactoringNumber->38<-MoveField(org.iselab.grocery.repository.ProductRepository;Class_2;[input];[])
->RefactoringNumber->46<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.repository.ProductRepository;[];[add])
->RefactoringNumber->48<-IncreaseMethodSecurity(org.iselab.grocery.repository.ProductRepository;;[];[max])
->RefactoringNumber->53<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[class_2];[])
->RefactoringNumber->55<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.util.UUIDUtils;[order];[])
->RefactoringNumber->57<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_8;[class_2];[findAll|findById|getInput|removeById])
->RefactoringNumber->63<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_8;[];[findByName])
->RefactoringNumber->65<-MoveField(Class_5;org.iselab.grocery.repository.ProductRepository;[order];[])
->RefactoringNumber->72<-PushDownField(org.iselab.grocery.repository.ProductRepository;Class_8;[order];[])
->RefactoringNumber->74<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[uuidutils];[])
->RefactoringNumber->78<-PushDownField(org.iselab.grocery.repository.ProductRepository;Class_8;[uuidutils];[])
->RefactoringNumber->79<-PullUpField(Class_8;org.iselab.grocery.repository.ProductRepository;[uuidutils];[])
->RefactoringNumber->88<-MoveField(Class_2;org.iselab.grocery.repository.ProductRepository;[input];[])
->RefactoringNumber->112<-PullUpMethod(Class_8;org.iselab.grocery.repository.ProductRepository;[];[getOrder])
->RefactoringNumber->115<-PullUpField(Class_8;org.iselab.grocery.repository.ProductRepository;[product];[])
->RefactoringNumber->118<-PullUpField(Class_8;org.iselab.grocery.repository.ProductRepository;[order];[])
->RefactoringNumber->119<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_8;[];[max])
->RefactoringNumber->121<-MoveField(org.iselab.grocery.repository.ProductRepository;Class_28;[order];[])
->RefactoringNumber->124<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_8;[];[save])
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
