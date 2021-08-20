package arrays;

import java.util.Scanner;

public class FourDArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][][][] = {{{{1, 2},
        {4, 3}
        },
        {
            {2, 3},
            {2, 5}
        }},
        {{{4, 2},
        {2, 3}
        },
        {
            {2, 1},
            {3, 1}
        }}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    for (int l = 0; l < arr[i][j][k].length; l++) {
                        System.out.print(arr[i][j][k][l] + "\t");
                    }
                    System.out.println("  ");
                }
                System.out.println("  ");
            }
            System.out.println("  ");
        }
        System.out.println("  ");
    }
}

run:
1	2	  
4	3	  
  
2	3	  
2	5	  
  
  
4	2	  
2	3	  
  
2	1	  
3	1	  
  
  
BUILD SUCCESSFUL (total time: 1 second)

