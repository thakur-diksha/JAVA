package arrays;

import java.util.Scanner;

public class MaxOfArray {

    public static void main(String args[]) {
        int num, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements in the array:");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("enter array elements: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 1; i < num; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max element of array is:" + max);
    }
}

