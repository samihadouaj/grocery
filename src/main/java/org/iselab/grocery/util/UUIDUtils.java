->RefactoringNumber->52781<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->52794<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->52806<-MoveMethod(Class_3;org.iselab.grocery.util.UUIDUtils;[];[printHeader])
->RefactoringNumber->52818<-ExtractSuperClass(org.iselab.grocery.util.UUIDUtils;Class_15;[];[getId])
->RefactoringNumber->52838<-EncapsulateField(org.iselab.grocery.util.UUIDUtils;;[sequential];[])
->RefactoringNumber->52839<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[sequential];[])
->RefactoringNumber->52847<-ExtractClass(org.iselab.grocery.util.UUIDUtils;Class_24;[];[setSequential])
->RefactoringNumber->52848<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.util.SystemUtils;[class_24];[])
->RefactoringNumber->52859<-DecreaseFieldSecurity(org.iselab.grocery.util.UUIDUtils;;[systemutils];[])
<-endRefactoring marker->
package org.iselab.grocery.util;

public class UUIDUtils {

	private static int sequential = 1;

	public static int getId() {
		return sequential++;
	}
}
