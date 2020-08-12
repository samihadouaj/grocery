->RefactoringNumber->42624<-MoveMethod(org.iselab.grocery.controller.Shapes;org.iselab.grocery.domain.Customer;[];[calculateShape])
->RefactoringNumber->42643<-MoveMethod(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Product;[];[calculateShape])
->RefactoringNumber->42693<-IncreaseFieldSecurity(org.iselab.grocery.domain.Customer;;[product];[])
->RefactoringNumber->42708<-PullUpMethod(org.iselab.grocery.domain.Customer;org.iselab.grocery.domain.Person;[];[calculateShape])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Customer extends Person{

}
