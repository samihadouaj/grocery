->RefactoringNumber->27<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->36<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->39<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[amount];[])
->RefactoringNumber->42<-ExtractClass(org.iselab.grocery.controller.Order;Class_5;[];[getAmount])
->RefactoringNumber->43<-DecreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->59<-DecreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->64<-MoveMethod(Class_5;org.iselab.grocery.controller.Order;[];[getAmount])
->RefactoringNumber->67<-DecreaseFieldSecurity(org.iselab.grocery.controller.Order;;[amount];[])
->RefactoringNumber->84<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_20;[amount];[calculateTotal|getAmount])
->RefactoringNumber->89<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_22;[];[getAmount])
->RefactoringNumber->98<-MoveField(org.iselab.grocery.domain.Person;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->113<-DecreaseFieldSecurity(org.iselab.grocery.controller.Order;;[products];[])
->RefactoringNumber->119<-PullUpField(org.iselab.grocery.controller.Order;Class_20;[products];[])
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
