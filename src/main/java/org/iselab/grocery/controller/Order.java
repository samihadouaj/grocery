->RefactoringNumber->11584<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_1;[];[add])
->RefactoringNumber->11585<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->11588<-DecreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->11594<-PushDownMethod(Class_1;org.iselab.grocery.controller.Order;[];[add])
->RefactoringNumber->11595<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_3;[];[calculateTotal])
->RefactoringNumber->11608<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[id];[])
->RefactoringNumber->11609<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_7;[];[])
->RefactoringNumber->11610<-ExtractClass(org.iselab.grocery.controller.Order;Class_8;[];[])
->RefactoringNumber->11613<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_9;[];[])
->RefactoringNumber->11614<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_10;[];[])
->RefactoringNumber->11615<-ExtractClass(org.iselab.grocery.controller.Order;Class_11;[class_8];[])
->RefactoringNumber->11616<-PushDownField(org.iselab.grocery.controller.Order;Class_10;[id];[])
->RefactoringNumber->11618<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[input];[])
->RefactoringNumber->11623<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_13;[];[])
->RefactoringNumber->11626<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_14;[];[])
->RefactoringNumber->11627<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_15;[];[])
->RefactoringNumber->11630<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_16;[];[])
->RefactoringNumber->11634<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_19;[];[])
->RefactoringNumber->11635<-PullUpField(Class_10;org.iselab.grocery.controller.Order;[id];[])
->RefactoringNumber->11636<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_20;[];[])
->RefactoringNumber->11639<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->11643<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_22;[];[])
->RefactoringNumber->11644<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_23;[];[])
->RefactoringNumber->11645<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_24;[];[])
->RefactoringNumber->11647<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_26;[];[])
->RefactoringNumber->11648<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_27;[];[])
->RefactoringNumber->11650<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_29;[];[])
->RefactoringNumber->11651<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_30;[];[])
->RefactoringNumber->11652<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_31;[];[])
->RefactoringNumber->11653<-ExtractClass(org.iselab.grocery.controller.Order;Class_32;[];[])
->RefactoringNumber->11654<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_33;[];[])
->RefactoringNumber->11655<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_34;[];[])
->RefactoringNumber->11656<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_35;[];[])
->RefactoringNumber->11660<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_39;[];[])
->RefactoringNumber->11661<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_40;[];[])
->RefactoringNumber->11662<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_41;[];[])
->RefactoringNumber->11663<-ExtractClass(org.iselab.grocery.controller.Order;Class_42;[];[])
->RefactoringNumber->11666<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_43;[];[])
->RefactoringNumber->11669<-MoveField(Class_37;org.iselab.grocery.controller.Order;[class_2];[])
->RefactoringNumber->11675<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_44;[];[])
->RefactoringNumber->11680<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_45;[];[])
<-endRefactoring marker->
package org.iselab.grocery.controller;


import org.iselab.grocery.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public int add(int a, int b){
        return a+b;
    }
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
