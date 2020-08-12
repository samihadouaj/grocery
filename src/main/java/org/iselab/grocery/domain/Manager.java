->RefactoringNumber->45<-MoveField(Class_3;org.iselab.grocery.domain.Manager;[products];[])
->RefactoringNumber->62<-PullUpMethod(org.iselab.grocery.domain.Manager;org.iselab.grocery.domain.Employee;[];[setProducts])
->RefactoringNumber->134<-IncreaseMethodSecurity(org.iselab.grocery.domain.Manager;;[];[getProducts])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Manager extends Employee {

}
