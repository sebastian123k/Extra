package extra;

import java.awt.Color;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	Paint panel = new Paint();
	
	public Window()
	{
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(300,50,700,700);
		this.setLayout(null);
		
		panel.setLocation(0,0);
    	panel.setSize(getSize());
		panel.setBackground(new Color(255,255,255));
		panel.setLayout(null);
		this.add(panel);

		this.setVisible(true);
	}

}
