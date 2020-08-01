->RefactoringNumber->9214<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_1;[];[findByName|max|save])accepted
->RefactoringNumber->9215<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_1;[products];[])accepted
->RefactoringNumber->9216<-PushDownMethod(Class_1;org.iselab.grocery.repository.ProductRepository;[];[max])accepted
->RefactoringNumber->9224<-PushDownMethod(Class_1;org.iselab.grocery.repository.ProductRepository;[];[save])accepted
->RefactoringNumber->9228<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_1;[];[save])accepted
->RefactoringNumber->9229<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_1;[];[max])accepted
->RefactoringNumber->9233<-PushDownMethod(Class_1;org.iselab.grocery.repository.ProductRepository;[];[findByName])accepted
->RefactoringNumber->9249<-PushDownMethod(Class_1;org.iselab.grocery.repository.ProductRepository;[];[max])
->RefactoringNumber->9271<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_18;[];[findAll])
->RefactoringNumber->9275<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_18;[];[findByName])
->RefactoringNumber->9280<-PushDownField(Class_1;org.iselab.grocery.repository.ProductRepository;[order];[])
->RefactoringNumber->9298<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_1;[order];[])
->RefactoringNumber->9305<-PushDownField(Class_1;org.iselab.grocery.repository.ProductRepository;[order];[])
->RefactoringNumber->9307<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_27;[];[findById])
->RefactoringNumber->9310<-MoveMethod(org.iselab.grocery.repository.ProductRepository;Class_27;[];[findById])
->RefactoringNumber->9312<-MoveField(org.iselab.grocery.repository.ProductRepository;Class_11;[order];[])
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
