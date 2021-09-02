package inheritance;

public class name {

    String first;
    String middle;
    String last;

    public name() {
        first = "ram";
        middle = "kumar";
        last = "sharma";
    }

    public name(String first, String middle, String last)

    {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    @Override
    public String toString() {
        return "first=" + first + "\nmiddle= " + middle + "\nlast= " + last;
    }
}

class student extends name {

    int rno;
    int m1, m2, m3;
    

    public student() {
        super();
        rno = 20;
        m1=80;
        m2=75;
        m3=90;
    }

    public student(String first, String middle, String last, int rno,int m1,int m2,int m3) {
        super(first, middle, last);
        this.rno = rno;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }

    @Override
    public String toString() {
        int total=m1+m2+m3;
        int percentage=total/3;
        String result="";
        if(percentage>90)
            result="A";
        else if((percentage>80)&&(percentage<90))
            result="B";
        else if(percentage<80)
            result="C";
        return (super.toString() + "\nrno=" + rno +"\ntotal=" +total+ "\npercentage="+percentage+"\nresult="+result);
    }
}

class Teststudent {

    public static void main(String args[]) {
        student s1 = new student();
        student s2 = new student("aman", "kumar", "verma", 32,87,72,89);
        System.out.println("Objec s1");
        System.out.println(s1);
        System.out.println();
        System.out.println("Objec s2");
        System.out.println(s2);

    }
}
/*run:
Objec s1
first=ram
middle= kumar
last= sharma
rno=20
total=245
percentage=81
result=B

Objec s2
first=aman
middle= kumar
last= verma
rno=32
total=248
percentage=82
result=B
BUILD SUCCESSFUL (total time: 0 seconds)
*/