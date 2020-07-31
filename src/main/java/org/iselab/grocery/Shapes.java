->RefactoringNumber->23<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->26<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Shapes;[input];[])
->RefactoringNumber->28<-MoveMethod(org.iselab.grocery.controller.Shapes;Class_5;[];[calculateShape])
->RefactoringNumber->30<-MoveField(org.iselab.grocery.controller.ProductController;org.iselab.grocery.controller.Shapes;[productRepository];[])
->RefactoringNumber->35<-ExtractSubClass(org.iselab.grocery.controller.Shapes;Class_9;[class_5];[setInput])
->RefactoringNumber->40<-MoveField(org.iselab.grocery.MainClass;org.iselab.grocery.controller.Shapes;[class_2];[])
->RefactoringNumber->41<-ExtractClass(org.iselab.grocery.controller.Shapes;Class_11;[productRepository];[getClass_2])
->RefactoringNumber->42<-PushDownMethod(org.iselab.grocery.controller.Shapes;Class_9;[];[getInput])
->RefactoringNumber->49<-PullUpField(Class_9;org.iselab.grocery.controller.Shapes;[class_5];[])
->RefactoringNumber->61<-PushDownMethod(org.iselab.grocery.controller.Shapes;Class_9;[];[setProductRepository])
->RefactoringNumber->64<-MoveMethod(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Shapes;[];[getName])
->RefactoringNumber->79<-MoveMethod(Class_13;org.iselab.grocery.controller.Shapes;[];[save])
->RefactoringNumber->87<-MoveMethod(Class_5;org.iselab.grocery.controller.Shapes;[];[getAmount])
->RefactoringNumber->89<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[sequential];[])
->RefactoringNumber->93<-MoveMethod(Class_13;org.iselab.grocery.controller.Shapes;[];[findAll])
->RefactoringNumber->98<-MoveMethod(Class_25;org.iselab.grocery.controller.Shapes;[];[setId])
->RefactoringNumber->107<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Shapes;[class_2];[])
->RefactoringNumber->116<-MoveField(Class_2;org.iselab.grocery.controller.Shapes;[uuidutils];[])
->RefactoringNumber->122<-MoveField(Class_11;org.iselab.grocery.controller.Shapes;[productRepository];[])
->RefactoringNumber->129<-PushDownField(org.iselab.grocery.controller.Shapes;Class_9;[input];[])
->RefactoringNumber->139<-PushDownMethod(org.iselab.grocery.controller.Shapes;Class_9;[];[getProductRepository])
->RefactoringNumber->145<-MoveMethod(org.iselab.grocery.controller.ProductController;org.iselab.grocery.controller.Shapes;[];[print])
<-endRefactoring marker->
package org.iselab.grocery.controller;

public class Shapes {
	public int calculateShape(String shape) {
		if(shape =="cercle") {
			System.out.println("area is blab;la");
		}
		else if(shape =="rectangle") {
			System.out.println("area is fsadfa;la");
		}
		
		else if(shape =="TRIANGLE") {
			System.out.println("area is FDSAASF;la");
		}
		
		else if(shape =="ellipse") {
			System.out.println("area is gdsadfsa;la");
		}
		else {
			return 5;
		}
		return 0;
		
	}
	

}
