->RefactoringNumber->26<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Shapes;[input];[])
->RefactoringNumber->33<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_8;[];[getStringFromKeyboard])
->RefactoringNumber->39<-ExtractSuperClass(org.iselab.grocery.util.SystemUtils;Class_10;[];[clearScreen|closeScanner|getIntFromKeyboard])
->RefactoringNumber->50<-MoveField(org.iselab.grocery.util.SystemUtils;Class_2;[shapes];[])
->RefactoringNumber->54<-PullUpMethod(Class_8;org.iselab.grocery.util.SystemUtils;[];[getStringFromKeyboard])
->RefactoringNumber->56<-PushDownMethod(Class_10;org.iselab.grocery.util.SystemUtils;[];[getIntFromKeyboard])
->RefactoringNumber->57<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[class_2];[])
->RefactoringNumber->73<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_8;[];[pressEnterKeyToContinue])
->RefactoringNumber->85<-PullUpMethod(Class_8;org.iselab.grocery.util.SystemUtils;[];[pressEnterKeyToContinue])
->RefactoringNumber->86<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[class_2];[])
->RefactoringNumber->90<-PullUpField(org.iselab.grocery.util.SystemUtils;Class_10;[class_2];[])
->RefactoringNumber->94<-PushDownField(Class_10;org.iselab.grocery.util.SystemUtils;[class_2];[])
->RefactoringNumber->95<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[class_2];[])
->RefactoringNumber->97<-PushDownMethod(Class_10;org.iselab.grocery.util.SystemUtils;[];[clearScreen])
->RefactoringNumber->107<-MoveField(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.controller.Shapes;[class_2];[])
->RefactoringNumber->120<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_32;[];[setInput])
->RefactoringNumber->127<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[shapes];[])
->RefactoringNumber->128<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_35;[shapes];[clearScreen|pressEnterKeyToContinue])
->RefactoringNumber->136<-MoveField(Class_23;org.iselab.grocery.util.SystemUtils;[products];[])
->RefactoringNumber->140<-IncreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[class_32];[])
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
