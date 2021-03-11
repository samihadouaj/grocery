->RefactoringNumber->26<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->27<-MoveField(org.iselab.grocery.MainClass;org.iselab.grocery.controller.Order;[class_1];[])
->RefactoringNumber->28<-DecreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[calculateTotal])
->RefactoringNumber->29<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.controller.Shapes;[];[calculateTotal])
->RefactoringNumber->30<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_2;[];[add])
->RefactoringNumber->31<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->32<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_3;[];[calculateTotal])
->RefactoringNumber->33<-PullUpField(org.iselab.grocery.controller.Order;Class_3;[products];[])
->RefactoringNumber->35<-MoveField(org.iselab.grocery.controller.Order;org.iselab.grocery.MainClass;[class_1];[])
->RefactoringNumber->36<-PullUpMethod(org.iselab.grocery.controller.Order;Class_3;[];[getProducts])
->RefactoringNumber->37<-PullUpMethod(Class_2;org.iselab.grocery.controller.Order;[];[add])
->RefactoringNumber->40<-PushDownField(Class_3;org.iselab.grocery.controller.Order;[products];[])
->RefactoringNumber->42<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_4;[];[])
->RefactoringNumber->44<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_6;[];[])
->RefactoringNumber->46<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.repository.ProductRepository;[];[add])
->RefactoringNumber->47<-IncreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[add])
->RefactoringNumber->49<-PullUpMethod(org.iselab.grocery.controller.Order;Class_3;[];[getClass_1])
->RefactoringNumber->51<-DecreaseMethodSecurity(org.iselab.grocery.controller.Order;;[];[add])
->RefactoringNumber->52<-PushDownField(org.iselab.grocery.controller.Order;Class_2;[mainclass];[])
->RefactoringNumber->58<-PullUpMethod(org.iselab.grocery.controller.Order;Class_3;[];[add])
->RefactoringNumber->60<-PushDownMethod(org.iselab.grocery.controller.Order;Class_2;[];[setProducts])
->RefactoringNumber->61<-MoveField(Class_1;org.iselab.grocery.controller.Order;[shapes];[])
->RefactoringNumber->64<-PushDownMethod(org.iselab.grocery.controller.Order;Class_2;[];[getShapes])
->RefactoringNumber->67<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_9;[];[])
->RefactoringNumber->71<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_11;[];[])
->RefactoringNumber->80<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_12;[];[])
->RefactoringNumber->83<-PullUpField(org.iselab.grocery.controller.Order;Class_12;[products];[])
->RefactoringNumber->85<-PushDownField(org.iselab.grocery.controller.Order;Class_4;[shapes];[])
->RefactoringNumber->86<-PullUpField(Class_2;org.iselab.grocery.controller.Order;[mainclass];[])
->RefactoringNumber->89<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_14;[];[])
->RefactoringNumber->90<-PullUpMethod(Class_2;org.iselab.grocery.controller.Order;[];[getShapes])
->RefactoringNumber->91<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_15;[];[])
->RefactoringNumber->92<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[name];[])
->RefactoringNumber->95<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_17;[];[])
->RefactoringNumber->97<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_19;[];[])
->RefactoringNumber->98<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_20;[];[])
->RefactoringNumber->99<-ExtractClass(org.iselab.grocery.controller.Order;Class_21;[];[])
->RefactoringNumber->100<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_22;[];[])
->RefactoringNumber->101<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_23;[];[])
->RefactoringNumber->102<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_24;[];[])
->RefactoringNumber->103<-ExtractSubClass(org.iselab.grocery.controller.Order;Class_25;[];[])
->RefactoringNumber->104<-ExtractClass(org.iselab.grocery.controller.Order;Class_26;[];[])
->RefactoringNumber->105<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_27;[];[])
->RefactoringNumber->106<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_28;[];[])
->RefactoringNumber->107<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_29;[];[])
->RefactoringNumber->108<-ExtractSuperClass(org.iselab.grocery.controller.Order;Class_30;[];[])
->RefactoringNumber->109<-PushDownField(org.iselab.grocery.controller.Order;Class_24;[class_21];[])
->RefactoringNumber->113<-PushDownMethod(org.iselab.grocery.controller.Order;Class_17;[];[setClass_1])
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
