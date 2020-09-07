->RefactoringNumber->25<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.MainClass;[];[calculateTotal])
->RefactoringNumber->36<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.util.SystemUtils;[];[calculateTotal])
->RefactoringNumber->38<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->39<-MoveMethod(org.iselab.grocery.MainClass;org.iselab.grocery.controller.Order;[];[calculateTotal])
->RefactoringNumber->40<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_8;[systemutils];[calculateTotal])
->RefactoringNumber->41<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[name];[])
->RefactoringNumber->43<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[class_3];[])
->RefactoringNumber->48<-MoveMethod(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[];[max])
->RefactoringNumber->58<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Order;[sequential];[])
->RefactoringNumber->61<-MoveField(org.iselab.grocery.controller.Order;org.iselab.grocery.MainClass;[class_3];[])
->RefactoringNumber->75<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_25;[];[])
->RefactoringNumber->84<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[class_7];[])
->RefactoringNumber->87<-MoveField(Class_1;org.iselab.grocery.controller.Order;[class_26];[])
->RefactoringNumber->89<-MoveField(Class_24;org.iselab.grocery.controller.Order;[class_19];[])
->RefactoringNumber->97<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Order;[class_5];[])
->RefactoringNumber->98<-ExtractClass(org.iselab.grocery.controller.Order;Class_37;[class_7|mainclass];[getClass_5])
->RefactoringNumber->102<-MoveField(Class_2;org.iselab.grocery.controller.Order;[class_14];[])
->RefactoringNumber->106<-MoveMethod(Class_11;org.iselab.grocery.controller.Order;[];[showMenu])
->RefactoringNumber->107<-MoveField(Class_38;org.iselab.grocery.controller.Order;[class_7];[])
->RefactoringNumber->108<-MoveField(org.iselab.grocery.MainClass;org.iselab.grocery.controller.Order;[class_23];[])
->RefactoringNumber->115<-MoveMethod(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[];[max])
<-endRefactoring marker->
package org.iselab.grocery.controller;


import org.iselab.grocery.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    // ...

    public double calculateTotal(String country) {
        List<Product> prods = new ArrayList<Product>();
        prods.add(new Product(54,"prodName",4,123));
        prods.add(new Product(545,"prodName2",44,24));


        double total = 0;
        for (Product product : prods) {
            total += product.getAmount() * product.getPrice();
        }

        // Apply regional discounts.
        switch (country) {
            case "US": total *= 0.85; break;
            case "RU": total *= 0.75; break;
            case "CN": total *= 0.9; break;
            // ...
        }

        return total;
    }}
