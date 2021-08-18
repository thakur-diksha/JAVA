package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int size, i, x, found =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of array:");
        size = sc.nextInt();
        int arr[] = new int[100];
        System.out.println("Enter the array elements:");
        for (i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }    
            System.out.println("Enter the element to be serached:");
            x = sc.nextInt();
            for(i=0; i<size; i++){
                if(x == arr[i]){
                    System.out.println("Element found on position :" +i);
                     found=1;
                    break; 
                }
            }
         if(found == 0)
             System.out.println("Element not found");
        }
    }
