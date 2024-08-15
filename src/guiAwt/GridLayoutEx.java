package guiAwt;

import java.awt.*;
public class GridLayoutEx extends Frame
{
	Button b1,b2,b3,b4;
    GridLayout g1;
	GridLayoutEx()
	{
		super("GridLayout_Frame");
		g1=new GridLayout(2,2);
		setLayout(g1);
		b1=new Button("Login");
		b2=new Button("Clear");
		b3=new Button("Set");
		b4=new Button("Reset");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setSize(400,400);
		setBackground(Color.BLUE);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		GridLayoutEx g=new GridLayoutEx();
	}
}


