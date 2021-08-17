package basic_applications;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3, i;
        int count;
        System.out.println("Enter the range to which you want to print(count):");
        count = sc.nextInt();
        System.out.print(n1 + " " + n2);

        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
