package myapplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;

public class applet_one extends Applet {
    
    public void init() {
        setBackground(Color.black);
        
    }
    
    public void paint(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(30, 100, 200, 200);
        g.drawLine(30, 100, 130, 2);
        g.drawLine(310, 2, 230, 200);
        g.setColor(Color.blue);
        int x[] ={30, 130, 230};
        int y[] ={100, 2, 100};
        g.fillPolygon(x, y, 3);
        g.setColor(Color.red);
        g.fillOval(115, 40, 35, 35);
        g.setColor(Color.white);
        g.drawArc(350, 250, 50, 300, 270, 130);
        g.drawArc(400, 50, 50, 300, 130, 90);
    }

}
