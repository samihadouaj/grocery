->RefactoringNumber->30<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->35<-DecreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->38<-MoveMethod(org.iselab.grocery.controller.Shapes;org.iselab.grocery.controller.ProductController;[];[calculateShape])
->RefactoringNumber->40<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[sequential];[])
->RefactoringNumber->47<-MoveField(Class_4;org.iselab.grocery.controller.Shapes;[order];[])
->RefactoringNumber->69<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->71<-ExtractSuperClass(org.iselab.grocery.controller.Shapes;Class_13;[productcontroller];[getOrder|setSequential])
->RefactoringNumber->75<-ExtractSubClass(org.iselab.grocery.controller.Shapes;Class_15;[];[calculateShape])
->RefactoringNumber->93<-PushDownField(Class_13;org.iselab.grocery.controller.Shapes;[order];[])
->RefactoringNumber->122<-PushDownField(org.iselab.grocery.controller.Shapes;Class_15;[order];[])
->RefactoringNumber->133<-MoveField(Class_3;org.iselab.grocery.controller.Shapes;[input];[])
->RefactoringNumber->146<-DecreaseFieldSecurity(org.iselab.grocery.controller.Shapes;;[input];[])
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
