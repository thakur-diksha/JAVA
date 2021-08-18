package misc;
import java.util.Scanner;
public class PrintEvenNo {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the beginning value:");
        a = sc.nextInt();
        System.out.println("Enter the ending value:");
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
	  if (i % 2 != 0) {
            continue;
          }
          System.out.print(i + " ");
          
        }
    }
}

