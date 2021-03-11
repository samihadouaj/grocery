->RefactoringNumber->156<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.domain.Customer;[order];[])
->RefactoringNumber->158<-PullUpField(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[order];[])
->RefactoringNumber->172<-PushDownField(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Customer;[order];[])
->RefactoringNumber->180<-PullUpMethod(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[];[getOrder])
->RefactoringNumber->183<-PushDownField(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Customer;[order];[])
->RefactoringNumber->188<-PullUpMethod(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[];[getOrder])
->RefactoringNumber->191<-PullUpMethod(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[];[setOrder])
->RefactoringNumber->197<-PushDownField(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Customer;[order];[])
->RefactoringNumber->200<-IncreaseFieldSecurity(org.iselab.grocery.domain.Customer;;[order];[])
->RefactoringNumber->223<-PullUpField(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[order];[])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Customer extends Person{

}
