->RefactoringNumber->11600<-MoveField(org.iselab.grocery.controller.ProductController;org.iselab.grocery.domain.Employee;[productRepository];[])
->RefactoringNumber->11602<-PushDownMethod(org.iselab.grocery.domain.Employee;org.iselab.grocery.domain.Manager;[];[getProductRepository])
->RefactoringNumber->11604<-PullUpField(org.iselab.grocery.domain.Employee;org.iselab.grocery.domain.Person;[productRepository];[])
->RefactoringNumber->11676<-PullUpMethod(org.iselab.grocery.domain.Employee;org.iselab.grocery.domain.Person;[];[setProductRepository])
->RefactoringNumber->11679<-PullUpMethod(org.iselab.grocery.domain.Manager;org.iselab.grocery.domain.Employee;[];[getProductRepository])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Employee extends Person{

}
