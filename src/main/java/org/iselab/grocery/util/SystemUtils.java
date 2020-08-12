->RefactoringNumber->10283<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.repository.ProductRepository;[input];[])
->RefactoringNumber->10291<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[productrepository];[])
->RefactoringNumber->10298<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[productrepository];[])
->RefactoringNumber->10310<-ExtractSuperClass(org.iselab.grocery.util.SystemUtils;Class_9;[];[getStringFromKeyboard|pressEnterKeyToContinue])
->RefactoringNumber->10314<-PushDownMethod(Class_9;org.iselab.grocery.util.SystemUtils;[];[pressEnterKeyToContinue])
->RefactoringNumber->10317<-PullUpMethod(org.iselab.grocery.util.SystemUtils;Class_9;[];[printHeader])
->RefactoringNumber->10318<-PullUpField(org.iselab.grocery.util.SystemUtils;Class_9;[productrepository];[])
->RefactoringNumber->10326<-IncreaseMethodSecurity(org.iselab.grocery.util.SystemUtils;;[];[pressEnterKeyToContinue])
->RefactoringNumber->10331<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_12;[];[getInput|getIntFromKeyboard|pressEnterKeyToContinue])
->RefactoringNumber->10346<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_12;[];[closeScanner])
->RefactoringNumber->10358<-PullUpField(Class_12;org.iselab.grocery.util.SystemUtils;[class_1];[])
->RefactoringNumber->10361<-PushDownMethod(Class_9;org.iselab.grocery.util.SystemUtils;[];[printHeader])
->RefactoringNumber->10372<-PushDownField(org.iselab.grocery.util.SystemUtils;Class_12;[class_1];[])
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
