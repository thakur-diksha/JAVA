package methodoverriding;

class AB {
    public int sum(int a, int b) 
    {
           return a+b;
    }
}

class ABC extends AB {

    public int sum(int a, int b, int c) 
    {
        return a+b+c;
    }
}

public class sumABC{

    public static void main(String args[]) {
        ABC obj = new ABC();
        System.out.println(obj.sum(5, 2, 7));
        System.out.println(obj.sum(3,2));
        AB obj1 = obj;
        System.out.println(obj.sum(8, 3, 2));
        System.out.println(obj.sum(8,1));
    }
}

/*run:
14
5
13
9
BUILD SUCCESSFUL (total time: 0 seconds)*/


