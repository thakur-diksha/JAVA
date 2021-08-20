package arrays;

import java.util.Scanner;

public class SumOfTwoMatrix {

    public static void main(String args[]) {
        int r, c, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows: ");
        r = sc.nextInt();
        System.out.println("enter no of cols: ");
        c = sc.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];

        System.out.println("enter the elements of matrix 1");

        for (i = 0; i < r; i++) {

            for (j = 0; j < c; j++) 
                a[i][j] = sc.nextInt();
            }
        System.out.println("enter the elements of matrix 2");

        for (i = 0; i < r; i++) {

            for (j = 0; j < c; j++) 
                b[i][j] = sc.nextInt();
            
         }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("sum of matrices:");

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(sum[i][j] + "\t");
            }

            System.out.println();
        }
    }
}
