package myapplet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class NewApplet extends Applet {

    public void init() {
        setBackground(Color.black);
        
    }
    public void paint(Graphics g){
        
        g.setFont(new Font("Arial",Font.BOLD,40));
        g.setColor(Color.cyan);
        g.drawString("Welcome to Applet programming", 50, 100); //50->width or x axis 100->height or y axis
        g.setColor(Color.green);
        int y =200, s=50;
        for(int i = 0; i<=5; i++){
            g.drawString("B.Tech IT", 50, y+=50);
            g.setFont(new Font("Arial",Font.BOLD,s-=5));
        }
    }
}
