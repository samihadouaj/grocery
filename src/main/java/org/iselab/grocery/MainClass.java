->RefactoringNumber->10284<-ExtractSuperClass(org.iselab.grocery.MainClass;Class_3;[];[run])
->RefactoringNumber->10292<-PushDownMethod(Class_3;org.iselab.grocery.MainClass;[];[showMenu])
->RefactoringNumber->10295<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.MainClass;[sequential];[])
->RefactoringNumber->10299<-MoveField(org.iselab.grocery.MainClass;org.iselab.grocery.domain.Employee;[sequential];[])
->RefactoringNumber->10301<-PullUpField(org.iselab.grocery.MainClass;Class_3;[employee];[])
->RefactoringNumber->10324<-MoveMethod(org.iselab.grocery.controller.Shapes;org.iselab.grocery.MainClass;[];[calculateShape])
->RefactoringNumber->10332<-PullUpMethod(org.iselab.grocery.MainClass;Class_3;[];[run])
->RefactoringNumber->10362<-IncreaseMethodSecurity(org.iselab.grocery.MainClass;;[];[setSequential])
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
