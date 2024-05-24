import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Window extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 540);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(190, 187, 184));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(38, 323, 503, 140);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblYear_1_4_2 = new JLabel("Town:");
		lblYear_1_4_2.setForeground(Color.WHITE);
		lblYear_1_4_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2.setBackground(Color.GRAY);
		lblYear_1_4_2.setBounds(39, 11, 37, 14);
		panel_1.add(lblYear_1_4_2);
		
		JLabel lblYear_1_4_3 = new JLabel("Zone:");
		lblYear_1_4_3.setForeground(Color.WHITE);
		lblYear_1_4_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_3.setBackground(Color.GRAY);
		lblYear_1_4_3.setBounds(37, 36, 37, 14);
		panel_1.add(lblYear_1_4_3);
		
		JLabel lblYear_1_4_4 = new JLabel("Country:");
		lblYear_1_4_4.setForeground(Color.WHITE);
		lblYear_1_4_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_4.setBackground(Color.GRAY);
		lblYear_1_4_4.setBounds(25, 60, 54, 14);
		panel_1.add(lblYear_1_4_4);
		
		JLabel lblYear_1_4_5 = new JLabel("Ownership:");
		lblYear_1_4_5.setForeground(Color.WHITE);
		lblYear_1_4_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_5.setBackground(Color.GRAY);
		lblYear_1_4_5.setBounds(10, 85, 72, 14);
		panel_1.add(lblYear_1_4_5);
		
		JLabel lblYear_1_4_6 = new JLabel("MEEI:");
		lblYear_1_4_6.setForeground(Color.WHITE);
		lblYear_1_4_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_6.setBackground(Color.GRAY);
		lblYear_1_4_6.setBounds(39, 111, 37, 14);
		panel_1.add(lblYear_1_4_6);
		
		JLabel lblYear_1_4_2_1 = new JLabel("Town:");
		lblYear_1_4_2_1.setForeground(Color.WHITE);
		lblYear_1_4_2_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1.setBackground(Color.GRAY);
		lblYear_1_4_2_1.setBounds(261, 11, 45, 14);
		panel_1.add(lblYear_1_4_2_1);
		
		JLabel lblYear_1_4_3_1 = new JLabel("Zone:");
		lblYear_1_4_3_1.setForeground(Color.WHITE);
		lblYear_1_4_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_3_1.setBackground(Color.GRAY);
		lblYear_1_4_3_1.setBounds(259, 36, 37, 14);
		panel_1.add(lblYear_1_4_3_1);
		
		JLabel lblYear_1_4_4_1 = new JLabel("Country:");
		lblYear_1_4_4_1.setForeground(Color.WHITE);
		lblYear_1_4_4_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_4_1.setBackground(Color.GRAY);
		lblYear_1_4_4_1.setBounds(247, 60, 61, 14);
		panel_1.add(lblYear_1_4_4_1);
		
		JLabel lblYear_1_4_5_1 = new JLabel("Ownership:");
		lblYear_1_4_5_1.setForeground(Color.WHITE);
		lblYear_1_4_5_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_5_1.setBackground(Color.GRAY);
		lblYear_1_4_5_1.setBounds(232, 85, 87, 14);
		panel_1.add(lblYear_1_4_5_1);
		
		JLabel lblYear_1_4_6_1 = new JLabel("MEEI:");
		lblYear_1_4_6_1.setForeground(Color.WHITE);
		lblYear_1_4_6_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_6_1.setBackground(Color.GRAY);
		lblYear_1_4_6_1.setBounds(261, 111, 45, 14);
		panel_1.add(lblYear_1_4_6_1);
		
		textField_4 = new JTextField();
		textField_4.setText("125");
		textField_4.setColumns(10);
		textField_4.setBounds(83, 9, 38, 20);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("005");
		textField_5.setColumns(10);
		textField_5.setBounds(83, 58, 38, 20);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("5");
		textField_6.setColumns(10);
		textField_6.setBounds(83, 83, 22, 20);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("1");
		textField_7.setColumns(10);
		textField_7.setBounds(83, 109, 22, 20);
		panel_1.add(textField_7);
		
		JLabel lblYear_1_4_2_1_1 = new JLabel("067");
		lblYear_1_4_2_1_1.setForeground(Color.WHITE);
		lblYear_1_4_2_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1.setBackground(new Color(192, 192, 192));
		lblYear_1_4_2_1_1.setBounds(311, 9, 37, 18);
		lblYear_1_4_2_1_1.setOpaque(true);
		panel_1.add(lblYear_1_4_2_1_1);
		
		JLabel lblYear_1_4_2_1_1_1 = new JLabel("");
		lblYear_1_4_2_1_1_1.setOpaque(true);
		lblYear_1_4_2_1_1_1.setForeground(Color.WHITE);
		lblYear_1_4_2_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_1.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_1.setBounds(311, 37, 37, 18);
		panel_1.add(lblYear_1_4_2_1_1_1);
		
		JLabel lblYear_1_4_2_1_1_2 = new JLabel("003");
		lblYear_1_4_2_1_1_2.setOpaque(true);
		lblYear_1_4_2_1_1_2.setForeground(Color.WHITE);
		lblYear_1_4_2_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_2.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_2.setBounds(311, 61, 37, 18);
		panel_1.add(lblYear_1_4_2_1_1_2);
		
		JLabel lblYear_1_4_2_1_1_3 = new JLabel("5");
		lblYear_1_4_2_1_1_3.setOpaque(true);
		lblYear_1_4_2_1_1_3.setForeground(Color.WHITE);
		lblYear_1_4_2_1_1_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_3.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_3.setBounds(311, 86, 22, 18);
		panel_1.add(lblYear_1_4_2_1_1_3);
		
		JLabel lblYear_1_4_2_1_1_4 = new JLabel("1");
		lblYear_1_4_2_1_1_4.setOpaque(true);
		lblYear_1_4_2_1_1_4.setForeground(Color.WHITE);
		lblYear_1_4_2_1_1_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_4.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_4.setBounds(311, 112, 22, 18);
		panel_1.add(lblYear_1_4_2_1_1_4);
		
		JLabel lblYear_1_4_2_1_1_1_1 = new JLabel("");
		lblYear_1_4_2_1_1_1_1.setOpaque(true);
		lblYear_1_4_2_1_1_1_1.setForeground(Color.WHITE);
		lblYear_1_4_2_1_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_1_1.setBounds(84, 36, 37, 18);
		panel_1.add(lblYear_1_4_2_1_1_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(38, 226, 503, 55);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblYear_1_4 = new JLabel("NAICS 07:");
		lblYear_1_4.setForeground(Color.WHITE);
		lblYear_1_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4.setBackground(Color.GRAY);
		lblYear_1_4.setBounds(10, 20, 87, 14);
		panel_2.add(lblYear_1_4);
		
		textField_1 = new JTextField();
		textField_1.setText("454311");
		textField_1.setBounds(81, 18, 68, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblYear_1_4_1 = new JLabel("NAICS :");
		lblYear_1_4_1.setForeground(Color.WHITE);
		lblYear_1_4_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_1.setBackground(Color.GRAY);
		lblYear_1_4_1.setBounds(253, 20, 54, 14);
		panel_2.add(lblYear_1_4_1);
		
		JLabel lblYear_1_4_2_1_1_5 = new JLabel("561990");
		lblYear_1_4_2_1_1_5.setOpaque(true);
		lblYear_1_4_2_1_1_5.setForeground(Color.WHITE);
		lblYear_1_4_2_1_1_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_5.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_5.setBounds(317, 17, 68, 20);
		panel_2.add(lblYear_1_4_2_1_1_5);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.GRAY);
		panel_2_1.setBounds(73, 154, 412, 37);
		contentPane.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblYear_1_4_2_1_1_5_1 = new JLabel("2007 4");
		lblYear_1_4_2_1_1_5_1.setOpaque(true);
		lblYear_1_4_2_1_1_5_1.setForeground(new Color(64, 0, 64));
		lblYear_1_4_2_1_1_5_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_5_1.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_5_1.setBounds(310, 11, 51, 20);
		panel_2_1.add(lblYear_1_4_2_1_1_5_1);
		
		JLabel lblYear_1_4_2_1_1_5_2 = new JLabel("2008  1");
		lblYear_1_4_2_1_1_5_2.setOpaque(true);
		lblYear_1_4_2_1_1_5_2.setForeground(new Color(64, 0, 64));
		lblYear_1_4_2_1_1_5_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_5_2.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_5_2.setBounds(10, 11, 51, 20);
		panel_2_1.add(lblYear_1_4_2_1_1_5_2);
		
		JLabel lblNewLabel = new JLabel("Ars Account Information");
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setBounds(57, 11, 146, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIndustryCoding = new JLabel("Industry Coding");
		lblIndustryCoding.setForeground(Color.WHITE);
		lblIndustryCoding.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblIndustryCoding.setBackground(Color.GRAY);
		lblIndustryCoding.setBounds(57, 212, 146, 14);
		contentPane.add(lblIndustryCoding);
		
		JLabel lblNonEconimicCoding = new JLabel("Non Econimic Coding");
		lblNonEconimicCoding.setForeground(Color.WHITE);
		lblNonEconimicCoding.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNonEconimicCoding.setBackground(Color.GRAY);
		lblNonEconimicCoding.setBounds(57, 310, 146, 14);
		contentPane.add(lblNonEconimicCoding);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(38, 35, 503, 96);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.GRAY);
		
		JLabel lblYear_1 = new JLabel("year:");
		lblYear_1.setForeground(Color.WHITE);
		lblYear_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1.setBackground(Color.GRAY);
		lblYear_1.setBounds(37, 11, 44, 14);
		panel_3.add(lblYear_1);
		
		JLabel lblAccount_1 = new JLabel("Account:");
		lblAccount_1.setForeground(Color.WHITE);
		lblAccount_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblAccount_1.setBackground(Color.GRAY);
		lblAccount_1.setBounds(10, 40, 56, 14);
		panel_3.add(lblAccount_1);
		
		JLabel lblCircunstance_1 = new JLabel("Circunstance:");
		lblCircunstance_1.setForeground(Color.WHITE);
		lblCircunstance_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblCircunstance_1.setBackground(Color.GRAY);
		lblCircunstance_1.setBounds(10, 71, 146, 14);
		panel_3.add(lblCircunstance_1);
		
		textField_2 = new JTextField();
		textField_2.setText("2008");
		textField_2.setColumns(10);
		textField_2.setBounds(76, 9, 38, 20);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("00000000001");
		textField_3.setColumns(10);
		textField_3.setBounds(76, 38, 86, 20);
		panel_3.add(textField_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(97, 68, 173, 22);
		panel_3.add(comboBox_1);
		
		JLabel lblYear_1_1 = new JLabel("Batch:");
		lblYear_1_1.setForeground(Color.WHITE);
		lblYear_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_1.setBackground(Color.GRAY);
		lblYear_1_1.setBounds(236, 11, 44, 14);
		panel_3.add(lblYear_1_1);
		
		JLabel lblYear_1_2 = new JLabel("Source:");
		lblYear_1_2.setForeground(Color.WHITE);
		lblYear_1_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_2.setBackground(Color.GRAY);
		lblYear_1_2.setBounds(226, 40, 44, 14);
		panel_3.add(lblYear_1_2);
		
		JLabel lblYear_1_3 = new JLabel("current Responce Code:");
		lblYear_1_3.setForeground(Color.WHITE);
		lblYear_1_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_3.setBackground(Color.GRAY);
		lblYear_1_3.setBounds(290, 71, 151, 14);
		panel_3.add(lblYear_1_3);
		
		textField = new JTextField();
		textField.setText("00000");
		textField.setColumns(10);
		textField.setBounds(280, 9, 44, 20);
		panel_3.add(textField);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(280, 37, 101, 22);
		panel_3.add(comboBox_1_1);
		
		JLabel lblYear_1_1_1 = new JLabel(" CO:");
		lblYear_1_1_1.setForeground(Color.WHITE);
		lblYear_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_1_1.setBackground(Color.GRAY);
		lblYear_1_1_1.setBounds(405, 12, 44, 14);
		panel_3.add(lblYear_1_1_1);
		
		JLabel lblYear_1_1_2 = new JLabel("CMI:");
		lblYear_1_1_2.setForeground(Color.WHITE);
		lblYear_1_1_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_1_2.setBackground(Color.GRAY);
		lblYear_1_1_2.setBounds(405, 41, 44, 14);
		panel_3.add(lblYear_1_1_2);
		
		JLabel lblYear_1_4_2_1_1_5_1_1 = new JLabel("no");
		lblYear_1_4_2_1_1_5_1_1.setOpaque(true);
		lblYear_1_4_2_1_1_5_1_1.setForeground(new Color(64, 0, 64));
		lblYear_1_4_2_1_1_5_1_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_5_1_1.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_5_1_1.setBounds(442, 12, 51, 20);
		panel_3.add(lblYear_1_4_2_1_1_5_1_1);
		
		JLabel lblYear_1_4_2_1_1_5_1_2 = new JLabel("00");
		lblYear_1_4_2_1_1_5_1_2.setOpaque(true);
		lblYear_1_4_2_1_1_5_1_2.setForeground(new Color(64, 0, 64));
		lblYear_1_4_2_1_1_5_1_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_5_1_2.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_5_1_2.setBounds(442, 41, 51, 20);
		panel_3.add(lblYear_1_4_2_1_1_5_1_2);
		
		JLabel lblYear_1_4_2_1_1_5_1_3 = new JLabel("46");
		lblYear_1_4_2_1_1_5_1_3.setOpaque(true);
		lblYear_1_4_2_1_1_5_1_3.setForeground(new Color(64, 0, 64));
		lblYear_1_4_2_1_1_5_1_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_5_1_3.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_5_1_3.setBounds(442, 72, 51, 20);
		panel_3.add(lblYear_1_4_2_1_1_5_1_3);
		
		JLabel lblYear_1_4_2_1_1_5_1_3_1 = new JLabel("0000");
		lblYear_1_4_2_1_1_5_1_3_1.setOpaque(true);
		lblYear_1_4_2_1_1_5_1_3_1.setForeground(new Color(64, 0, 64));
		lblYear_1_4_2_1_1_5_1_3_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_5_1_3_1.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_5_1_3_1.setBounds(334, 9, 51, 20);
		panel_3.add(lblYear_1_4_2_1_1_5_1_3_1);
		
		JButton btnNewButton = new JButton("Manual Config");
		btnNewButton.setBackground(new Color(255, 128, 0));
		btnNewButton.setBounds(492, 168, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnAcceptAndSave = new JButton("Accept and save");
		btnAcceptAndSave.setBackground(new Color(255, 128, 0));
		btnAcceptAndSave.setBounds(270, 474, 128, 23);
		contentPane.add(btnAcceptAndSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(255, 128, 0));
		btnCancel.setBounds(406, 474, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHelp.setBackground(new Color(255, 128, 0));
		btnHelp.setBounds(502, 474, 79, 23);
		contentPane.add(btnHelp);
		
		JLabel lblNonEconimicCoding_1 = new JLabel("Resulting Response Code: ");
		lblNonEconimicCoding_1.setForeground(Color.WHITE);
		lblNonEconimicCoding_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNonEconimicCoding_1.setBackground(Color.GRAY);
		lblNonEconimicCoding_1.setBounds(32, 474, 171, 14);
		contentPane.add(lblNonEconimicCoding_1);
		
		JLabel lblYear_1_4_2_1_1_2_1 = new JLabel("46");
		lblYear_1_4_2_1_1_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblYear_1_4_2_1_1_2_1.setOpaque(true);
		lblYear_1_4_2_1_1_2_1.setForeground(new Color(64, 0, 64));
		lblYear_1_4_2_1_1_2_1.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblYear_1_4_2_1_1_2_1.setBackground(Color.LIGHT_GRAY);
		lblYear_1_4_2_1_1_2_1.setBounds(210, 474, 37, 18);
		contentPane.add(lblYear_1_4_2_1_1_2_1);
	}
}
