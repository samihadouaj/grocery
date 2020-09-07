->RefactoringNumber->25<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.MainClass;[];[calculateTotal])
->RefactoringNumber->30<-ExtractSuperClass(org.iselab.grocery.MainClass;Class_4;[];[main])
->RefactoringNumber->39<-MoveMethod(org.iselab.grocery.MainClass;org.iselab.grocery.controller.Order;[];[calculateTotal])
->RefactoringNumber->45<-PullUpField(org.iselab.grocery.MainClass;Class_4;[order];[])
->RefactoringNumber->52<-PushDownMethod(Class_4;org.iselab.grocery.MainClass;[];[main])
->RefactoringNumber->54<-ExtractSubClass(org.iselab.grocery.MainClass;Class_12;[];[main])
->RefactoringNumber->61<-MoveField(org.iselab.grocery.controller.Order;org.iselab.grocery.MainClass;[class_3];[])
->RefactoringNumber->63<-PushDownMethod(Class_4;org.iselab.grocery.MainClass;[];[run])
->RefactoringNumber->67<-ExtractSubClass(org.iselab.grocery.MainClass;Class_17;[];[])
->RefactoringNumber->73<-ExtractClass(org.iselab.grocery.MainClass;Class_23;[];[])
->RefactoringNumber->82<-ExtractClass(org.iselab.grocery.MainClass;Class_32;[];[])
->RefactoringNumber->92<-IncreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_23];[])
->RefactoringNumber->95<-DecreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_23];[])
->RefactoringNumber->108<-MoveField(org.iselab.grocery.MainClass;org.iselab.grocery.controller.Order;[class_23];[])
<-endRefactoring marker->
package org.iselab.grocery;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.iselab.grocery.controller.Order;
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

        Order order = new Order();
        System.out.println(order.calculateTotal("US"));
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
