->RefactoringNumber->28<-IncreaseMethodSecurity(org.iselab.grocery.repository.ProductRepository;;[];[findAll])
->RefactoringNumber->32<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_3;[];[findById])
->RefactoringNumber->34<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_3;[products];[])
->RefactoringNumber->44<-PushDownMethod(Class_3;org.iselab.grocery.repository.ProductRepository;[];[findById])
->RefactoringNumber->50<-PushDownField(Class_3;org.iselab.grocery.repository.ProductRepository;[manager];[])
->RefactoringNumber->51<-DecreaseMethodSecurity(org.iselab.grocery.repository.ProductRepository;;[];[findAll])
->RefactoringNumber->54<-MoveField(Class_6;org.iselab.grocery.repository.ProductRepository;[input];[])
->RefactoringNumber->57<-ExtractSubClass(org.iselab.grocery.repository.ProductRepository;Class_7;[manager];[max])
->RefactoringNumber->58<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_7;[];[save])
->RefactoringNumber->74<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_7;[];[getInput])
->RefactoringNumber->80<-PullUpMethod(Class_7;org.iselab.grocery.repository.ProductRepository;[];[getInput])
->RefactoringNumber->104<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[input];[])
->RefactoringNumber->112<-PushDownMethod(org.iselab.grocery.repository.ProductRepository;Class_7;[];[findAll])
->RefactoringNumber->117<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_3;[input];[])
->RefactoringNumber->136<-PullUpMethod(Class_7;org.iselab.grocery.repository.ProductRepository;[];[getManager])
->RefactoringNumber->144<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_3;[manager];[])
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
