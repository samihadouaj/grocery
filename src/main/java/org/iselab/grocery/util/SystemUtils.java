->RefactoringNumber->9218<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[input];[])
->RefactoringNumber->9220<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[order];[])
->RefactoringNumber->9240<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_7;[];[clearScreen|closeScanner|getIntFromKeyboard|setInput])
->RefactoringNumber->9251<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_11;[order];[clearScreen])
->RefactoringNumber->9253<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_13;[];[getIntFromKeyboard|pressEnterKeyToContinue])
->RefactoringNumber->9256<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_11;[];[setInput])
->RefactoringNumber->9268<-PullUpField(Class_11;org.iselab.grocery.util.SystemUtils;[order];[])
->RefactoringNumber->9282<-PullUpMethod(Class_11;org.iselab.grocery.util.SystemUtils;[];[clearScreen])
->RefactoringNumber->9286<-MoveField(Class_3;org.iselab.grocery.util.SystemUtils;[class_14];[])
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
