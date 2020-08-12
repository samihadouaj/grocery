->RefactoringNumber->10299<-MoveField(org.iselab.grocery.MainClass;org.iselab.grocery.domain.Employee;[sequential];[])
->RefactoringNumber->10303<-PullUpField(org.iselab.grocery.domain.Employee;org.iselab.grocery.domain.Person;[sequential];[])
->RefactoringNumber->10305<-PushDownField(org.iselab.grocery.domain.Person;org.iselab.grocery.domain.Employee;[sequential];[])
->RefactoringNumber->10322<-DecreaseFieldSecurity(org.iselab.grocery.domain.Employee;;[sequential];[])
->RefactoringNumber->10365<-IncreaseFieldSecurity(org.iselab.grocery.domain.Employee;;[sequential];[])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Employee extends Person{

}
