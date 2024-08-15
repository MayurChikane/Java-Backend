package guiAwt;

import java.awt.*;
public class FirStFrame 
{
	Frame fr;
	public FirStFrame()
	{
		fr=new Frame("First_AWT_Frame");
		fr.setSize(400,400);
		fr.setBackground(Color.orange);
		fr.setVisible(true);
	}
	public static void main(String[] args) 
	{
		FirStFrame  ff=new FirStFrame(); 
	}
}

