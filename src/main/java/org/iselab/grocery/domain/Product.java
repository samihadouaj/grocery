->RefactoringNumber->42615<-MoveMethod(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Shapes;[];[getName])
->RefactoringNumber->42619<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Shapes;[name];[])
->RefactoringNumber->42622<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.domain.Product;[];[calculateTotal])
->RefactoringNumber->42627<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Order;[amount];[])
->RefactoringNumber->42639<-ExtractSubClass(org.iselab.grocery.domain.Product;Class_11;[order|shapes];[calculateTotal|getAmount])
->RefactoringNumber->42640<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_12;[price];[setName])
->RefactoringNumber->42642<-DecreaseFieldSecurity(org.iselab.grocery.domain.Product;;[id];[])
->RefactoringNumber->42643<-MoveMethod(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Product;[];[calculateShape])
->RefactoringNumber->42664<-ExtractClass(org.iselab.grocery.domain.Product;Class_24;[];[])
->RefactoringNumber->42687<-PushDownField(org.iselab.grocery.domain.Product;Class_11;[id];[])
->RefactoringNumber->42697<-PushDownMethod(Class_12;org.iselab.grocery.domain.Product;[];[setName])
->RefactoringNumber->42704<-PullUpMethod(org.iselab.grocery.domain.Product;Class_12;[];[setAmount])
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
