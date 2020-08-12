->RefactoringNumber->10278<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[id];[])
->RefactoringNumber->10280<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->10281<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_2;[];[calculateTotal])
->RefactoringNumber->10306<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_8;[];[getId])
->RefactoringNumber->10309<-PullUpField(org.iselab.grocery.controller.Order;Class_2;[id];[])
->RefactoringNumber->10325<-PushDownField(Class_2;org.iselab.grocery.controller.Order;[id];[])
->RefactoringNumber->10335<-PullUpField(org.iselab.grocery.controller.Order;Class_2;[id];[])
->RefactoringNumber->10349<-MoveField(Class_9;org.iselab.grocery.controller.Order;[productrepository];[])
->RefactoringNumber->10360<-ExtractClass(org.iselab.grocery.controller.Order;Class_16;[];[getProductrepository])
->RefactoringNumber->10369<-MoveField(Class_18;org.iselab.grocery.controller.Order;[class_2];[])
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
