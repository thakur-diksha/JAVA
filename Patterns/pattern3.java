package patterns;

import java.util.Scanner;

public class pattern3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the no of rows:");
        int row = sc.nextInt();
        System.out.println(" ");
        int i, j, k, l = 1;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++, l++) {
                System.out.print(l + " ");
            }
            System.out.println(" ");

        }

    }
}
