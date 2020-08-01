->RefactoringNumber->9218<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[input];[])
->RefactoringNumber->9219<-MoveField(Class_1;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->9238<-DecreaseFieldSecurity(org.iselab.grocery.controller.Order;;[products];[])
->RefactoringNumber->9245<-DecreaseFieldSecurity(org.iselab.grocery.controller.Order;;[input];[])
->RefactoringNumber->9250<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_10;[input];[])
->RefactoringNumber->9252<-ExtractClass(org.iselab.grocery.controller.Order;Class_12;[];[setProducts])
->RefactoringNumber->9255<-EncapsulateField(org.iselab.grocery.controller.Order;;[products];[])
->RefactoringNumber->9261<-MoveMethod(org.iselab.grocery.controller.Shapes;org.iselab.grocery.controller.Order;[];[calculateShape])
->RefactoringNumber->9270<-PullUpField(Class_10;org.iselab.grocery.controller.Order;[input];[])
->RefactoringNumber->9284<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->9289<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_21;[products];[])
->RefactoringNumber->9296<-PullUpField(org.iselab.grocery.controller.Order;Class_21;[class_12];[])
->RefactoringNumber->9313<-DecreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
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
