->RefactoringNumber->147<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Order;[sequential];[])
->RefactoringNumber->156<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.domain.Customer;[order];[])
->RefactoringNumber->157<-IncreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[customer];[])
->RefactoringNumber->161<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Order;[customer];[])
->RefactoringNumber->166<-IncreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[getId])
->RefactoringNumber->176<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[order];[])
->RefactoringNumber->182<-EncapsulateField(org.iselab.grocery.util.UUIDUtils;;[order];[])
->RefactoringNumber->192<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[order];[])
->RefactoringNumber->202<-ExtractSubClass(org.iselab.grocery.util.UUIDUtils;Class_17;[];[getId])
->RefactoringNumber->209<-PullUpMethod(Class_17;org.iselab.grocery.util.UUIDUtils;[];[getId])
->RefactoringNumber->210<-PushDownMethod(org.iselab.grocery.util.UUIDUtils;Class_17;[];[setOrder])
->RefactoringNumber->212<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[order];[])
->RefactoringNumber->213<-PushDownMethod(org.iselab.grocery.util.UUIDUtils;Class_17;[];[getId])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
