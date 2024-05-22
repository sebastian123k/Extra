package extra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Paint extends JPanel{
	
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);
		Graphics painter = (Graphics2D)g;
		
		painter.setColor(new Color(0,0,0));
		painter.fillOval(150, 350, 35, 25);
		painter.fillOval(315, 350, 35, 25);
		
		painter.setColor(new Color(255,255,255));
		
		painter.fillOval(152, 353, 31, 20);
		painter.fillOval(317, 353, 31, 20);
		
		painter.setColor(new Color(0,0,0));
		painter.fillOval(100, 100, 100, 100);
		painter.fillOval(300, 100, 100, 100);
		painter.fillOval(125, 150, 250, 225);
		painter.fillOval(130, 245, 240, 130);
		painter.setColor(new Color(248,203,178));
		painter.fillOval(150, 190, 120, 150);
		painter.fillOval(230, 190, 120, 150);
		painter.fillOval(140, 270, 220, 95);
		painter.setColor(new Color(0,0,0));
		painter.fillOval(200, 270, 20, 30);
		painter.fillOval(280, 270, 20, 30);
		painter.fillOval(235, 295, 30, 20);
		
	}

	
}
