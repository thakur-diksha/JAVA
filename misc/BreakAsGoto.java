package misc;
import java.util.Scanner;
public class BreakAsGoto {
       public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        int a=10;
        first:
        {
            second:
            {
                third:
                {
                    if(a%2==0)break third;    // break first/second/third . outputs below
                    System.out.println("inside third");
                }
                System.out.println("inside second");
            }
            System.out.println("outside first");
        }
    }
}

/* output 1: run:
BUILD SUCCESSFUL (total time: 0 seconds)

output 2: run:
inside first
BUILD SUCCESSFUL (total time: 2 seconds)

output 3: run:
inside second
outside first
BUILD SUCCESSFUL (total time: 1 second)*/

