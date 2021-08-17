
package basic_applications;
import java.util.Scanner;

public class TableOfAnyNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i=1;
        int r;
        System.out.println("enter any number:");
        n = sc.nextInt();
         System.out.println("enter range to which you want table:");
        r = sc.nextInt();
        
        while(i<=r){
            System.out.println("table is:"+n*i);
            i++;
         }
    }
}    
