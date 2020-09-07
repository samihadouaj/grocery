->RefactoringNumber->58<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Order;[sequential];[])
->RefactoringNumber->83<-MoveField(org.iselab.grocery.util.UUIDUtils;Class_5;[order];[])
->RefactoringNumber->97<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Order;[class_5];[])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
