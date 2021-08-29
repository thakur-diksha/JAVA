package strings;

import java.util.Scanner;

public class ParagraphToSentences {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the paragraph: ");
        String s = obj.nextLine();
        String arr[] = s.split("[.]");
        for (String arr1 : arr) 
            System.out.println(arr1);
    }
}

/*run:
Enter the paragraph: 
hi. i am diksha. i am in java lab right now.
hi
 i am diksha
 i am in java lab right now
BUILD SUCCESSFUL (total time: 10 seconds)*/