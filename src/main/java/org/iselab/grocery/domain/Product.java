->RefactoringNumber->27<-ExtractSuperClass(org.iselab.grocery.domain.Product;Class_5;[name];[getAmount|setId|toString])
->RefactoringNumber->29<-PullUpMethod(org.iselab.grocery.domain.Product;Class_5;[];[setAmount])
->RefactoringNumber->31<-ExtractSubClass(org.iselab.grocery.domain.Product;Class_6;[];[getId])
->RefactoringNumber->37<-PullUpMethod(Class_6;org.iselab.grocery.domain.Product;[];[getId])
->RefactoringNumber->64<-MoveMethod(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Shapes;[];[getName])
->RefactoringNumber->65<-PullUpField(org.iselab.grocery.domain.Product;Class_5;[shapes];[])
->RefactoringNumber->76<-PushDownField(Class_5;org.iselab.grocery.domain.Product;[shapes];[])
->RefactoringNumber->77<-IncreaseMethodSecurity(org.iselab.grocery.domain.Product;;[];[setName])
->RefactoringNumber->88<-ExtractClass(org.iselab.grocery.domain.Product;Class_24;[];[setName])
->RefactoringNumber->110<-MoveMethod(Class_27;org.iselab.grocery.domain.Product;[];[run])
->RefactoringNumber->134<-EncapsulateField(org.iselab.grocery.domain.Product;;[shapes];[])
->RefactoringNumber->138<-PushDownField(org.iselab.grocery.domain.Product;Class_6;[shapes];[])
->RefactoringNumber->149<-PullUpField(Class_6;org.iselab.grocery.domain.Product;[shapes];[])
<-endRefactoring marker->
package org.iselab.grocery.domain;

import org.iselab.grocery.util.UUIDUtils;

public class Product {

    private int id;

    private String name;

    private int amount;

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
        builder.append("}");
        
        return builder.toString();
    }
}
