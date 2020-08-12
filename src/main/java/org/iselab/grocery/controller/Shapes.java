->RefactoringNumber->52779<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->52783<-MoveMethod(org.iselab.grocery.controller.Shapes;Class_2;[];[calculateShape])
->RefactoringNumber->52788<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->52816<-MoveMethod(org.iselab.grocery.controller.Shapes;Class_7;[];[calculateShape])
->RefactoringNumber->52817<-MoveField(org.iselab.grocery.controller.Shapes;Class_8;[class_7];[])
->RefactoringNumber->52821<-DecreaseFieldSecurity(org.iselab.grocery.controller.Shapes;;[class_8];[])
->RefactoringNumber->52839<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[sequential];[])
->RefactoringNumber->52850<-ExtractSuperClass(org.iselab.grocery.controller.Shapes;Class_25;[class_2];[setSequential])
->RefactoringNumber->52851<-ExtractSubClass(org.iselab.grocery.controller.Shapes;Class_26;[];[calculateShape])
->RefactoringNumber->52863<-PullUpField(org.iselab.grocery.controller.Shapes;Class_25;[class_8];[])
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
