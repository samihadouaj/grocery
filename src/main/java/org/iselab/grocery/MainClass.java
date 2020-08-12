->RefactoringNumber->52774<-ExtractSubClass(org.iselab.grocery.MainClass;Class_2;[];[run])
->RefactoringNumber->52793<-MoveMethod(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.MainClass;[];[closeScanner])
->RefactoringNumber->52797<-PushDownMethod(org.iselab.grocery.MainClass;Class_2;[];[closeScanner])
->RefactoringNumber->52813<-PullUpMethod(Class_2;org.iselab.grocery.MainClass;[];[run])
->RefactoringNumber->52829<-ExtractClass(org.iselab.grocery.MainClass;Class_19;[];[showMenu])
->RefactoringNumber->52831<-PullUpField(Class_2;org.iselab.grocery.MainClass;[class_9];[])
->RefactoringNumber->52834<-PullUpMethod(Class_2;org.iselab.grocery.MainClass;[];[main])
->RefactoringNumber->52857<-IncreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_19];[])
->RefactoringNumber->52858<-ExtractSuperClass(org.iselab.grocery.MainClass;Class_29;[class_19];[showMenu])
->RefactoringNumber->52872<-DecreaseFieldSecurity(org.iselab.grocery.MainClass;;[class_9];[])
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
