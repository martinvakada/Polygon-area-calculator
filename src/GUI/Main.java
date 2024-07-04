package GUI;

import GUI.MainFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class Main extends JFrame{
    public Main(){
        JFrame first=new JFrame();
        JLabel tit=new JLabel("OOM C3 PROJECT");
        JLabel members[]={new JLabel("James Pedapalli (IIT2022087)"),new JLabel("Martin Vakada (IIT2022077) "),new JLabel("Devya Gupta (IIT2022026)")};
        first.setContentPane(new JLabel(new ImageIcon("bg.jpg"))); //for background image
        JLabel tit1=new JLabel("Interactive Polygon Area Calculator");
        int delayTime = 5000;

        //changing parameters of members[]
        for(int i=0;i<3;i++){
            members[i].setBounds(200,230+i*40,450,200);
            members[i].setIconTextGap(20);
            members[i].setFont(new Font("Poppins",Font.BOLD,25));
            members[i].setForeground(Color.WHITE);
            members[i].setVisible(true);
            first.add(members[i]);
        }


        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainFrame();
                first.dispose();
            }
        };
        Timer timer = new Timer(delayTime, taskPerformer);
        timer.start();
        timer.setRepeats(false);


        //Adding title
        first.setTitle("POLYGON AREA CALCULATOR");

        //setting font style
        tit.setFont(new Font("Poppins",Font.BOLD,30));
        tit1.setFont(new Font("Poppins",Font.BOLD,30));
//        next.setFont(new Font("Poppins",Font.BOLD,20));
//        next.setFocusable(false);

        //setting colors
        tit1.setForeground(Color.WHITE);
        tit.setForeground(Color.WHITE);
//        next.setForeground(Color.WHITE);

        //setting bounds
        tit1.setBounds(100,150,600,100);
        tit.setBounds(230,100,400,100);
        first.setBounds(0,0,750,700);
//        next.setBounds(300,500,100,50);
        first.setLocationRelativeTo(null); //to center the opening frame of the app

        //Adding components to frame
//        first.add(next);
        first.add(tit1);
        first.add(tit);

        //Setting Attributes of frame
        first.setLayout(null);
        first.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        first.setResizable(false);
        first.setVisible(true);

    }

    public static void main(String[] args) {new Main();}
}
