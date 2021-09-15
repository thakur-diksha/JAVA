
public abstract class shape {

    private int xcord, ycord;

    public int getxcord() {
        return xcord;
    }

    public int getycord() {
        return ycord;
    }

    public void setxcord(int x) {
        xcord = x;
    }

    public void setycord(int y) {
        ycord = y;
    }

    public shape(int x, int y) {
        xcord = x;
        ycord = y;
    }

    public shape() {
        xcord = ycord = 0;
    }

    public abstract float getArea();    //body of an abstract method cannot be executed
}

class cone extends shape {

    int r, s;

    public cone(int x, int y) {
        super(x, y);
        this.r = x;
        this.s = y;
    }

    @Override
    public float getArea() {
        float area;
        double pi = 3.14;
        area = (float) (pi * r * s + pi * r * r);
        return area;
    }
}

class box extends shape {

    int x, y, z;

    public box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public float getArea() {
        float area;
        area = (float) (2 * (x * y) + (y * z) + (x * z));
        return area;
    }
}

class TestShape {

    public static void main(String args[]) {
        shape s;
        s = new cone(3, 6);
        System.out.println("Area of cone:" + s.getArea());
        s = new box(8, 7, 6);
        System.out.println("Area of box:" + s.getArea());
    }
}
/* run:
Area of cone:84.78
Area of box:202.0
BUILD SUCCESSFUL (total time: 0 seconds)*/