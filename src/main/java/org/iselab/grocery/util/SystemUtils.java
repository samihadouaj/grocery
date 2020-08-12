->RefactoringNumber->42623<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[input];[])
->RefactoringNumber->42629<-ExtractSuperClass(org.iselab.grocery.util.SystemUtils;Class_6;[];[getIntFromKeyboard])
->RefactoringNumber->42634<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Shapes;[order];[])
->RefactoringNumber->42644<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[shapes];[])
->RefactoringNumber->42654<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.MainClass;[shapes];[])
->RefactoringNumber->42676<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_31;[];[clearScreen|setInput])
->RefactoringNumber->42683<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_36;[];[getInput|getShapes|pressEnterKeyToContinue])
->RefactoringNumber->42690<-PullUpMethod(org.iselab.grocery.util.SystemUtils;Class_6;[];[pressEnterKeyToContinue])
->RefactoringNumber->42691<-PullUpMethod(org.iselab.grocery.util.SystemUtils;Class_6;[];[getInput])
<-endRefactoring marker->
package org.iselab.grocery.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class SystemUtils {

    public static Scanner input = new Scanner(System.in);

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static int getIntFromKeyboard() {
        return input.nextInt();
    }

    public static String getStringFromKeyboard() {
        return input.next();
    }

    public static void pressEnterKeyToContinue() {

        System.out.println();
        System.out.println("Press Enter key to continue...");

        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void closeScanner() {
        input.close();
    }

    public static void printHeader(String... paths) {

        paths = Stream.concat(Arrays.asList("Grocery").stream(), Arrays.stream(paths)).toArray(String[]::new);
        
        int size = 0;

        for (String path : paths) {
            size += path.length();
        }

        size += (paths.length - 1) * 4;

        System.out.println(String.join("", Collections.nCopies(size, "-")));
        
        System.out.println(String.join(" >> ", paths));
        
        System.out.println(String.join("", Collections.nCopies(size, "-")));
    }
}
