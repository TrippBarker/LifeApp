package main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class AppPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int screenWidth = 1200;
	private static final int screenHeight = 900;
	
	public AppPanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.white);
		this.setDoubleBuffered(true);
		this.setFocusable(true);
	}
}
