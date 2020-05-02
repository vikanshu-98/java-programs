/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamle;

import  java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 import javax.swing.JOptionPane;
class game extends JFrame implements ActionListener{
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8,b9;
	//JFrame f1;

public game()
{
//	f1 =new JFrame("game");
	b1=new JButton("1");
	b2=new JButton("2");
	b3=new JButton("3");
	b4=new JButton("4");
	b5=new JButton("5");
	b6=new JButton("6");
	b7=new JButton("7");
	b8=new JButton("");
	b9=new JButton("8");
	b1.setBounds(100,80,50,30);
	b2.setBounds(160,80,50,30);
	b3.setBounds(220,80,50,30);
	b4.setBounds(100,130,50,30);
	b5.setBounds(160,130,50,30);
	b6.setBounds(220,130,50,30);
	b7.setBounds(100,180,50,30);
	b8.setBounds(160,180,50,30);
	b9.setBounds(220,180,50,30);
b1. addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
add(b1);
 add(b2);
 add(b3);
 add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
setLayout(null);
	setSize(400,400);
setVisible(true);

setDefaultCloseOperation(this.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1){  
          String label=b1.getLabel();
		  if(b2.getLabel().equals(""))
		  {
			  b2.setLabel(label);
			  b1.setLabel("");
		  }
		  if(b4.getLabel().equals(""))
		  {
			  b4.setLabel(label);
			  b1.setLabel("");
		  }

}
if(e.getSource()==b2){  
         b1.getLabel();
		  if(b1.getLabel().equals(""))
		  {
			  b1.setLabel(b2.getLabel());
			  b2.setLabel("");
		  }
		  if(b3.getLabel().equals(""))
		  {
			  b3.setLabel(b2.getLabel());
			  b2.setLabel("");
		  }
		  if(b5.getLabel().equals(""))
		  {
			  b5.setLabel(b2.getLabel());
			  b2.setLabel("");
		  }

}
if(e.getSource()==b3)
{
	if(b2.getLabel().equals(""))
	{
		b2.setLabel(b3.getLabel());
	b3.setLabel("");
	}

	if(b6.getLabel().equals(""))
	{
		b6.setLabel(b3.getLabel());
		b3.setLabel("");
	
	}}
if(e.getSource()==b4)
{
	if(b1.getLabel().equals(""))
	{
		b1.setLabel(b4.getLabel());
	b4.setLabel("");
	}

	if(b5.getLabel().equals(""))
	{
		b5.setLabel(b4.getLabel());
		b4.setLabel("");
	}
	if(b7.getLabel().equals(""))
	{
		b7.setLabel(b4.getLabel());
		b4.setLabel("");
		
	}}
if(e.getSource()==b5)
{
	String label=b5.getLabel();
	if(b2.getLabel().equals(""))
	{
		b2.setLabel(label);
		b5.setLabel("");
	}
	if(b8.getLabel().equals(""))
	{
		b8.setLabel(label);
		b5.setLabel("");
	}
	if(b4.getLabel().equals(""))
	{
		b4.setLabel(label);
		b5.setLabel("");
	}
	if(b6.getLabel().equals(""))
	{
		b6.setLabel(label);
		b5.setLabel("");
	}
}
if(e.getSource()==b6)
{
	if(b3.getLabel().equals(""))
	{
		b3.setLabel(b6.getLabel());
		b6.setLabel("");
	}
	if(b5.getLabel().equals(""))
	{
		b5.setLabel(b6.getLabel());
	b6.setLabel("");
	}
	if( b9.getLabel().equals(""))
	{
		b9.setLabel(b6.getLabel());
	b6.setLabel("");
	}
}
if(e.getSource()==b7)
{
if(b4.getLabel().equals(""))
	{
		b4.setLabel(b7.getLabel());
	b7.setLabel("");
	}
	if( b8.getLabel().equals(""))
	{
		b8.setLabel(b7.getLabel());
	b7.setLabel("");
	}	
}
if(e.getSource()==b8)
{
	String label=b8.getLabel();
	if(b7.getLabel().equals(""))
	{
		b7.setLabel(label);
		b8.setLabel("");
	}
	if(b5.getLabel().equals(""))
	{
		b5.setLabel(label);
		b8.setLabel("");
	}
	if(b9.getLabel().equals(""))
	{
		b9.setLabel(label);
		b8.setLabel("");
	}
}
if(e.getSource()==b9)
{
if(b6.getLabel().equals(""))
	{
		b6.setLabel(b9.getLabel());
	b9.setLabel("");
	}
	if( b8.getLabel().equals(""))
	{
		b8.setLabel(b9.getLabel());
	b9.setLabel("");
	}	
}
if( b1.getLabel().equals("1") && 
    b2.getLabel().equals("2") && 
	b3.getLabel().equals("3") && 
	b4.getLabel().equals("4") && 
	b5.getLabel().equals("5") && 
	b6.getLabel().equals("6") && 
	b7.getLabel().equals("7") && 
	b8.getLabel().equals("8") &&
	b9.getLabel().equals(""))
{
	JOptionPane.showMessageDialog(this,"congratulation ! you are won");
}}
public static void main(String []arggs)
{
	game ob1 =new game();}
	
}

