package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling{
    public static void main(String[] args) {
//CREATING A NEW FILE
        
        File myF = new File("DT.txt");
        try {
            myF.createNewFile();
        } catch (IOException e) {
            System.out.println("can't create the file");
            e.printStackTrace();
        }

//WRITING IN A FILE
        try {
            FileWriter fileWriter = new FileWriter("DT.txt");
            fileWriter.write("this is the required file");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//READING A FILE
        //File myFile = new File("DT.txt");
        try {
            Scanner sc = new Scanner(myF);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
//DELETING A FILE
       // File myFile = new File("DT.txt");
        if(myF.delete()){
            System.out.println("successfully deleted: " + myF.getName());
        }
        else{
            System.out.println("can't delete the file");
        }

    }
}
