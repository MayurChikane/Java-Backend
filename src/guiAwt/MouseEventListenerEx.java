package guiAwt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class MouseEventListenerEx extends Frame implements MouseListener
{
	int x,y;
	MouseEventListenerEx()
	{
		super("MouseEvent_Frame");
		addMouseListener(this);
		setSize(350,350);
		setBackground(Color.yellow);
		setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) 
	{
	  	x=e.getX();
	  	y=e.getY();
	  	repaint();//call to paint method
	}
	
	public void paint(Graphics g)
	{
		String s1="x: ="+x+ "Y:"+y;
		g.drawString(s1, x, y);
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		
	}
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		
	}
	@Override
	public void mouseEntered(MouseEvent e)
	{	
		
	}
	@Override
	public void mouseExited(MouseEvent e) 
	{
		
	}
	public static void main(String[] args)
	{
		MouseEventListenerEx  m=new MouseEventListenerEx ();
	}
}
