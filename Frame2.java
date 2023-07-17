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
import java.util.Random;

class Result{
    public static int win,lost,draw;
}


public class Frame2 extends JFrame implements ActionListener{
    Result re = new Result();
    // Variable Declaration
    Container c;    JButton rock,paper,scissor,info,exit;      JLabel label1,label2;    Font font1,font2;

    //Performed Action's Using Implements Function.
    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()== rock){
            int x = this.result(0);
            this.callFrame(x);
            this.setVisible(false);
        }
        else if(e.getSource()== paper){
            int x = this.result(1);
            this.callFrame(x);
            this.setVisible(false);

        }
        else if(e.getSource()== scissor){
            int x = this.result(2);
            this.callFrame(x);
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
        ImageIcon img1= new ImageIcon(this.getClass().getResource("image\\H_Rock.jpg"));
        ImageIcon img2= new ImageIcon(this.getClass().getResource("\\image\\H_Paper.jpg"));
        ImageIcon img3= new ImageIcon(this.getClass().getResource("\\image\\H_Scissor.jpg"));

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
        label2 = new JLabel("Win = "+re.win+" | Lost = "+re.lost+" | Draw = "+re.draw);
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


    //Main Logic Of Rock Paper Scissor Game.
    public int result(int user1){
        Random r = new Random();
        int com = r.nextInt(3);
        if(user1==0&&com==2){
            re.win++;
            return 3;
        }
        else if(user1==1&&com==0){
            re.win++;
            return 4;
        }
        else if(user1==2&&com==1){
            re.win++;
            return 5;
        }
        else{
            if(user1==0&&com==1){
                re.lost++;
                return 8;
            }
            else if(user1==1&&com==2){
                re.lost++;
                return 9;
            }
            else if(user1==2&&com==0){
                re.lost++;
                return 7;
            }
            else{
                re.draw++;
                return 6;
            }
        }
    }
    public void callFrame(int x){
        switch (x) {
            case 3 -> new Frame3();
            case 4 -> new Frame4();
            case 5 -> new Frame5();
            case 6 -> new Frame6();
            case 7 -> new Frame7();
            case 8 -> new Frame8();
            case 9 -> new Frame9();
            default -> System.out.println("No Data Founds");
        }
    }


}
