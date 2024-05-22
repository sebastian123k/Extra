package extra;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JPanel;

public class Paint extends JPanel{
	
	int randomR;
	int randomG;
	int randomB;
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);
		Graphics2D painter = (Graphics2D)g;
		
		   int[] xVertices = {110, 134, 218, 146, 166, 110, 54, 74, 2, 86};
	        int[] yVertices = {0, 72, 72, 108, 196, 144, 196, 108, 72, 72};
	        
	        GeneralPath g1 = new GeneralPath();
	        g1.moveTo(xVertices[0], yVertices[0]);
	        
	        for (int i = 1; i < xVertices.length; i++) {
	            g1.lineTo(xVertices[i], yVertices[i]);
	        }
	        g1.closePath(); 
	        
	        painter.translate(300, 300);
	        
	        for (int j = 0; j < 20; j++) {
	            painter.rotate(Math.PI / 10.0);
	            randomR = (int)(Math.random() * 255);
	            randomG = (int)(Math.random() * 255);
	            randomB = (int)(Math.random() * 255);
	            painter.setColor(new Color(randomR,randomG,randomB));
	            painter.fill(g1);
	        }
	    

      

    }
		

	
}
