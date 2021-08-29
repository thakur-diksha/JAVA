package strings;
import java.util.Scanner;
public class smartCardId {

    public static void main(String[] args) {
       Scanner id= new Scanner(System.in);
        System.out.println("Enter the ID: ");
        String a= id.next();
        int j= Integer.parseInt(a.substring(5,10));
        System.out.println(a.substring(0,5)+(j+1));
    }
    
}

/*run:
Enter the ID: 
BTBTI19037
BTBTI19038
BUILD SUCCESSFUL (total time: 7 seconds)
*/