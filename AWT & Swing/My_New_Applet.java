package myapplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;

public class My_New_Applet extends Applet {
    //components
    Label l1,l2,l3,l4;
    TextField t1, t2,t3;
    Button b1, b2;
    Choice c;
    
    public void init() {
        setBackground(Color.magenta);
        //initialize these components
        l1 = new Label("Enter a");
        l2 = new Label("Enter b");
        l4 = new Label("Select Operation");
        l3 = new Label("Result");
        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);
        b1 = new Button("Clear");
        b2 = new Button("Submit");
        c = new Choice();
        c.add("Addition");
        c.add("Subtraction");
        c.add("Multiplication");
        c.add("Division");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l4);
        add(c);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
    }
    
    public void paint(Graphics g){
        g.setColor(Color.cyan);
     
    }

}
