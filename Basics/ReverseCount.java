package basic_applications;

public class ReverseCount {

    public static void main(String args[]) {

        int i = 100;
        do {
            if (i % 4 == 0) {
                System.out.print("\n" + i + "\t");
            } else {
                System.out.print(i + "\t");
            }
            i--;
        } while (i >= 1);
    }

}

