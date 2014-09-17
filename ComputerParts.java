
import javax.swing.JApplet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComputerParts extends JApplet implements ActionListener  {
//step 1 dcelare objects you nee
    JButton btnram, btnhdd, btnmboard;
JButton btnpower, btnoptical, btncpu;
JLabel lblanswer;
String htmlstyle="<HTML><FONT FACE=Arial><p style='padding:10px; background:black; color:white; Font-size:16px'>";

   
    public void init() {
        //step 2 - create objects
        btnram=new JButton ("Ram");
        btnhdd=new JButton("Hard Disk");
        btnmboard=new JButton("Motherboard");
btnpower=new JButton("Power Supply") ;     
btnoptical=new JButton("Optical Drive") ;   
btncpu=new JButton("CPU");
lblanswer=new JLabel("Defintion goes here");
        //step 3 - add components to applet
        setLayout(new FlowLayout());
        add(btncpu);
        add (btnram);
        add(btnmboard);
        add(btnhdd);
        add(btnpower);
        add(btnoptical);
        add(lblanswer);
        //step 4 - attach buttons to button code
        btncpu.addActionListener(this);
        btnram.addActionListener(this);
        btnhdd.addActionListener(this);
        btnmboard.addActionListener(this);
        btnoptical.addActionListener(this);
        btnpower.addActionListener(this);
}
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btncpu)lblanswer.setText(htmlstyle+"The brains of the Computer");
        if (e.getSource()==btnram)lblanswer.setText(htmlstyle+"RAM stands for Random Access Memory<BR>It is temporay memory for programs in use.");
        if (e.getSource()==btnmboard)lblanswer.setText(htmlstyle+"A printed circuit board containing the principal components of a computer or other<Br>device, with connectors into which other circuit boards can be slotted.");
        if (e.getSource()==btnoptical)lblanswer.setText(htmlstyle+"Loads Optical Disks like CD and DVD.");
        if (e.getSource()==btnpower)lblanswer.setText(htmlstyle+"Provides power to motherboard<Br>and all other drives");
        if (e.getSource()==btnhdd)lblanswer.setText(htmlstyle+"Long term storage that holds all programs");


    }
    
}
    
