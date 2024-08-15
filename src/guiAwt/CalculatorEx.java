package guiAwt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CalculatorEx extends Frame
{
 TextField t1;
 Button b1[];
 Panel p1;
 GridLayout g1;
 
 public CalculatorEx()
 {
	 super("CalculatorFrame");
	 t1=new TextField(50);
	 p1=new Panel();
	 g1=new GridLayout(4,4);
	 b1=new Button[16];
	 p1.setLayout(g1);
	 add("Center",p1);
	 add("North",t1);
	 
	 b1[0]=new Button("0");
	 b1[1]=new Button("1");
	 b1[2]=new Button("2");
	 b1[3]=new Button("3");
b1[4]=new Button("4");
	 b1[5]=new Button("5");
	 b1[6]=new Button("6");
	 b1[7]=new Button("7");
	 b1[8]=new Button("8");
	 b1[9]=new Button("9");
	 
	 
	 for(int i=0;i<10;i++)
	 {
		 b1[i]=new Button(String.valueOf(i));
	 }
	 
	 
	 b1[10]=new Button(".");
	 b1[11]=new Button("=");
	 b1[12]=new Button("+");
	 b1[13]=new Button("-");
	 b1[14]=new Button("*");
	 b1[15]=new Button("/");
	 
	 for(int i=0;i<=15;i++)
	 {
		 p1.add(b1[i]);
	 }
	 setSize(400,400);
	 setBackground(Color.ORANGE);
	 setVisible(true);
	 
	 
	 this.addWindowListener(new WindowAdapter()
	{
	 public void windowClosing(WindowEvent e)
	 {
		 System.exit(0);
	 }
	});	
 }
 
	public static void main(String[] args) 
	{
		CalculatorEx c1=new CalculatorEx();
	}
}
