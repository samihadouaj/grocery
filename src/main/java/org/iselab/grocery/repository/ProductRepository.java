->RefactoringNumber->10283<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.repository.ProductRepository;[input];[])
->RefactoringNumber->10285<-MoveMethod(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Shapes;[];[save])
->RefactoringNumber->10287<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_4;[input];[findAll|removeById])
->RefactoringNumber->10290<-PullUpField(Class_4;org.iselab.grocery.repository.ProductRepository;[input];[])
->RefactoringNumber->10293<-PullUpMethod(Class_4;org.iselab.grocery.repository.ProductRepository;[];[findAll])
->RefactoringNumber->10294<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_6;[input];[findAll|findById])
->RefactoringNumber->10311<-PushDownField(Class_6;org.iselab.grocery.repository.ProductRepository;[input];[])
->RefactoringNumber->10313<-IncreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[shapes];[])
->RefactoringNumber->10315<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_6;[input];[])
->RefactoringNumber->10319<-PushDownField(Class_6;org.iselab.grocery.repository.ProductRepository;[input];[])
->RefactoringNumber->10321<-IncreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[input];[])
->RefactoringNumber->10328<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Shapes;[input];[])
->RefactoringNumber->10333<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_4;[];[save])
->RefactoringNumber->10336<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.domain.Customer;[shapes];[])
->RefactoringNumber->10343<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[customer];[])
->RefactoringNumber->10347<-PushDownField(Class_6;org.iselab.grocery.repository.ProductRepository;[class_3];[])
->RefactoringNumber->10348<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_6;[products];[])
->RefactoringNumber->10359<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.ProductController;[customer];[])
->RefactoringNumber->10367<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[class_3];[])
->RefactoringNumber->10368<-PullUpMethod(Class_4;org.iselab.grocery.repository.ProductRepository;[];[getInput])
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
