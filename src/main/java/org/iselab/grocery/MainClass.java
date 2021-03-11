->RefactoringNumber->11597<-ExtractSubClass(org.iselab.grocery.MainClass;Class_4;[];[run])
->RefactoringNumber->11598<-PushDownMethod(org.iselab.grocery.MainClass;Class_4;[];[showMenu])
->RefactoringNumber->11640<-PullUpMethod(Class_4;org.iselab.grocery.MainClass;[];[main])
->RefactoringNumber->11673<-MoveField(org.iselab.grocery.repository.ProductRepository;org.iselab.grocery.MainClass;[order];[])
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
