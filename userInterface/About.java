package userInterface;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("About");
		frame.setBounds(100, 100, 542, 406);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setForeground(Color.RED);
		lblAbout.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblAbout.setBounds(234, 13, 100, 51);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblmadeBymw = new JLabel("<html>\r\n\t<body>\r\n\t\t<h2>Made by:</h2>\r\n\t\t<ul>\r\n\t\t\t<li>Shreya Arora\t\t500084905</li>\r\n\t\t\t<li>Naman Shankhdhar\t\t\t500086685</li>\r\n\t\t\t<li>Molshree Gupta\t\t500086213</li>\r\n\t\t\t\r\n\t\t</ul>\r\n\t\t<h3>As a part of minor project using Java Swing under guidance of our mentor Dr. Vishal Kaushik and Activity Co-ordinator Dr. Anurag Jain.</h3>\r\n\t</body>\r\n</html>");
		lblmadeBymw.setBounds(12, 67, 500, 231);
		frame.getContentPane().add(lblmadeBymw);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBorder(BorderFactory.createMatteBorder(
                2, 2, 2, 2, Color.BLACK));
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnOk.setBounds(219, 310, 97, 45);
		frame.getContentPane().add(btnOk);
	}

}
