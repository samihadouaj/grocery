->RefactoringNumber->72<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->89<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[sequential];[])
->RefactoringNumber->115<-MoveMethod(Class_2;org.iselab.grocery.util.UUIDUtils;[];[setShapes])
->RefactoringNumber->132<-ExtractSubClass(org.iselab.grocery.util.UUIDUtils;Class_36;[];[getId])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
