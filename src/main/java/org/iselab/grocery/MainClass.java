->RefactoringNumber->42617<-ExtractClass(org.iselab.grocery.MainClass;Class_1;[];[run])
->RefactoringNumber->42654<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.MainClass;[shapes];[])
->RefactoringNumber->42659<-DecreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_1];[])
->RefactoringNumber->42668<-ExtractSubClass(org.iselab.grocery.MainClass;Class_28;[];[])
->RefactoringNumber->42695<-MoveField(org.iselab.grocery.MainClass;Class_29;[class_1];[])
->RefactoringNumber->42709<-PushDownField(org.iselab.grocery.MainClass;Class_28;[class_29];[])
->RefactoringNumber->42712<-PullUpField(Class_28;org.iselab.grocery.MainClass;[class_29];[])
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
