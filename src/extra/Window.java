package extra;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Window extends JFrame implements KeyListener{
	
	Paint panel = new Paint();
	JPanel pnComponents = new JPanel();
	JTextField txtX = new JTextField("0");
	JTextField txtY = new JTextField("0");
	
	public Window()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBounds(300,50,700,700);
		this.setLayout(new BorderLayout());
		this.addPanel();
		this.addComponents();
		this.setVisible(true);
		addKeyListener(this);
		
	}
	
	public void addPanel()
	{
		panel.setBackground(new Color(255,255,255));
		panel.setBorder(new LineBorder(Color.pink,20,false));
		panel.setLayout(null);
		this.add(panel,BorderLayout.CENTER);
	}

	public void addComponents()
	{
		pnComponents.setBackground(Color.pink);
		pnComponents.setLayout(new GridLayout(2,4));
		
		JLabel lblX = new JLabel("X-Coordinate");
		lblX.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		pnComponents.add(lblX);
		
		
		pnComponents.add(txtX);
		
		JLabel lblY = new JLabel("Y-Coordinate");
		lblY.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		pnComponents.add(lblY);
		
		pnComponents.add(txtY);
		
		JLabel lblVoid = new JLabel("");
		lblVoid.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		pnComponents.add(lblVoid);
		
		JButton btnDraw = new JButton("DRAW");
		btnDraw.setFocusable(false);
		btnDraw.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				panel.addFlower(Integer.parseInt(txtX.getText()),Integer.parseInt(txtY.getText()));
				panel.repaint();
				
			}});
		pnComponents.add(btnDraw);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFocusable(false);
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.clear();
				panel.repaint();
				
			}});
		
		pnComponents.add(btnClear);
		
		txtX.addKeyListener(this);
	    txtY.addKeyListener(this);
		
		this.add(pnComponents,BorderLayout.SOUTH);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	    System.out.println(e.getKeyChar());

	    if(e.getKeyChar()!='1' && e.getKeyChar()!='2' && e.getKeyChar()!='3' && e.getKeyChar()!='4' && 
	            e.getKeyChar()!='5' && e.getKeyChar()!='6' && e.getKeyChar()!='7' && e.getKeyChar()!='8' && e.getKeyChar()!='9'&& e.getKeyChar()!='0')
	    {
	        txtX.setText("");
	        txtY.setText("");
	    }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	    if(e.getKeyChar()!='1' && e.getKeyChar()!='2' && e.getKeyChar()!='3' && e.getKeyChar()!='4' && 
	            e.getKeyChar()!='5' && e.getKeyChar()!='6' && e.getKeyChar()!='7' && e.getKeyChar()!='8' && e.getKeyChar()!='9'&& e.getKeyChar()!='0')
	    {
	        txtX.setText("");
	        txtY.setText("");
	    }
	
	}

}
