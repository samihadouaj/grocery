->RefactoringNumber->136<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[input];[])
->RefactoringNumber->141<-IncreaseMethodSecurity(org.iselab.grocery.util.SystemUtils;;[];[printHeader])
->RefactoringNumber->152<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[input];[])
->RefactoringNumber->160<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[input];[])
->RefactoringNumber->170<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[input];[])
->RefactoringNumber->175<-MoveField(org.iselab.grocery.util.SystemUtils;Class_7;[input];[])
->RefactoringNumber->222<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[class_7];[])
->RefactoringNumber->225<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.MainClass;[order];[])
->RefactoringNumber->233<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[mainclass];[])
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
