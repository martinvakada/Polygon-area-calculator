package GUI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class MainFrame extends JFrame {
    // text fields where the results of every attribute will be shown
    private JTextArea angleText;
    private JTextField areaText;
    private JTextArea edgeText;

    public MainFrame() {
        // Frame
        JFrame frame = new JFrame("POLYGON AREA CALCULATOR");
        frame.setBounds(0,0,800, 700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // container
        Container c = frame.getContentPane();
        c.setBackground(new Color(20, 89, 88));

        //Back Button
        JButton back=new JButton("BACK");
        Font font1 = new Font("Arial", Font.BOLD, 20);
        back.setFont(font1);
        back.setForeground(Color.black);
        back.setBounds(20, 570, 180, 30);
        c.add(back);

        //ActionListner of back button
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();
                frame.dispose();
            }
        });
        //hand cursor when we hover on back button
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Side Panel
        angleText = new JTextArea("A : " + 90 + "\nB : " + 90 + "\nC : " + 90 + "\nD : " + 90);
        areaText = new JTextField("160000.00");
        edgeText = new JTextArea("AB : " + 400 + "\nBC : " + 400 + "\nCD : " + 400 + "\nDA : " + 400);

        areaText.setEditable(false);
        angleText.setEditable(false);
        edgeText.setEditable(false);


        //POLYGON PANEL
        ResizablePolygon panel = new ResizablePolygon(areaText, edgeText, angleText);
        panel.setBackground(Color.WHITE);
        panel.setBounds(220, 55, 580, 750);
        panel.setLayout(new GridBagLayout());
        c.add(panel);

        //title label

        JLabel title=new JLabel("OOM C3 PROJECT");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Poppins",Font.BOLD,20));
        title.setBounds(300,0,250,50);
        c.add(title);

        // Reset Button
        JButton Reset = new JButton("RESET");
        Reset.setFont(font1);
        Reset.setForeground(Color.black);
        Reset.setBounds(20, 600, 180, 30);
        frame.add(Reset);
        Reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new MainFrame();
            }
        });

        // AREA TEXT FIELD
        JLabel area = new JLabel("AREA");
        area.setBounds(0, 60, 200, 50);
        Font font2 = new Font("Arial Rounded MT Bold", Font.BOLD, 24);
        area.setForeground(Color.white);
        area.setFont(font2);
        c.add(area);

        areaText.setFont(font2);
        areaText.setBounds(0, 100, 220, 70);
        areaText.setBackground(Color.decode("#F8E2C2"));
        areaText.setBorder(new BevelBorder(BevelBorder.LOWERED));
        c.add(areaText);

        // EDGE TEXT FIELD
        JLabel edge = new JLabel("EDGE LENGTH");
        edge.setBounds(0, 180, 220, 50);
        edge.setFont(font2);
        edge.setForeground(Color.white);
        c.add(edge);

        edgeText.setFont(font2);
        edgeText.setBounds(0, 220, 220, 140);
        edgeText.setBackground(Color.decode("#F8E2C2"));
        edgeText.setBorder(new BevelBorder(BevelBorder.LOWERED));
        c.add(edgeText);

        // ANGLE TEXT FIELD
        JLabel angle = new JLabel("ANGLES");
        angle.setBounds(0, 370, 220, 50);
        angle.setFont(font2);
        angle.setForeground(Color.white);
        c.add(angle);

        angleText.setFont(font2);
        angleText.setBounds(0, 410, 220, 140);
        angleText.setBackground(Color.decode("#F8E2C2"));
        angleText.setBorder(new BevelBorder(BevelBorder.LOWERED));
        c.add(angleText);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
