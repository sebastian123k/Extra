package extra;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Paint extends JPanel{

	ArrayList<Dimension> cordenadas = new ArrayList();
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);
		Graphics2D painter = (Graphics2D)g;
		painter.translate(50, 50);
		drawFlowers(painter);
    }
	
	public void drawFlowers(Graphics2D painter)
	{
		for (Dimension dimension : cordenadas) {
	
			painter.setColor(Color.green);
			painter.drawArc(dimension.height+100,dimension.width+100,50, 300, 15,45 );
			painter.setColor(Color.pink);
			painter.fillOval(dimension.height+0,dimension.width+0,100,100);
			painter.fillOval(dimension.height+150,dimension.width+0,100,100);
			painter.fillOval(dimension.height+75,dimension.width+-50,100,100);
			painter.fillOval(dimension.height+30,dimension.width+70,100,100);
			painter.fillOval(dimension.height+120,dimension.width+70,100,100);
			painter.setColor(Color.yellow);
			painter.fillOval(dimension.height+75,dimension.width+20,100,100);
		}
		
	}
	
	public void clear()
	{
		cordenadas.removeAll(cordenadas);
	}
	
	public void addFlower(int x,int y)
	{
		cordenadas.add(new Dimension(x,y));
	}
}
