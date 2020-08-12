->RefactoringNumber->42616<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->42625<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
