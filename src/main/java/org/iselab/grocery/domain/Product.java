->RefactoringNumber->39<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[amount];[])
->RefactoringNumber->41<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_4;[order|price];[getAmount|getId|setName])
->RefactoringNumber->81<-ExtractClass(org.iselab.grocery.domain.Product;Class_17;[];[getPrice])
->RefactoringNumber->90<-PullUpField(org.iselab.grocery.domain.Product;Class_4;[class_17];[])
->RefactoringNumber->96<-ExtractSubClass(org.iselab.grocery.domain.Product;Class_25;[];[getName|setId|toString])
->RefactoringNumber->103<-PullUpMethod(org.iselab.grocery.domain.Product;Class_4;[];[getPrice])
->RefactoringNumber->115<-PushDownMethod(Class_4;org.iselab.grocery.domain.Product;[];[getAmount])
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
