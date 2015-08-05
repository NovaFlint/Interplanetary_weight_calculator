package gui.com;

import java.awt.BorderLayout;

public class WBgui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WBgui frame = new WBgui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	  Create the frame.
	 */
	
	public WBgui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMars = new JButton("Mars");
		btnMars.setBounds(0, 23, 89, 23);
		contentPane.add(btnMars);
		
		final JButton btnJupiter = new JButton("Jupiter");
		btnJupiter.setBackground(Color.RED);
		btnJupiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lblMars.setForeground(Color.RED);
				if (btnJupiter.getBackground().equals(Color.RED)){
				btnJupiter.setBackground(Color.BLUE);
				}
				else{
					btnJupiter.setBackground(Color.RED);
				}
			}
		});
		btnJupiter.setForeground(Color.RED);
		btnJupiter.setBounds(0, 0, 89, 23);
		contentPane.add(btnJupiter);
		
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("with space suit");
		tglbtnNewToggleButton.setBounds(280, 105, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JButton btnNewButton = new JButton("Earth");
		btnNewButton.setBounds(0, 46, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("the moon");
		btnNewButton_1.setBounds(0, 69, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnPluto = new JButton("Pluto");
		btnPluto.setBounds(0, 92, 89, 23);
		contentPane.add(btnPluto);
		
		JButton btnTheSun = new JButton("the Sun");
		btnTheSun.setBounds(0, 115, 89, 23);
		contentPane.add(btnTheSun);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setToolTipText("frog");
		scrollBar.setBounds(417, 0, 17, 261);
		contentPane.add(scrollBar);
		
		final JLabel lblMars = new JLabel("selected planet : Mars");
		lblMars.setForeground(Color.RED);
		lblMars.setBackground(Color.RED);
		lblMars.setBounds(99, 4, 152, 14);
		contentPane.add(lblMars);
		
		JButton btn = new JButton("clicksound");
		btn.setVisible(false);
		btn.setBounds(255, 46, 89, 23);
		contentPane.add(btn);
		
		JLabel lblGravityFactor = new JLabel("gravity factor : 0.38");
		lblGravityFactor.setBackground(Color.RED);
		lblGravityFactor.setForeground(Color.RED);
		lblGravityFactor.setBounds(99, 27, 152, 14);
		contentPane.add(lblGravityFactor);
		
		JTextArea txtOutput = new JTextArea();
		txtOutput.setEditable(false);
		txtOutput.setText("output");
		txtOutput.setRows(10);
		txtOutput.setLineWrap(true);
		txtOutput.setBounds(110, 132, 234, 118);
		contentPane.add(txtOutput);
	//}
}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
