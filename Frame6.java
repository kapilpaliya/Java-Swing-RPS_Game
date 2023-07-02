import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Frame6 extends JFrame implements ActionListener{
    // Variable Declaration
    Container c;    JButton draw,replay,exit;      JLabel label1,label3;    Font font1,font2;    int i,j,k;
    //Performed Action's Using Implements Function.
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== draw || e.getSource()== replay){
            new Frame2();
        }
        else if(e.getSource()== exit){
            System.exit(0);
        }

    }
    //Main Code Of Crate Frame Or Call Function.
    Frame6(){
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
        font1 = new Font("Arial",Font.BOLD,40);
        font2 = new Font("Arial",Font.BOLD,50);

        //Set Container
        c = getContentPane();
        c.setBackground(Color.DARK_GRAY);
        c.setLayout(null);

        //Image Properties Setting
        ImageIcon img4= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\tay2.png");

        //Label Set
        label1 = new JLabel("*****---Draw!---*****");
        label1.setBounds(200,20,450,30);
        label1.setForeground(Color.cyan);
        label1.setFont(font1);
        c.add(label1);

        //Set Image Button In Center
        draw = new JButton(img4);
        draw.setBounds(250,60,300,230);
        draw.setBackground(Color.white);
        draw.addActionListener(this);
        c.add(draw);

        //Bottom Label Result Properties Setting
        label3 = new JLabel("Win = "+i+" | Lost = "+j+" | Draw = "+k);
        label3.setBounds(125,290,550,50);
        label3.setForeground(Color.cyan);
        label3.setFont(font1);
        c.add(label3);

        //Set Bottom Button's
        replay = new JButton("Play_Again.");
        replay.setBounds(50,350,200,60);
        replay.setBackground(Color.MAGENTA);
        replay.addActionListener(this);
        replay.setFont(font2);
        c.add(replay);
        exit = new JButton("EXIT");
        exit.setBounds(550,350,200,60);
        exit.setBackground(Color.RED);
        exit.addActionListener(this);
        exit.setFont(font2);
        c.add(exit);
    }
}
