import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

class Frame1 extends JFrame {
    Container c;    JButton start,info,exit;      JLabel label1,label2,label3;    Font font1,font2;
    Frame1(){
        //Show Screen Center
        Toolkit t = getToolkit();
        Dimension s = t.getScreenSize();
        int width = (int) (s.getWidth()*8/10);
        int height = (int) (s.getHeight()*8/10);
        //Create Frame
        setTitle("Rock_Paper_Scissor");
        setBounds(width/8,height/8,800,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //Font Set
        font1 = new Font("Arial",Font.BOLD,50);
        font2 = new Font("Arial",Font.BOLD,25);

        //Set Container
        c = getContentPane();
        c.setBackground(Color.DARK_GRAY);
        c.setLayout(null);

        //Label Set
        label1 = new JLabel("PLAY GAME");
        label1.setBounds(250,20,300,50);
        label1.setForeground(Color.cyan);
        label1.setFont(font1);
        c.add(label1);
        label2 = new JLabel("Rock_Paper_Scissor");
        label2.setBounds(270,60,300,50);
        label2.setForeground(Color.cyan);
        label2.setFont(font2);
        c.add(label2);

        //Set Button's
        start = new JButton("START");
        start.setBounds(300,200,200,60);
        start.setBackground(Color.green);
        start.setFont(font2);
        c.add(start);

        info = new JButton("INFO");
        info.setBounds(50,350,200,60);
        info.setBackground(Color.MAGENTA);
        info.setFont(font2);
        c.add(info);

        exit = new JButton("EXIT");
        exit.setBounds(550,350,200,60);
        exit.setBackground(Color.RED);
        exit.setFont(font2);
        c.add(exit);

    }

    public static void main(String[]arg){

        Frame1 a = new Frame1();
    }
}
