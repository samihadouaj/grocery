->RefactoringNumber->25<-ExtractClass(org.iselab.grocery.MainClass;Class_1;[];[run])
->RefactoringNumber->27<-MoveField(org.iselab.grocery.MainClass;org.iselab.grocery.controller.Order;[class_1];[])
->RefactoringNumber->35<-MoveField(org.iselab.grocery.controller.Order;org.iselab.grocery.MainClass;[class_1];[])
->RefactoringNumber->43<-ExtractClass(org.iselab.grocery.MainClass;Class_5;[order];[showMenu])
->RefactoringNumber->75<-DecreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_1];[])
->RefactoringNumber->94<-IncreaseMethodSecurity(org.iselab.grocery.MainClass;;[];[showMenu])
->RefactoringNumber->117<-IncreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_5];[])
->RefactoringNumber->120<-EncapsulateField(org.iselab.grocery.MainClass;;[class_1];[])
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
