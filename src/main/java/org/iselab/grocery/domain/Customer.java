->RefactoringNumber->10336<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.domain.Customer;[shapes];[])
->RefactoringNumber->10340<-PullUpField(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[shapes];[])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Customer extends Person{

}
