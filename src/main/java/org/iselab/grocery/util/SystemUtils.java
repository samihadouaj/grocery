->RefactoringNumber->52777<-ExtractSubClass(org.iselab.grocery.util.SystemUtils;Class_3;[];[printHeader])
->RefactoringNumber->52778<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_3;[];[getIntFromKeyboard])
->RefactoringNumber->52780<-PullUpMethod(Class_3;org.iselab.grocery.util.SystemUtils;[];[printHeader])
->RefactoringNumber->52784<-IncreaseMethodSecurity(org.iselab.grocery.util.SystemUtils;;[];[printHeader])
->RefactoringNumber->52786<-ExtractClass(org.iselab.grocery.util.SystemUtils;Class_5;[];[pressEnterKeyToContinue])
->RefactoringNumber->52793<-MoveMethod(org.iselab.grocery.util.SystemUtils;org.iselab.grocery.MainClass;[];[closeScanner])
->RefactoringNumber->52799<-DecreaseFieldSecurity(org.iselab.grocery.util.SystemUtils;;[mainclass];[])
->RefactoringNumber->52801<-PushDownField(org.iselab.grocery.util.SystemUtils;Class_3;[mainclass];[])
->RefactoringNumber->52803<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_3;[];[printHeader])
->RefactoringNumber->52815<-ExtractSuperClass(org.iselab.grocery.util.SystemUtils;Class_14;[input];[clearScreen])
->RefactoringNumber->52825<-PushDownField(org.iselab.grocery.util.SystemUtils;Class_3;[class_5];[])
->RefactoringNumber->52835<-PullUpField(Class_3;org.iselab.grocery.util.SystemUtils;[uuidutils];[])
->RefactoringNumber->52848<-MoveField(org.iselab.grocery.util.UUIDUtils;org.iselab.grocery.util.SystemUtils;[class_24];[])
->RefactoringNumber->52854<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_3;[];[setClass_24])
->RefactoringNumber->52866<-PushDownMethod(org.iselab.grocery.util.SystemUtils;Class_3;[];[getStringFromKeyboard])
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
