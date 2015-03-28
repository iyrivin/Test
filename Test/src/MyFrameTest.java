
import java.awt.*;

import javax.swing.*;

class MyFrame extends JFrame{
	
	JButton btnOK;
	JLabel lblID, lblPW;
	JTextField txtID, txtPW;
	
	public MyFrame() {
		this.setSize(450, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		JPanel loginPanel = new JPanel();
		loginPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lblID = new JLabel("ID : ");
		txtID = new JTextField(10);
		
		loginPanel.add(lblID); loginPanel.add(txtID);
		this.add(loginPanel, BorderLayout.WEST);
		
		JPanel logpwPanel = new JPanel();
		logpwPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lblPW = new JLabel("PASSWORD : ");
		txtPW = new JTextField(10);
		
		logpwPanel.add(lblPW); logpwPanel.add(txtPW);
		this.add(logpwPanel, BorderLayout.EAST);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		btnOK = new JButton("Login");
		
		btnPanel.add(btnOK);
		this.add(btnPanel, BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(true);
	}
}

public class MyFrameTest {

	public static void main(String[] args) {
		new MyFrame();

	}

}
