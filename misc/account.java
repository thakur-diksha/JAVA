
import java.util.Scanner;

class bank {

    private String accno;
    private String name;
    private long balance;
    private String address;
    private long contact;
    Scanner sc = new Scanner(System.in);

    
    void openAccount() {
        System.out.print("Enter Account No: ");
        accno = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter balance: ");
        balance = sc.nextLong();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter phone no: ");
        contact = sc.nextLong();
    }

    
    void showAccount() {
        System.out.println(accno + "," + name + "," + balance+ ","+address+","+contact);
    }

   
    void deposit() {
        long amt;
        System.out.println("Enter amount you want to deposit : ");
        amt = sc.nextLong();
        balance = balance + amt;
    }

    
    void withdrawal() {
        long amt;
        System.out.println("Enter amount you want to withdraw : ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
        } else {
            System.out.println("Less Balance..Transaction Failed..");
        }
    }

}

public class account {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("how many users do you want to input : ");
        int n = sc.nextInt();
        bank C[] = new bank[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new bank();
            C[i].openAccount();
        }

        int ch;
        do {
            System.out.println("Main Menu\n1. Display All\n 2. Deposit\n 3. Withdrawal\n 4.Exit ");
            System.out.println("enter your Choice :");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) 
                        C[i].showAccount();
                    
                    break;

                case 2:
                    System.out.print("Enter Account No : ");
                    String acn = sc.next();

                    for (int i = 0; i < C.length; i++) 
                            C[i].deposit();
                        
                    break;

                case 3:
                    System.out.print("Enter Account No : ");
                    acn = sc.next();

                    for (int i = 0; i < C.length; i++) 
                            C[i].withdrawal();
                        
                    break;

                case 4:
                    System.out.println("exiting..");
                    break;
            }
        } while (ch != 4);
    }
}
