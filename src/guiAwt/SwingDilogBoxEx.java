package guiAwt;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class SwingDilogBoxEx extends JFrame implements ActionListener
{
	JPanel p1;
	JMenuBar mb;
	JMenu m1;
	JMenuItem o1,s1;
	JTextArea ta;
	
   public SwingDilogBoxEx()
   {
	   super("Swing_Frame");
	   p1=new JPanel();
	   mb=new JMenuBar();
	   m1=new JMenu();
	   setJMenuBar(mb);
	   o1=new JMenuItem("Open");
	   s1=new JMenuItem("Save");
	   ta=new JTextArea(25,30);
getContentPane().add(p1);
	   p1.add(mb);
	   mb.add(m1);
	   p1.add(o1);
	   p1.add(s1);
	   p1.add(ta);
	   o1.addActionListener(this);
	   s1.addActionListener(this);
	   setSize(400,400);
	   setVisible(true);
	   setBackground(Color.cyan);
   }
	@Override
	public void actionPerformed(ActionEvent e)
	{
	 Object obj=e.getSource();
	 if(obj==o1)
	 {
		 JFileChooser fc=new JFileChooser();
		 fc.showOpenDialog(this);
		 File f=fc.getSelectedFile();
		    try 
		    {
			FileInputStream fin=new FileInputStream(f);
			byte[]b=new byte[fin.available()];
			String s1=new String(b);
			ta.setText(s1);
			fin.close();
		    }
			catch (IOException e1) 
		    {
				e1.printStackTrace();
			} 
	 } 
		    else if(obj==s1)
		    {
		    	JFileChooser fc=new JFileChooser();
		    	fc.showSaveDialog(this);
		    	File f=fc.getSelectedFile();
		    	String s1=ta.getText();
		    	byte b[]=s1.getBytes();
		    	
		    	try
		    	{
					FileOutputStream fout=new FileOutputStream(f);
					fout.write(b);
					fout.close();
				}
		    	catch (FileNotFoundException e1)
		    	{
					
					e1.printStackTrace();
				}
		    	catch(Exception e1)
		    	{
		    		e1.printStackTrace();
		    	}
		    	
		    }
	}
  public static void main(String[] args) 
  {
	  SwingDilogBoxEx s=new SwingDilogBoxEx();
  }
}
