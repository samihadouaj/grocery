->RefactoringNumber->9231<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.controller.Shapes;[sequential];[])accepted
->RefactoringNumber->9247<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[getSequential])accepted
->RefactoringNumber->9248<-DecreaseFieldSecurity(org.iselab.grocery.controller.Shapes;;[sequential];[])accepted
->RefactoringNumber->9261<-MoveMethod(org.iselab.grocery.controller.Shapes;org.iselab.grocery.controller.Order;[];[calculateShape])accepted
->RefactoringNumber->9273<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[setSequential])accepted
->RefactoringNumber->9281<-MoveMethod(org.iselab.grocery.controller.Shapes;Class_10;[];[calculateShape])accepted
->RefactoringNumber->9290<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])accepted
->RefactoringNumber->9293<-DecreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])accepted
->RefactoringNumber->9294<-MoveField(org.iselab.grocery.controller.ProductController;org.iselab.grocery.controller.Shapes;[class_4];[])accepted
->RefactoringNumber->9297<-ExtractSuperClass(org.iselab.grocery.controller.Shapes;Class_23;[order|sequential];[calculateShape|setSequential])accepted
->RefactoringNumber->9300<-PullUpField(org.iselab.grocery.controller.Shapes;Class_23;[class_4];[])accepted
->RefactoringNumber->9309<-ExtractSubClass(org.iselab.grocery.controller.Shapes;Class_29;[];[setClass_4])accepted
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
