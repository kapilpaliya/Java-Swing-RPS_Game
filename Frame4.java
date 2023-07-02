import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;

public class Frame4 extends JFrame{
    int i = 0,j=0,k=0,l=0;
    Container c;    JButton rock,paper,scissor,info,exit;      JLabel label1,label2,label3;    Font font1,font2;

    Frame4(){
        //Show Screen Center
        Toolkit t = getToolkit();
        Dimension s = t.getScreenSize();
        int width = (int) (s.getWidth()*8/10);
        int height = (int) (s.getHeight()*8/10);
        //Create Frame
        setTitle("Rock_Paper_Scissor");
        setBounds(width/3,height/6,800,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //Font Set
        font1 = new Font("Arial",Font.BOLD,35);
        font2 = new Font("Arial",Font.BOLD,25);
//        font3 = new Font("Arial",Font.BOLD,25);

        //Set Container
        c = getContentPane();
        c.setBackground(Color.DARK_GRAY);
        c.setLayout(null);

        //Image Properties Setting
        ImageIcon img1= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Rock.jpg");
        ImageIcon img2= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Paper.jpg");
        ImageIcon img3= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Scissor.jpg");
        //Label Set
        label1 = new JLabel("*****---You Win!---*****");
        label1.setBounds(200,20,400,50);
        label1.setForeground(Color.cyan);
        label1.setFont(font1);
        c.add(label1);
        label2 = new JLabel("Roc Beats Scissor");
        label2.setBounds(260,60,280,30);
        label2.setForeground(Color.cyan);
        label2.setFont(font2);
        c.add(label2);
        //Set Image Button In Center
        rock = new JButton(img1);
        rock.setBounds(150,100,150,160);
        rock.setBackground(Color.white);
        c.add(rock);
//        paper = new JButton(img2);
//        paper.setBounds(300,100,150,160);
//        paper.setBackground(Color.white);
//        c.add(paper);
        scissor = new JButton(img3);
        scissor.setBounds(500,100,150,160);
        scissor.setBackground(Color.white);
        c.add(scissor);
        //Add Output Part
        label3 = new JLabel("Win = "+i+" | Lost = "+j+" | Draw = "+k+" | Total_Match = "+l);
        label3.setBounds(125,280,550,50);
        label3.setForeground(Color.cyan);
        label3.setFont(font2);
        c.add(label3);

        //Set Button's
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
}
