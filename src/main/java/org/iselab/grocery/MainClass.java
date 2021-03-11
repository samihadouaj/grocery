->RefactoringNumber->138<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.MainClass;[];[add])
->RefactoringNumber->151<-ExtractSubClass(org.iselab.grocery.MainClass;Class_3;[];[add])
->RefactoringNumber->165<-PullUpMethod(Class_3;org.iselab.grocery.MainClass;[];[add])
->RefactoringNumber->214<-PushDownMethod(org.iselab.grocery.MainClass;Class_3;[];[add])
->RefactoringNumber->221<-PushDownMethod(org.iselab.grocery.MainClass;Class_3;[];[run])
->RefactoringNumber->225<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.MainClass;[order];[])
->RefactoringNumber->227<-IncreaseFieldSecurity(org.iselab.grocery.MainClass;;[order];[])
->RefactoringNumber->228<-DecreaseFieldSecurity(org.iselab.grocery.MainClass;;[order];[])
->RefactoringNumber->232<-DecreaseFieldSecurity(org.iselab.grocery.MainClass;;[order];[])
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
