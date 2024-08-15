package guiAwt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SetBoundsEx extends Frame
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	
	public SetBoundsEx()
	{
		super("Login_Frame_SetBounds");
		setLayout(null);
		l1=new Label("Enter Username");
		l2=new Label("Enter Password");
		t1=new TextField(20);
		t2=new TextField(20);
		b1=new Button("Login");
		b2=new Button("Cancel");
		l1.setBounds(70,100,100,30);
		t1.setBounds(150,100,100,30);
        l2.setBounds(70,150,100,30);
		t2.setBounds(150,150,100,30);
		b1.setBounds(100,200,55,30);
		b2.setBounds(180,200,55,30);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		setBackground(Color.CYAN);
		setSize(400,400);
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
		SetBoundsEx ss=new SetBoundsEx();
	}

}
