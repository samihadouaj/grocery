->RefactoringNumber->9235<-ExtractSubClass(org.iselab.grocery.MainClass;Class_5;[];[run])accepted
->RefactoringNumber->9269<-PullUpField(Class_5;org.iselab.grocery.MainClass;[class_16];[])accepted
->RefactoringNumber->9291<-PushDownMethod(org.iselab.grocery.MainClass;Class_5;[];[showMenu])accepted
->RefactoringNumber->9302<-IncreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_16];[])accepted
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
