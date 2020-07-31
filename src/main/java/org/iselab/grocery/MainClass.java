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
    public boolean msmsms(int a, int b) {
    if(a > b) {
        return true;
    } else if (a == b) {
        return false;
    } else {
        return false;
    }
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
