package methods;
import java.util.Scanner;

public class method_overloading {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many numbers you want to compare:");
        int n = sc.nextInt();
        
        if (n == 2) {
            System.out.println("enter the numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("largest number: " + max(a, b));
        }
        else if (n == 3) {
            System.out.println("enter the numbers ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("largest number: " + max(a, b, c));
        } 
        else {
            int arr[] = new int[n];
            System.out.println("enter numbers in array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("largest number: " + max(arr));
        }
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    static int max(int a, int b, int c) {
        if (a > b && a > c) 
                return a;
        else if(b > c && b > a)
            return b;
        else
            return c;
    }

    static int max(int arr[]) {
        int lar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > lar) {
                lar = arr[i];
            }
        }
        return lar;
    }

}

/*run:
Enter how many numbers you want to compare:2
Enter the numbers
34 45
The largest number is 45

Enter how many numbers you want to compare:3
Enter the numbers 
2 34 1
The largest number is 34

enter how many numbers you want to compare:7
enter numbers in array: 
23 1 4 56 6 80 91
largest number: 91
*/


