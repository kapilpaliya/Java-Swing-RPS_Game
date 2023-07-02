import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Frame10 extends JFrame implements ActionListener{
     //Create Variable
    Container c;    JButton home,exit;      JLabel label1,label2,label3,label4;    Font font1,font2;
         //Performed Task For Buttons Using ActionListener Implement Function.
          @Override
          public void actionPerformed(ActionEvent e){
               if(e.getSource()== exit){
                    System.exit(0);
               }
               else if(e.getSource()== home){
                    new Frame1();
               }
          }
   public  Frame10(){
        //Take Screen Size Of All Type Screen.
        Toolkit t = getToolkit();
        Dimension s = t.getScreenSize();
        int width = (int) (s.getWidth()*8/10);
        int height = (int) (s.getHeight()*8/10);
        //Create Frame
        setTitle("Rock_Paper_Scissor");
        setBounds(width/4,height/10,800,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //Font Set
        font1 = new Font("Arial",Font.BOLD,35);
        font2 = new Font("Arial",Font.BOLD,25);

        //Set Container
        c = getContentPane();
        c.setBackground(Color.DARK_GRAY);
        c.setLayout(null);

        //Label Set
        label1 = new JLabel("Rules : ");
        label1.setBounds(0,20,600,25);
        label1.setForeground(Color.cyan);
        label1.setFont(font2);
        c.add(label1);
        label2 = new JLabel("01. Rock beats scissors and loses to paper.");
        label2.setBounds(0,60,600,25);
        label2.setForeground(Color.cyan);
        label2.setFont(font2);
        c.add(label2);
        label3 = new JLabel("02. Paper beats rock, but loses to scissors.");
        label3.setBounds(0,100,600,25);
        label3.setForeground(Color.cyan);
        label3.setFont(font2);
        c.add(label3);
        label4 = new JLabel("03. Scissors beat paper but loses to rock.");
        label4.setBounds(0,140,600,25);
        label4.setForeground(Color.cyan);
        label4.setFont(font2);
        c.add(label4);

        //Set Button's
        home = new JButton("HOME");
        home.setBounds(50,350,200,60);
        home.setBackground(Color.MAGENTA);
        home.setFont(font2);
        home.addActionListener(this);
        c.add(home);

        exit = new JButton("EXIT");
        exit.setBounds(550,350,200,60);
        exit.setBackground(Color.RED);
        exit.setFont(font2);
        exit.addActionListener(this);
        c.add(exit);
    }
}

