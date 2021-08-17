package basic_applications;

import java.util.Scanner;

public class Count_vow_cons_dig {

    public static void main(String[] args) {
        int v = 0, con = 0, d = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter any alphanumeric string:");
        String str = sc.next();

        char ch[] = str.toCharArray();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            switch (ch[i]) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    v++;
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    d++;
                    break;
                default:
                    con++;
            }
        }
        System.out.println("consonants:" + con);
        System.out.println("vowels:" + v);
        System.out.println("digits:" + d);
    }
}
