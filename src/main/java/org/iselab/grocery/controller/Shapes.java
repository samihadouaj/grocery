->RefactoringNumber->29<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.controller.Shapes;[];[calculateTotal])
->RefactoringNumber->69<-ExtractSubClass(org.iselab.grocery.controller.Shapes;Class_10;[];[calculateTotal])
->RefactoringNumber->81<-PushDownMethod(org.iselab.grocery.controller.Shapes;Class_10;[];[calculateShape])
->RefactoringNumber->123<-PullUpMethod(Class_10;org.iselab.grocery.controller.Shapes;[];[calculateShape])
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
