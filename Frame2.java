import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Frame2 extends JFrame implements ActionListener{
    // Variable Declaration
    Container c;    JButton rock,paper,scissor,info,exit;      JLabel label1,label2;    Font font1,font2;       int i,j,k;
    //Performed Action's Using Implements Function.
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== rock){
            System.out.println("Rock : "+(i));
            i=i+1;
        }
        else if(e.getSource()== paper){
            System.out.println("Paper : "+(j));
            k++;
        }
        else if(e.getSource()== scissor){
            System.out.println("Scissor : "+(k));
            k++;
        }
        else if(e.getSource()== exit){
            System.exit(0);
        }
        else if(e.getSource()== info){
            new Frame10();
        }
    }
    //Main Code Of Crate Frame Or Call Function.
    Frame2(){
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
        ImageIcon img1= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Rock.jpg");
        ImageIcon img2= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Paper.jpg");
        ImageIcon img3= new ImageIcon("C:\\Users\\kapil\\OneDrive\\Desktop\\Rock_Paper_Scissor\\H_Scissor.jpg");

        //Top Label Setting
        label1 = new JLabel("---SELECT ANY ONE---");
        label1.setBounds(150,20,500,50);
        label1.setForeground(Color.cyan);
        label1.setFont(font1);
        c.add(label1);

        //Set Center Image Button In Center
        rock = new JButton(img1);
        rock.setBounds(50,100,200,160);
        rock.setBackground(Color.white);
        rock.addActionListener(this);
        c.add(rock);
        paper = new JButton(img2);
        paper.setBounds(300,100,200,160);
        paper.setBackground(Color.white);
        paper.addActionListener(this);
        c.add(paper);
        scissor = new JButton(img3);
        scissor.setBounds(550,100,200,160);
        scissor.setBackground(Color.white);
        scissor.addActionListener(this);
        c.add(scissor);

        //Bottom Label Result Properties Setting
        label2 = new JLabel("Win = "+i+" | Lost = "+j+" | Draw = "+k);
        label2.setBounds(125,280,550,50);
        label2.setForeground(Color.cyan);
        label2.setFont(font1);
        c.add(label2);

        //Set Bottom Button's
        info = new JButton("INFO");
        info.setBounds(50,350,200,60);
        info.setBackground(Color.MAGENTA);
        info.addActionListener(this);
        info.setFont(font2);
        c.add(info);
        exit = new JButton("EXIT");
        exit.setBounds(550,350,200,60);
        exit.setBackground(Color.RED);
        exit.addActionListener(this);
        exit.setFont(font2);
        c.add(exit);
    }
}
