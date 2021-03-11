->RefactoringNumber->55<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.util.UUIDUtils;[order];[])
->RefactoringNumber->84<-ExtractClass(org.iselab.grocery.util.UUIDUtils;Class_13;[sequential];[getId])
->RefactoringNumber->114<-MoveMethod(org.iselab.grocery.util.UUIDUtils;Class_21;[];[getOrder])
->RefactoringNumber->122<-IncreaseMethodSecurity(org.iselab.grocery.util.UUIDUtils;;[];[setOrder])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
