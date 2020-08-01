->RefactoringNumber->9225<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->9231<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[sequential];[])
->RefactoringNumber->9234<-IncreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[getId])
->RefactoringNumber->9241<-DecreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[getId])
->RefactoringNumber->9262<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[shapes];[])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
