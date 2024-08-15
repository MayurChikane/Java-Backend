package guiAwt;

import java.awt.*;
public class BorderLayoutEx extends Frame
{
	Button b1,b2,b3,b4;
	TextArea ta;
	Panel p1;
	BorderLayout bb;

	public BorderLayoutEx()
	{
		super("BorderLayout_Layout");
		p1=new Panel();
		bb=new BorderLayout();
		p1.setLayout(bb);
		b1=new Button("North");
		b2=new Button("South");
		b3=new Button("East");
		b4=new Button("West");
		ta=new TextArea(5,6);
		add(p1);
		p1.add("North",b1);
		p1.add("South",b2);
		p1.add("East",b3);
		p1.add("West",b4);
		p1.add("Center",ta);
		setSize(400,400);
		setBackground(Color.red);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		BorderLayoutEx b=new BorderLayoutEx();
	}
}

