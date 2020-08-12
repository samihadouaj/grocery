->RefactoringNumber->42615<-MoveMethod(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Shapes;[];[getName])
->RefactoringNumber->42619<-MoveField(org.iselab.grocery.domain.Product;org.iselab.grocery.controller.Shapes;[name];[])
->RefactoringNumber->42624<-MoveMethod(org.iselab.grocery.controller.Shapes;org.iselab.grocery.domain.Customer;[];[calculateShape])
->RefactoringNumber->42631<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->42632<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->42634<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Shapes;[order];[])
->RefactoringNumber->42638<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.controller.Shapes;[];[calculateTotal])
->RefactoringNumber->42641<-DecreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->42645<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->42646<-ExtractClass(org.iselab.grocery.controller.Shapes;Class_13;[order];[calculateTotal|getName])
->RefactoringNumber->42649<-DecreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->42656<-IncreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->42669<-DecreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->42670<-DecreaseMethodSecurity(org.iselab.grocery.controller.Shapes;;[];[calculateShape])
->RefactoringNumber->42671<-ExtractSuperClass(org.iselab.grocery.controller.Shapes;Class_29;[];[calculateShape])
->RefactoringNumber->42673<-MoveMethod(org.iselab.grocery.controller.ProductController;org.iselab.grocery.controller.Shapes;[];[print])
->RefactoringNumber->42696<-ExtractSubClass(org.iselab.grocery.controller.Shapes;Class_39;[class_13];[setOrder])
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
