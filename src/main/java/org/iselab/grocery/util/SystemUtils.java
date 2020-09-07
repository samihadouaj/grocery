->RefactoringNumber->36<-MoveMethod(org.iselab.grocery.controller.Order;org.iselab.grocery.util.SystemUtils;[];[calculateTotal])
->RefactoringNumber->44<-ExtractSuperClass(org.iselab.grocery.util.SystemUtils;Class_10;[];[getStringFromKeyboard])
->RefactoringNumber->49<-PullUpMethod(org.iselab.grocery.util.SystemUtils;Class_10;[];[printHeader])
->RefactoringNumber->53<-PullUpMethod(org.iselab.grocery.util.SystemUtils;Class_10;[];[getIntFromKeyboard])
->RefactoringNumber->57<-MoveField(org.iselab.grocery.util.SystemUtils;Class_7;[input];[])
->RefactoringNumber->62<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_13;[];[closeScanner|pressEnterKeyToContinue])
->RefactoringNumber->84<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[class_7];[])
->RefactoringNumber->90<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_34;[];[calculateTotal])
->RefactoringNumber->100<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_13;[];[setInput])
->RefactoringNumber->105<-PushDownField(org.iselab.grocery.util.SystemUtils;Class_13;[order];[])
->RefactoringNumber->109<-PullUpMethod(org.iselab.grocery.util.SystemUtils;Class_10;[];[calculateTotal])
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
