->RefactoringNumber->11583<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->11599<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->11612<-IncreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[getId])
->RefactoringNumber->11668<-IncreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->11670<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->11672<-IncreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
