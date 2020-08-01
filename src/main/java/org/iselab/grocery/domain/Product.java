->RefactoringNumber->9217<-DecreaseFieldSecurity(org.iselab.grocery.domain.Product;;[price];[])
->RefactoringNumber->9221<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_2;[id];[setId])
->RefactoringNumber->9222<-PushDownField(Class_2;org.iselab.grocery.domain.Product;[id];[])
->RefactoringNumber->9223<-PullUpField(org.iselab.grocery.domain.Product;Class_2;[id];[])
->RefactoringNumber->9232<-PullUpField(org.iselab.grocery.domain.Product;Class_2;[amount];[])
->RefactoringNumber->9246<-PullUpField(org.iselab.grocery.domain.Product;Class_2;[name];[])
->RefactoringNumber->9258<-PullUpField(org.iselab.grocery.domain.Product;Class_2;[price];[])
->RefactoringNumber->9301<-MoveMethod(Class_13;org.iselab.grocery.domain.Product;[];[getIntFromKeyboard])
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
