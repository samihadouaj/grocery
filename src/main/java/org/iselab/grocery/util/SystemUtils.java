->RefactoringNumber->11591<-EncapsulateField(org.iselab.grocery.util.SystemUtils;;[input];[])
->RefactoringNumber->11593<-IncreaseMethodSecurity(org.iselab.grocery.util.SystemUtils;;[];[setInput])
->RefactoringNumber->11601<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[input];[])
->RefactoringNumber->11618<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Order;[input];[])
->RefactoringNumber->11620<-MoveMethod(org.iselab.grocery.util.SystemUtils;Class_1;[];[closeScanner])
->RefactoringNumber->11621<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_12;[class_1];[clearScreen|getIntFromKeyboard|pressEnterKeyToContinue])
->RefactoringNumber->11641<-PullUpField(Class_12;org.iselab.grocery.util.SystemUtils;[class_1];[])
->RefactoringNumber->11646<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_25;[];[printHeader])
->RefactoringNumber->11657<-ExtractSuperClass(org.iselab.grocery.util.SystemUtils;Class_36;[];[getStringFromKeyboard])
->RefactoringNumber->11671<-PullUpMethod(org.iselab.grocery.util.SystemUtils;Class_36;[];[setInput])
->RefactoringNumber->11677<-PushDownField(org.iselab.grocery.util.SystemUtils;Class_12;[order];[])
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
