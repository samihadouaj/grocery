->RefactoringNumber->26<-ExtractSubClass(org.iselab.grocery.domain.Product;Class_1;[name|price];[])
->RefactoringNumber->27<-PullUpField(Class_1;org.iselab.grocery.domain.Product;[price];[])
->RefactoringNumber->33<-PullUpField(Class_1;org.iselab.grocery.domain.Product;[name];[])
->RefactoringNumber->34<-DecreaseFieldSecurity(org.iselab.grocery.domain.Product;;[name];[])
->RefactoringNumber->41<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[name];[])
->RefactoringNumber->46<-PushDownMethod(org.iselab.grocery.domain.Product;Class_1;[];[getName])
->RefactoringNumber->66<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_16;[price];[getAmount|getId|getPrice])
->RefactoringNumber->69<-ExtractClass(org.iselab.grocery.domain.Product;Class_19;[id];[setAmount])
->RefactoringNumber->74<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_24;[];[setAmount|setId|toString])
->RefactoringNumber->94<-PullUpMethod(Class_1;org.iselab.grocery.domain.Product;[];[getName])
->RefactoringNumber->114<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_45;[amount];[])
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
