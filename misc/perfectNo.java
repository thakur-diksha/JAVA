
import java.util.Scanner;

public class perfectNo {

    public static void main(String args[]) {
        int s = isPerfect();
        System.out.println(" ");

    }

    static int isPerfect() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");

        num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {

                sum = sum + i;
            }
        }

        if (num != sum) {
            System.out.println(num + " is not a perfect number");
        } else {
            System.out.println(num + " is a perfect number");
        }
        return 0;
    }

}
