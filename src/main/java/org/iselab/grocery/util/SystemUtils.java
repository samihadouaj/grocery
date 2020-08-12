->RefactoringNumber->29<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[input];[])
->RefactoringNumber->33<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[input];[])
->RefactoringNumber->46<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_6;[];[closeScanner])
->RefactoringNumber->52<-PullUpMethod(Class_6;org.iselab.grocery.util.SystemUtils;[];[closeScanner])
->RefactoringNumber->53<-PushDownField(org.iselab.grocery.util.SystemUtils;Class_6;[input];[])
->RefactoringNumber->56<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_6;[];[getIntFromKeyboard])
->RefactoringNumber->61<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_9;[];[getStringFromKeyboard|printHeader])
->RefactoringNumber->63<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_10;[];[closeScanner])
->RefactoringNumber->66<-PullUpField(Class_6;org.iselab.grocery.util.SystemUtils;[productrepository];[])
->RefactoringNumber->92<-PullUpMethod(Class_6;org.iselab.grocery.util.SystemUtils;[];[getIntFromKeyboard])
->RefactoringNumber->94<-ExtractSuperClass(org.iselab.grocery.util.SystemUtils;Class_23;[productrepository];[clearScreen|printHeader])
->RefactoringNumber->95<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_24;[];[closeScanner|pressEnterKeyToContinue])
->RefactoringNumber->105<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[class_24];[])
->RefactoringNumber->111<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_6;[];[pressEnterKeyToContinue])
->RefactoringNumber->123<-EncapsulateField(org.iselab.grocery.util.SystemUtils;;[class_24];[])
->RefactoringNumber->132<-PullUpMethod(Class_6;org.iselab.grocery.util.SystemUtils;[];[pressEnterKeyToContinue])
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
