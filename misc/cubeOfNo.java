
import java.util.Scanner;

public class cubeOfNo {

    private static Scanner sc;

    public static void main(String[] args) {
        int number, cube;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        cube = calCube(number);

        System.out.println("\n The Cube of a Given Number  " + number + "  =  " + cube);
    }

    public static int calCube(int num) {
        return num * num * num;
    }
}

