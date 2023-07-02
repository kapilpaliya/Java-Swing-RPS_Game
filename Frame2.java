import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
public class Frame2 extends JFrame{
    Container c;    JButton rock,paper,scissor,info,exit;      JLabel label1;    Font font1,font2;
    Frame2(){
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
        font1 = new Font("Arial",Font.BOLD,40);
        font2 = new Font("Arial",Font.BOLD,25);

        //Set Container
        c = getContentPane();
        c.setBackground(Color.DARK_GRAY);
        c.setLayout(null);

        //Image Properties Setting
        ImageIcon img1= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Rock.jpg");
        ImageIcon img2= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Paper.jpg");
        ImageIcon img3= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Scissor.jpg");
        //Label Set
        label1 = new JLabel("---SELECT ANY ONE---");
        label1.setBounds(150,20,500,50);
        label1.setForeground(Color.cyan);
        label1.setFont(font1);
        c.add(label1);
        //Set Image Button In Center
        rock = new JButton(img1);
        rock.setBounds(50,100,200,160);
        rock.setBackground(Color.white);
        c.add(rock);
        paper = new JButton(img2);
        paper.setBounds(300,100,200,160);
        paper.setBackground(Color.white);
        c.add(paper);
        scissor = new JButton(img3);
        scissor.setBounds(550,100,200,160);
        scissor.setBackground(Color.white);
        c.add(scissor);

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

    public static void main(String [] arg){
            new Frame2();

    }
}
