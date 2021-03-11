->RefactoringNumber->137<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[add])
->RefactoringNumber->138<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.MainClass;[];[add])
->RefactoringNumber->140<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_2;[];[calculateTotal])
->RefactoringNumber->142<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[add])
->RefactoringNumber->143<-DecreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[add])
->RefactoringNumber->147<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Order;[sequential];[])
->RefactoringNumber->148<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[amount];[])
->RefactoringNumber->153<-DecreaseFieldSecurity(org.iselab.grocery.controller.Order;;[mainclass];[])
->RefactoringNumber->155<-ExtractClass(org.iselab.grocery.controller.Order;Class_4;[];[add])
->RefactoringNumber->159<-ExtractClass(org.iselab.grocery.controller.Order;Class_5;[];[])
->RefactoringNumber->161<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Order;[customer];[])
->RefactoringNumber->162<-ExtractClass(org.iselab.grocery.controller.Order;Class_6;[];[])
->RefactoringNumber->163<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_7;[];[add])
->RefactoringNumber->169<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_9;[];[])
->RefactoringNumber->171<-PullUpMethod(Class_7;org.iselab.grocery.controller.Order;[];[add])
->RefactoringNumber->174<-ExtractClass(org.iselab.grocery.controller.Order;Class_10;[];[])
->RefactoringNumber->177<-PullUpField(Class_7;org.iselab.grocery.controller.Order;[input];[])
->RefactoringNumber->178<-PushDownField(org.iselab.grocery.controller.Order;Class_7;[amount];[])
->RefactoringNumber->179<-PushDownMethod(org.iselab.grocery.controller.Order;Class_9;[];[getSequential])
->RefactoringNumber->181<-ExtractClass(org.iselab.grocery.controller.Order;Class_11;[input];[setSequential])
->RefactoringNumber->186<-ExtractClass(org.iselab.grocery.controller.Order;Class_13;[];[add])
->RefactoringNumber->193<-ExtractClass(org.iselab.grocery.controller.Order;Class_15;[];[])
->RefactoringNumber->194<-PushDownField(org.iselab.grocery.controller.Order;Class_7;[class_6];[])
->RefactoringNumber->203<-DecreaseFieldSecurity(org.iselab.grocery.controller.Order;;[class_13];[])
->RefactoringNumber->204<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.controller.Shapes;[];[add])
->RefactoringNumber->207<-PullUpMethod(Class_7;org.iselab.grocery.controller.Order;[];[setInput])
->RefactoringNumber->208<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[add])
->RefactoringNumber->211<-PushDownField(org.iselab.grocery.controller.Order;Class_2;[class_5];[])
->RefactoringNumber->217<-PullUpField(Class_7;org.iselab.grocery.controller.Order;[class_6];[])
->RefactoringNumber->218<-ExtractClass(org.iselab.grocery.controller.Order;Class_18;[];[add])
->RefactoringNumber->219<-PushDownField(org.iselab.grocery.controller.Order;Class_7;[class_4];[])
->RefactoringNumber->220<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_19;[];[add])
->RefactoringNumber->222<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[class_7];[])
->RefactoringNumber->226<-ExtractClass(org.iselab.grocery.controller.Order;Class_20;[];[])
->RefactoringNumber->229<-MoveField(org.iselab.grocery.controller.ProductController;org.iselab.grocery.controller.Order;[productRepository];[])
->RefactoringNumber->230<-ExtractClass(org.iselab.grocery.controller.Order;Class_21;[class_10|class_15|sequential|shapes];[getClass_7|getCustomer|getProductRepository|setCustomer])
->RefactoringNumber->231<-PullUpMethod(Class_9;org.iselab.grocery.controller.Order;[];[getSequential])
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
