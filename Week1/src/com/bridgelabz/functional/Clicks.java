package com.bridgelabz.functional;

import java.awt.Graphics;

@SuppressWarnings("deprecation")
public class Clicks extends java.applet.Applet {
	 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public long firstClickTime = 0;
    public String msgToDisplay;
 
    public void init() {
        msgToDisplay = "Double Click";
    }
    public void paint(Graphics g) {
        g.drawRect(0, 0, size().width-1, size().height-1);
        g.drawString(msgToDisplay, 40, 30);
    }
    public boolean mouseDown(java.awt.Event evt, int x, int y) {
        long clickTime = System.currentTimeMillis();
        long clickInterval = clickTime - firstClickTime;
        if (clickInterval < 200) {
            msgToDisplay = "Double Click!! (Interval = " + clickInterval + ")";
            firstClickTime = 0;
        } else {
            msgToDisplay = "Single Click!!";
            firstClickTime = clickTime;
        }
        repaint();
        return true;
    }
}