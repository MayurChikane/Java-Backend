package guiAwt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class AdapterClsEx extends Frame 
{
     public AdapterClsEx()
	{
	 super("Adaptercls_Frame");
	 setSize(350,350);
	 addWindowListener(new CloserFrame());
	 setBackground(Color.GRAY);
	 setVisible(true);
	}
     class CloserFrame extends WindowAdapter
     {			 
	   public void windowClosing(WindowEvent e)
	   {
		 System.exit(0);
	   }
	 } 
	
	public static void main(String[] args)
	{
		AdapterClsEx a1=new AdapterClsEx();
	}

}
