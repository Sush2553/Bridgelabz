package com.bridgelabz.functional;

import java.awt.Button;
import java.awt.Frame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ButtonEvent {
		Button b1;
		 int count=0;
		  public void MultipleClicks()
		  {
		   Frame f=new Frame();
		    b1 = new Button("CLICK");
		    b1.setFocusable(true);
		    b1.addMouseListener(new MouseListener());
		                      
		    f.add(b1);
		    f.setSize(550, 550);
		    f.setVisible(true);
		  }
		 
		
		class MouseListener  extends MouseAdapter
		{
			int i;
			public long firstClick = 0;long Time;
			public void mouseClicked (MouseEvent e) 
			{
				Time = System.currentTimeMillis();
		        long interval = Time - firstClick;
		        
		        if (interval < 500) 
		        {
		            System.out.println("Hello Sushant.........." );
		            firstClick = 0;
		        } 
		        
		        else 
		        {
		            
		            firstClick = Time;
		        }
		   
		   }

		}
		 public static void main(String args[])
		  {
			 
			  ButtonEvent e=new ButtonEvent();
		    e.MultipleClicks();
		  }
		 
}
