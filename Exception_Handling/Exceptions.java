package exceptions;
import java.util.Scanner;

public class Exceptions {
    static Scanner in=new Scanner(System.in);
    
//ARITHMATIC EXCEPTION    
    public static int divide(int a,int b){
        int temp=0;
        while(temp==0)
        {
            try{
                temp=a/b;
                return temp;
            }
            catch(ArithmeticException e){
                System.out.println("Exception raised "+e.getMessage()+" Try again: ");
                System.out.println("Re-enter value: ");
                b=in.nextInt();
            }
        }
        return temp;
    }
    
//ARRAY INDEX OUT OF BOUNDS EXCEPTION  
    public static int array_index(int arr[]){
        System.out.println("Enter the index of element you want to print: ");
        int x=in.nextInt();
        int temp=0;
        while(temp==0)
        {
            try{
                temp=arr[x];
            return temp;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception raised at " +e.getMessage()+ " Array index does not exist. Try again: ");
                System.out.println("Re-enter the position: ");
                x=in.nextInt();
            }
        }
        return temp;
    }
    
//NULL POINTER EXCEPTION  
    public static void compare_Strings(String s,String s1){
       try{
           if(s.equals(s1))
             System.out.println("Same");
           else
                System.out.println("Not same");   
        }
        catch(NullPointerException e){
          System.out.println("Exception Raised "+e.getMessage()+"\nTry again");  
        }
    }
    
//NUMBER FORMAT EXCEPTION
     public static void number(){
        int n;
        while(true){
            System.out.println("Enter any valid integer");
            try{
                n=Integer.parseInt(in.next());
                System.out.println("You entered: "+n);
                break;
            } 
            catch(NumberFormatException e){
                System.out.println("Exception raised: "+e.getMessage()+" You entered an invalid integer. Try again" );
            
            }
        }
    }
    
    public static void main(String[] args) {
        int a=50;
        System.out.println("Enter the value of b: ");
        int b=in.nextInt();
        System.out.println("Result is "+divide(a,b)+ "\t");
        
        System.out.println("Enter the size of array: ");
        int n=in.nextInt();
        System.out.println("Enter array elements: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();
        System.out.println("Result is "+array_index(arr) +"\t");
        
         String s=null,s1=null;
         compare_Strings(s,s1);
         in.nextLine();
         System.out.println("Enter the string");
         s=in.nextLine();
         System.out.println("Enter the string you want to compare to");
         s1=in.nextLine();
         compare_Strings(s,s1);
         System.out.println(" ");
         System.out.println("Output:");
         number();
    }    
}
/*run:
Enter the value of b: 
0
Exception raised / by zero Try again: 
Re-enter value: 
20
Result is 2

Enter the size of array: 
4
Enter array elements: 
12 31 2 90
Enter the position of element you want to print: 
5
Exception raised at 5 Array index does not exist. Try again: 
Re-enter the position: 
3
Result is 90

Exception Raised null
Try again
Enter the string
diksha
Enter the string you want to compare to
diksha
Same
BUILD SUCCESSFUL (total time: 27 seconds)

Output: 
Enter any valid integer
23i
Exception raised: For input string: "23i" You entered an invalid integer. Try again
Enter any valid integer
23
You entered: 23
*/