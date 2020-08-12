->RefactoringNumber->10279<-IncreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[getId])
->RefactoringNumber->10295<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.MainClass;[sequential];[])
->RefactoringNumber->10302<-IncreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[mainclass];[])
->RefactoringNumber->10304<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[mainclass];[])
->RefactoringNumber->10312<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[mainclass];[])
->RefactoringNumber->10350<-IncreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[getId])
->RefactoringNumber->10375<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[mainclass];[])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
