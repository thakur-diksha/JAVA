package databases;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class cust_detail {
    Connection cn;
    public void connect(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/customer");    
            System.out.println("Connected Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void insert(int id, String name, String user, String pwd ){
        try{
            PreparedStatement ps=cn.prepareStatement("insert into cust_detail(id, name, username, password)" + "values(?,?,?,?)");
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setString(3,user);
            ps.setString(4,pwd);
            
            if(ps.executeUpdate()>0)
                System.out.println("Record inserted successfully\n");
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void display(){
        try{
        PreparedStatement ps = cn.prepareStatement("select * from cust_detail");
        ResultSet rs= ps.executeQuery();
        System.out.println("======================================");
        System.out.println("id\t"+"name\t"+"username\t"+"password");
        System.out.println("======================================");
        while(rs.next())
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
            cn.close();
          }catch(Exception e){
            e.printStackTrace();
           }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        cust_detail obj=new cust_detail();
        obj.connect();
        System.out.println("1. Insert into database\n 2. Display data \n 3. Exit\n");
        
        do{
      
            System.out.println("enter what you want to do:");
            int ch = sc.nextInt();
            switch(ch){
                        
                case 1: System.out.println("Enter customer details(id, name, username, password)\n");
                        int id = sc.nextInt();
                        String name = sc.next();
                        String user = sc.next();
                        String pwd = sc.next();
                        obj.insert(id, name, user, pwd);
                        break;
                case 2: obj.display();
                        break;
                case 3: System.exit(0);
                        break;
                default: System.out.println("invalid choice");
            }
        }while(true);
    }
}

/*run:
Connected Successfully
1. Insert into database
2. Display data 
3. Exit

enter what you want to do:
1
Enter customer details(id, name, username, password)
231
dhwani
dhwanis
dhs
Record inserted successfully

enter what you want to do:
2
=========================================
id	name	  username	password
=========================================
103	diksha     dthakur	  diksha
104	dakshina    dakshi          dssr
231	dhwani     dhwanis           dhs    -->231 dhwani dhwanis dhs

enter what you want to do:
3
BUILD SUCCESSFUL (total time: 35 seconds)*/