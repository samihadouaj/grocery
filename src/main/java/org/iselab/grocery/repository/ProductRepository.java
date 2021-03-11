->RefactoringNumber->135<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[products];[])
->RefactoringNumber->139<-ExtractSuperClass(org.iselab.grocery.repository.ProductRepository;Class_1;[];[findById|removeById|save])
->RefactoringNumber->144<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[products];[])
->RefactoringNumber->146<-PushDownMethod(Class_1;org.iselab.grocery.repository.ProductRepository;[];[findById])
->RefactoringNumber->149<-EncapsulateField(org.iselab.grocery.repository.ProductRepository;;[products];[])
->RefactoringNumber->150<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_1;[];[getProducts])
->RefactoringNumber->154<-PushDownMethod(Class_1;org.iselab.grocery.repository.ProductRepository;[];[save])
->RefactoringNumber->164<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_8;[];[findByName|max|setProducts])
->RefactoringNumber->167<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_1;[class_8];[])
->RefactoringNumber->168<-PushDownField(Class_1;org.iselab.grocery.repository.ProductRepository;[class_8];[])
->RefactoringNumber->173<-PushDownMethod(Class_1;org.iselab.grocery.repository.ProductRepository;[];[getProducts])
->RefactoringNumber->184<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_12;[];[findByName|getProducts|setProducts])
->RefactoringNumber->187<-ExtractClass(org.iselab.grocery.repository.ProductRepository;Class_14;[class_8];[findAll|removeById])
->RefactoringNumber->190<-DecreaseFieldSecurity(org.iselab.grocery.repository.ProductRepository;;[class_12];[])
->RefactoringNumber->195<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_1;[class_14];[])
->RefactoringNumber->196<-PullUpField(org.iselab.grocery.repository.ProductRepository;Class_1;[class_12];[])
->RefactoringNumber->206<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_1;[];[setProducts])
->RefactoringNumber->216<-PullUpMethod(org.iselab.grocery.repository.ProductRepository;Class_1;[];[findByName])
->RefactoringNumber->224<-IncreaseMethodSecurity(org.iselab.grocery.repository.ProductRepository;;[];[removeById])
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
