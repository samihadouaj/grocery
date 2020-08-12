->RefactoringNumber->42620<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->42622<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.domain.Product;[];[calculateTotal])
->RefactoringNumber->42623<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[input];[])
->RefactoringNumber->42627<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[amount];[])
->RefactoringNumber->42637<-DecreaseFieldSecurity(org.iselab.grocery.controller.Order;;[product];[])
->RefactoringNumber->42638<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.controller.Shapes;[];[calculateTotal])
->RefactoringNumber->42647<-IncreaseFieldSecurity(org.iselab.grocery.controller.Order;;[shapes];[])
->RefactoringNumber->42652<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->42653<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_17;[shapes];[calculateTotal|setAmount|setInput])
->RefactoringNumber->42665<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_25;[];[])
->RefactoringNumber->42692<-PullUpMethod(org.iselab.grocery.controller.Order;Class_17;[];[getInput])
->RefactoringNumber->42711<-PullUpField(org.iselab.grocery.controller.Order;Class_17;[product];[])
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
