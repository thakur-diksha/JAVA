package constructors;

class trip {
    int carno, myr, mileage, kmrun;
    String model;
    
    trip(int no, int year, int mil, int km){
        carno = no;
        myr = year;
        mileage = mil;
        kmrun = km;
    }
    trip(int no, int year, int mil, int km, String md){
        this(no, year, mil, km);
        model = md;
    }
    
    double FuelConsumed(){
        double f = kmrun/mileage;
        return f;
    }
    double RunningCost(int FuelPrice){
        double cost = FuelConsumed() * FuelPrice;
        return cost;
    }
}

public class carTrip{
    public static void main(String args[]){
        trip obj1 = new trip(1562, 2001, 40, 300, "Ford anglia");
        System.out.println("fuel consumed by 1st car: "+obj1.FuelConsumed());
        System.out.println("running cost of 1st car: "+obj1.RunningCost(70));
        trip obj2 = new trip(2243, 2000, 60, 430, "Maruti 800");
        System.out.println("fuel consumed by 2nd car: "+obj2.FuelConsumed());
        System.out.println("running cost of 2nd car: "+obj2.RunningCost(40));
        trip obj3 = new trip(1897, 2003, 50, 200, "Swift");
        System.out.println("fuel consumed by 3rd car: "+obj3.FuelConsumed());
        System.out.println("running cost of 3rd car: "+obj3.RunningCost(30));
    }
    
}

/*run:
fuel consumed by 1st car: 7.0
running cost of 1st car: 490.0
fuel consumed by 2nd car: 7.0
running cost of 2nd car: 280.0
fuel consumed by 3rd car: 4.0
running cost of 3rd car: 120.0
BUILD SUCCESSFUL (total time: 0 seconds)*/