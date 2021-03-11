->RefactoringNumber->11605<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_6;[id|name];[getAmount|getId|getName|toString])
->RefactoringNumber->11606<-PullUpMethod(org.iselab.grocery.domain.Product;Class_6;[];[setName])
->RefactoringNumber->11607<-PushDownField(Class_6;org.iselab.grocery.domain.Product;[id];[])
->RefactoringNumber->11608<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[id];[])
->RefactoringNumber->11611<-PushDownField(Class_6;org.iselab.grocery.domain.Product;[name];[])
->RefactoringNumber->11617<-PullUpMethod(org.iselab.grocery.domain.Product;Class_6;[];[setPrice])
->RefactoringNumber->11619<-DecreaseFieldSecurity(org.iselab.grocery.domain.Product;;[amount];[])
->RefactoringNumber->11629<-PushDownField(Class_6;org.iselab.grocery.domain.Product;[price];[])
->RefactoringNumber->11631<-ExtractSubClass(org.iselab.grocery.domain.Product;Class_17;[name];[])
->RefactoringNumber->11659<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_38;[];[])
->RefactoringNumber->11664<-PullUpMethod(Class_17;org.iselab.grocery.domain.Product;[];[setName])
->RefactoringNumber->11678<-PullUpMethod(org.iselab.grocery.domain.Product;Class_38;[];[getPrice])
<-endRefactoring marker->
package org.iselab.grocery.domain;

import org.iselab.grocery.util.UUIDUtils;

public class Product {

    private int id;

    private String name;

    private int amount;

    private int price;

    public int getPrice() {
        return price;
    }

    public Product(int id, String name, int amount, int price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product() {
        this.id = UUIDUtils.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append("{");
        builder.append("id: ").append(id).append(", ");
        builder.append("name: \"").append(name).append("\", ");
        builder.append("amount: ").append(amount);
        builder.append("price: ").append(price);
        builder.append("}");

        return builder.toString();
    }
}
