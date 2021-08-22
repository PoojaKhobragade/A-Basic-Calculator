/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates  
 * and open the template in the editor.
 */
package nptel;

import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener {
     TextField tf,tf2,tf3;
      Button addition,sub,mul,div,equal,one ,two,three,four,five,six,seven,eight,nine,zero;
        Frame frame = new Frame("Calculator");
 Calculator()
  {
    GridLayout layout=new GridLayout(6,3);
     tf=new TextField();tf2=new TextField();tf3=new TextField();tf3.setEditable(false);
     addition= new Button("+"); // addition.setBounds(50,60,100,20);
     sub= new Button("-"); // sub.setBounds(200,60,100,20);
     mul= new Button("*"); // mul.setBounds(50,100,100,20);
     div= new Button("/"); //div .setBounds(200,200,100,20);
    equal= new Button("=");one = new Button("1"); two = new Button("2"); three = new Button("3");four = new Button("4");
    five = new Button("5");six = new Button("6");seven= new Button("7");eight= new Button("8");nine= new Button("9");
    zero = new Button("0");
    
    one.addActionListener(this);two.addActionListener(this);three.addActionListener(this);four.addActionListener(this);
    five.addActionListener(this);six.addActionListener(this);seven.addActionListener(this);eight.addActionListener(this);
    nine.addActionListener(this);zero.addActionListener(this);addition.addActionListener(this);sub.addActionListener(this);
    mul.addActionListener(this);div.addActionListener(this);equal.addActionListener(this);//tf.addActionListener(this);
   // tf2.addActionListener(this);
    
   frame.add(tf); frame.add(tf2); frame.add(tf3);frame.add(equal);frame.add(zero); frame.add(one);frame.add(addition);
   frame.add(two); frame.add(three);frame.add(sub);frame.add(four);frame.add(five);frame.add(mul);frame.add(six);  
   frame.add(seven);  frame.add(div);frame.add(eight); frame.add(nine);     
   
    frame.setSize(400,400);
    frame.setLayout(layout );
    frame.setVisible(true);
    
  }
   public void actionPerformed(ActionEvent e)
   {
     String a,b;
     int num1,num2;
     double sum=0;
    a= tf.getText();
    num1=Integer.parseInt(a);
     b=tf2.getText();
    num2=Integer.parseInt(b);
    if(e.getSource()==addition)
        sum=num1+num2;
    else if(e.getSource()==sub)
        sum=num1-num2;
     else    if(e.getSource()==mul)
        sum=num1*num2;
     else if(e.getSource()==div)
        sum=num1/num2;
    tf3.setText(String.valueOf(sum));
       
   
     
   }
public static void main(String [] args)
{
new Calculator();
}
}
