package guiAwt;

import java.awt.*;
public class LoginFrameEx extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	Panel p1;
	
	LoginFrameEx() 
	{
		super("Login_Frame");
		p1=new Panel();
		l1=new Label("Enter Username");
		l2=new Label("Enter Password");
		t1=new TextField(25);
		t2=new TextField(25);
		t2.setEchoChar('*');
		b1=new Button("Login");
		b2=new Button("Cancel");
		add(p1);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);
		add(p1);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(b1);
		p1.add(b2);
		setSize(400,400);
		setBackground(Color.CYAN);
		setVisible(true);
	}	
	public static void main(String[] args) 
	{
		LoginFrameEx ll=new LoginFrameEx();
	}
}
