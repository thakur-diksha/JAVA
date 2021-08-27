package constructors;

class Student
{
   private int ID;
   private String Name;
   private int Age;
   Student()     //Default 
   {
       ID = 100;
       Name = "New Student";
       Age = 18;
   }
   Student(int num1, String str, int num2)   //Parameterized 
   {
       ID = num1;
       Name = str;
       Age = num2;
   }
   
   public int getID() {
       return ID;
   }
   public void setID(int ID) {
       this.ID = ID;
   }
   public String getName() {
       return Name;
   }
   public void setStuName(String stuName) {
       this.Name = stuName;
   }
   public int getAge() {
       return Age;
   }
   public void setAge(int Age) {
       this.Age = Age;
   }

   public static void main(String args[])
   {
       Student myobj = new Student();                //calls the default constructor
       System.out.println("Student Name is: "+myobj.getName());
       System.out.println("Student Age is: "+myobj.getAge());
       System.out.println("Student ID is: "+myobj.getID());

        
       Student myobj2 = new Student(10, "diksha", 25);        //calls the parameterized const
       System.out.println("Student Name is: "+myobj2.getName());
       System.out.println("Student Age is: "+myobj2.getAge());
       System.out.println("Student ID is: "+myobj2.getID()); 
  }
}


/*Student Name is: New Student
Student Age is: 18
Student ID is: 100
Student Name is: diksha
Student Age is: 25
Student ID is: 10
BUILD SUCCESSFUL (total time: 1 second)
*/