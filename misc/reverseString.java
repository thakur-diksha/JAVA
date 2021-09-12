
import java.util.Scanner;

class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String value: ");
        String input = sc.next();

        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }

        for (char c : temparray) {
            System.out.print(c);
        }
        System.out.println();
    }
}

/* public class StringReverse {
 public static String reverseString(String str){
 //Converting to character array
 char ch[] = str.toCharArray();
 int n = ch.length;
 char result[] = new char[n];
 for(int i = 0; i<ch.length; i++) {
 result[n-1] = ch[i];
 n = n - 1;
 }
 return new String(result);
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a String value: ");
 String str = sc.next();
 String result = StringReverse.reverseString(str);
 System.out.println(result);
 }
 }
 */
