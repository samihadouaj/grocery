->RefactoringNumber->22<-ExtractClass(org.iselab.grocery.MainClass;Class_2;[];[showMenu])
->RefactoringNumber->40<-MoveField(org.iselab.grocery.MainClass;org.iselab.grocery.controller.Shapes;[class_2];[])
->RefactoringNumber->44<-IncreaseFieldSecurity(org.iselab.grocery.MainClass;;[shapes];[])
->RefactoringNumber->62<-ExtractClass(org.iselab.grocery.MainClass;Class_17;[];[main])
->RefactoringNumber->67<-ExtractSubClass(org.iselab.grocery.MainClass;Class_19;[class_17];[run])
->RefactoringNumber->102<-PullUpMethod(Class_19;org.iselab.grocery.MainClass;[];[run])
->RefactoringNumber->104<-ExtractSuperClass(org.iselab.grocery.MainClass;Class_27;[];[run])
->RefactoringNumber->108<-PullUpField(org.iselab.grocery.MainClass;Class_27;[shapes];[])
->RefactoringNumber->119<-PushDownField(Class_27;org.iselab.grocery.MainClass;[product];[])
->RefactoringNumber->131<-PullUpMethod(org.iselab.grocery.MainClass;Class_27;[];[run])
<-endRefactoring marker->
package org.iselab.grocery;

import org.iselab.grocery.controller.ProductController;
import org.iselab.grocery.util.SystemUtils;

public class MainClass {

    public static void main(String[] args) {

        MainClass mainClass = new MainClass();

        mainClass.run();

        SystemUtils.closeScanner();
    }

    public int showMenu() {

        SystemUtils.clearScreen();

        SystemUtils.printHeader();
        
        System.out.println("  [1] Products");
        System.out.println("  [9] Exit");

        System.out.print("Option: ");

        return SystemUtils.getIntFromKeyboard();
    }

    public void run() {
         Shapes shapes = new Shapes();
        int sr = shapes.calculateShape("cercle");
        System.out.println("this is a useless thing for test: "+ sr);

        int option = showMenu();

        while (option != 9) {

            switch (option) {
                case 1:
                    new ProductController().start();
                    break;
                default:
                    break;
            }

            option = showMenu();
        }

        System.out.println("Good bye!");
    }
}
