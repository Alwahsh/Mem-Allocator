import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class DrawerPanel extends JPanel
{

	public DrawerPanel() {}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawString("Idle",150, 150);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 517928030907408897L;

}
