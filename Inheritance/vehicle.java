package inheritance;
import java.util.Scanner;
public class vehicle {

    int vno, seatingCapacity;
    String vtype;

    public vehicle(int n, String t, int s) {
        vno = n;
        vtype = t;
        seatingCapacity = s;
    }

    @Override
    public String toString() {
        return ("\nVehicle no. " + vno + "\nVehicle type " + vtype + "\nSeating Capacity" + seatingCapacity);
    }
}

class tour extends vehicle {

    int tourid, km, tolltax;
    String source, destination;

    public tour(int n, String t, int s, int id, int k, int tax, String src, String des) {
        super(n, t, s);
        tourid = id;
        km = k;
        tolltax = tax;
        source = src;
        destination = des;
    }

    static int tourcharge(int km,int tolltax)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the charge: ");
        int ch=in.nextInt();
        return (km*ch)+tolltax;
    }

    @Override
    public String toString() {
        return (super.toString() + "\ntour Id= " + tourid + "\nDistance= " + km + "\nToll tax=" + tolltax + "\nSource= " + source + "\nDestination= " + destination + "\nTour Charge= " + tourcharge(km, tolltax));
    }
}

class test {
    public static void main(String args[]) {
        tour obj1 = new tour(100, "bus", 50, 25644, 350, 5, "jaipur", "lucknow");
        tour obj2 = new tour(200, "taxi", 2, 4563, 600, 9, "jaipur", "meerut");
        System.out.println(obj1);
        System.out.println();
        System.out.println(obj2);
    }
}

/*run:
run:
Enter the charge:
10

Vehicle no. 100
Vehicle type bus
Seating Capacity50
tour Id= 25644
Distance= 350
Toll tax=5
Source= jaipur
Destination= lucknow
Tour Charge= 3505

Enter the charge:
12

Vehicle no. 200
Vehicle type taxi
Seating Capacity2
tour Id= 4563
Distance= 600
Toll tax=9
Source= jaipur
Destination= meerut
Tour Charge= 7209
BUILD SUCCESSFUL (total time: 20 seconds)

*/