package application;

import java.awt.*;  
import java.awt.event.*;  
import java.io.InputStream;  
import java.net.*;  
import javax.swing.*;


@SuppressWarnings("serial")
public class Dictionary extends Frame implements ActionListener{  
	public static void main(String args[]){  
		    JFrame f= new JFrame("Jack's Dictionary");  
		    JLabel l1,l2;  
		    l1=new JLabel("First Label.");  
		    l1.setBounds(50,50, 100,30);  
		    l2=new JLabel("Second Label.");  
		    l2.setBounds(50,100, 100,30);  
		    f.add(l1); f.add(l2);  
		    f.setSize(300,300);  
		    f.setLayout(null);  
		    f.setVisible(true);  
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}  