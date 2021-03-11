->RefactoringNumber->11602<-PushDownMethod(org.iselab.grocery.domain.Employee;org.iselab.grocery.domain.Manager;[];[getProductRepository])
->RefactoringNumber->11679<-PullUpMethod(org.iselab.grocery.domain.Manager;org.iselab.grocery.domain.Employee;[];[getProductRepository])
<-endRefactoring marker->
package org.iselab.grocery.domain;

public class Manager extends Employee {

}
