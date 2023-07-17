import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Frame1 extends JFrame implements ActionListener{
    //Variable Declaration
    Container c;    JButton start,info,exit;      JLabel label1,label2;    Font font1,font2;
    //Performed Action's Using Implements Function.
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== start){
            new Frame2();
            this.setVisible(false);
        }

        else if(e.getSource()== exit){
            System.exit(0);
        }
        else if(e.getSource()== info){
            new Frame10();
            this.setVisible(false);
        }
    }
    //Main Code Of Crate Frame Or Call Function.
    Frame1(){
        //Take Screen Size(Width And Height) Of All Type Screen.
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

        //Set Center Button's
        start = new JButton("START");
        start.setBounds(300,200,200,60);
        start.setBackground(Color.green);
        start.addActionListener(this);
        start.setFont(font2);
        c.add(start);

        //Set Bottom Button's
        info = new JButton("INFO");
        info.setBounds(50,350,200,60);
        info.setBackground(Color.MAGENTA);
        info.setFont(font2);
        info.addActionListener(this);
        c.add(info);
        exit = new JButton("EXIT");
        exit.setBounds(550,350,200,60);
        exit.setBackground(Color.RED);
        exit.setFont(font2);
        exit.addActionListener(this);
        c.add(exit);
    }
    public static void main(String[]arg){
        new Frame1();
    }
}



