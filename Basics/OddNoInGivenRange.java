package basic_applications;

import java.util.Scanner;

public class OddNoInGivenRange {

    public static void main(String args[]) {
        int n, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the beginning range, n: ");
        n = sc.nextInt();
        System.out.print("Enter the ending range, x: ");
        x = sc.nextInt();
        for (int i = n; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
