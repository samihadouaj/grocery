->RefactoringNumber->10282<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->10285<-MoveMethod(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Shapes;[];[save])
->RefactoringNumber->10324<-MoveMethod(org.iselab.grocery.controller.Shapes;org.iselab.grocery.MainClass;[];[calculateShape])
->RefactoringNumber->10328<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.controller.Shapes;[input];[])
->RefactoringNumber->10330<-MoveMethod(org.iselab.grocery.controller.Shapes;Class_11;[];[calculateShape])
->RefactoringNumber->10344<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->10345<-MoveMethod(org.iselab.grocery.controller.Shapes;org.iselab.grocery.controller.ProductController;[];[calculateShape])
->RefactoringNumber->10353<-DecreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->10355<-MoveMethod(org.iselab.grocery.controller.Shapes;Class_2;[];[calculateShape])
->RefactoringNumber->10366<-ExtractSubClass(org.iselab.grocery.controller.Shapes;Class_18;[class_2];[save|setInput])
->RefactoringNumber->10375<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[mainclass];[])
<-endRefactoring marker->
package org.iselab.grocery.controller;

public class Shapes {

	public int calculateShape(String shape) {
        switch (shape) {
            case "circle":

                System.out.println("area is blab;la");
                break;
            case "rectangle":
                System.out.println("area is fsadfa;la");
                break;
            case "TRIANGLE":
                System.out.println("area is FDSAASF;la");
                break;
            case "ellipse":
                System.out.println("area is gdsadfsa;la");
                break;
            default:
                return 5;
        }
		return 0;

	}


}
