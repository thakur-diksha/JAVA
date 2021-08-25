package methods;
import java.util.Scanner;

public class ArOfTr {
    double b, h;
    double area(){
        return 0.5*b*h;
    }
}

class testTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArOfTr obj = new ArOfTr();
        System.out.println("enter base of tr:");
        obj.b = sc.nextDouble();
        System.out.println("enter height of tr:");
        obj.h = sc.nextDouble();
        System.out.println("area of tr: " +obj.area()+"sq units");
    }
}

     