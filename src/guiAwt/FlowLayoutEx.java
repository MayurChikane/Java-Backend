package guiAwt;

import java.awt.*;
public class FlowLayoutEx extends Frame
{
  Button b1,b2,b3;
  Panel p1;
  FlowLayout f1;
	FlowLayoutEx()
	{
		super("FlowLayout_Frame");
		f1=new FlowLayout(f1.RIGHT);
		p1=new Panel();
		p1.setLayout(f1);
		b1=new Button("Ok");
		b2=new Button("Cancel");
		b3=new Button("Save");
		add(p1);
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		setBackground(Color.GREEN);
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		FlowLayoutEx f=new FlowLayoutEx();
}
}
