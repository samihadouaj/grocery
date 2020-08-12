->RefactoringNumber->26<-ExtractClass(org.iselab.grocery.MainClass;Class_1;[];[showMenu])
->RefactoringNumber->31<-ExtractSubClass(org.iselab.grocery.MainClass;Class_2;[];[main])
->RefactoringNumber->37<-PushDownField(org.iselab.grocery.MainClass;Class_2;[class_1];[])
->RefactoringNumber->48<-PullUpField(Class_2;org.iselab.grocery.MainClass;[class_1];[])
->RefactoringNumber->108<-DecreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_1];[])
->RefactoringNumber->109<-PullUpMethod(Class_2;org.iselab.grocery.MainClass;[];[run])
->RefactoringNumber->116<-IncreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_1];[])
->RefactoringNumber->120<-PushDownField(org.iselab.grocery.MainClass;Class_2;[class_1];[])
->RefactoringNumber->139<-PullUpField(Class_2;org.iselab.grocery.MainClass;[class_1];[])
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
