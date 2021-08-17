package basic_applications;

import java.util.Scanner;

public class commission {

    public static void main(String args[]) {
        double rate = 0;
        double sales, com;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter sales amt: ");
        sales = sc.nextDouble();
        if (sales > 50000) {
            rate = 0.15;
        } else if (sales >= 20000) {
            rate = 0.1;
        } else if (sales >= 10000) {
            rate = 0.05;
        }
        com = sales * rate;
        System.out.println(" Commision is: " + com);
    }
}
