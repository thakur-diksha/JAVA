package databases;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class address {
    Connection cn;
    public void connect(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/customer");    
            System.out.println("Connected Successfully\n");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void insert(int cid, String c_name, String city){
        try{
            PreparedStatement ps=cn.prepareStatement("insert into address(cid, c_name, city)" + "values(?,?,?)");
            ps.setInt(1,cid);
            ps.setString(2,c_name);
            ps.setString(3, city);
            
            if(ps.executeUpdate()>0)
                System.out.println("Record inserted successfully\n");
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void display(){
        try{
        PreparedStatement ps = cn.prepareStatement("select * from address");
        ResultSet rs= ps.executeQuery();
        System.out.println("======================================");
        System.out.println("cid\t"+"c_name\t"+"city");
        System.out.println("======================================");
        while(rs.next())
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            //cn.close();
          }catch(Exception e){
            e.printStackTrace();
           }
    }
    
    public void delete(int id){
        try{
            PreparedStatement ps = cn.prepareStatement("delete from address where cid=?");
            ps.setInt(1, id);
            if(ps.executeUpdate() > 0){
                System.out.println("record deleted successfully\n");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void update(int cid, String c_name, String city){
        PreparedStatement ps = null;
        try{
            if(c_name != null && city != null){
                ps = cn.prepareStatement("update address set c_name=?, city=?" + "where cid=?");
                ps.setString(1, c_name);
                ps.setString(2, city);
                ps.setInt(3, cid);
            }
            else if(c_name != null){
                ps = cn.prepareStatement("update address set c_name=?" + "where cid=?");
                ps.setString(1, c_name);
                ps.setInt(2, cid);
            }
            else{
                ps = cn.prepareStatement("update address set city=?" + "where cid=?");
                ps.setString(1, city);
                ps.setInt(2, cid);
            }
            int no = ps.executeUpdate();
            if(no > 0){
                System.out.println(no+ "record updated successfully\n");
            }
            else{
                System.out.println("no match found\n");
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        address obj=new address();
        obj.connect();
        System.out.println("1. Insert into database\n 2. Display data \n 3. delete record \n 4. update record \n5. Exit\n");
        
        do{
      
            System.out.println("\nenter what you want to do:");
            int ch = sc.nextInt();
            switch(ch){
                        
                case 1: System.out.println("Enter address(cid, c_name, city):\n");
                        int cid = sc.nextInt();
                        String c_name = sc.next();
                        String city = sc.next();
                        obj.insert(cid, c_name, city);
                        break;
                    
                case 2: obj.display();
                        break;
                    
                case 3: System.out.print("enter the id whose record you want to delete:");
                        int id = sc.nextInt();
                        obj.delete(id);
                        break;
                    
                case 4: System.out.println("enter the id whose record you want to update:");
                        int no = sc.nextInt();
                        System.out.println("enter updated data:");
                        String name = sc.next();
                        String cityn = sc.next();
                        obj.update(no, name, cityn);
                        obj.display();
                        break;
                    
                case 5: System.exit(0);
                        System.out.println("exiting..");
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
3. delete record 
4. update record 
5. Exit

enter what you want to do:
1
Enter address(cid, c_name, city):

154
dhwani
delhi
Record inserted successfully

enter what you want to do:
2

======================================
cid	c_name	      city
======================================
101	diksha	     lucknow
1234	dik	         lko
1004	dakshina	  UP
154	dhwani	       delhi

enter what you want to do:
3

enter the id whose record you want to delete:1234
record deleted successfully

enter what you want to do:
4
enter the id whose record you want to update:
1004

enter updated data:
dsingh
meerut

1record updated successfully

======================================
cid	c_name	       city
======================================
101	diksha	    lucknow
1004	dsingh	     meerut
154	dhwani	      delhi

enter what you want to do:
5
exiting..

BUILD SUCCESSFUL (total time: 33 seconds)

*/