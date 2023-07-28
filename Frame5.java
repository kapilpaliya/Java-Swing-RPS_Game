import java.awt.Dimension;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Objects;

public class Frame5 extends JFrame implements ActionListener{
    // Variable Declaration
    Container c;    JButton paper,scissor,replay,exit;      JLabel label1,label2,label3;    Font font1,font2;
    //Performed Action's Using Implements Function.
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== replay){
            new Frame2();
            this.setVisible(false);
        }
        else if(e.getSource()== exit){
            System.exit(0);
        }

    }
    //Main Code Of Crate Frame Or Call Function.
    Frame5(){
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
        font2 = new Font("Arial",Font.BOLD,25);

        //Set Container
        c = getContentPane();
        c.setBackground(Color.DARK_GRAY);
        c.setLayout(null);

        //Image Properties Setting
        ImageIcon img2= new ImageIcon(Objects.requireNonNull(this.getClass().getResource("image\\I_Paper.png")));
        ImageIcon img3= new ImageIcon(Objects.requireNonNull(this.getClass().getResource("image\\I_Scissor.png")));

        //Label Set
        label1 = new JLabel("*****---You Win!---*****");
        label1.setBounds(200,20,450,50);
        label1.setForeground(Color.cyan);
        label1.setFont(font1);
        c.add(label1);
        label2 = new JLabel("Scissor Beats Paper");
        label2.setBounds(290,60,280,30);
        label2.setForeground(Color.cyan);
        label2.setFont(font2);
        c.add(label2);

        //Set Image Button In Center
        scissor = new JButton(img3);
        scissor.setBounds(125,100,200,160);
        scissor.setBackground(Color.white);
        scissor.addActionListener(this);
        c.add(scissor);
        paper = new JButton(img2);
        paper.setBounds(475,100,200,160);
        paper.setBackground(Color.white);
        paper.addActionListener(this);
        c.add(paper);

        //Bottom Label Result Properties Setting
        label3 = new JLabel("Win = "+ Result.win +" | Lost = "+ Result.lost +" | Draw = "+ Result.draw);
        label3.setBounds(125,280,550,50);
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
