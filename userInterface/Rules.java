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

public class Rules {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public Rules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Rules");
		frame.setBounds(100, 100, 796, 744);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRukes = new JLabel("Rules");
		lblRukes.setForeground(Color.RED);
		lblRukes.setFont(new Font("Tahoma", Font.BOLD, 51));
		lblRukes.setBounds(335, 35, 150, 83);
		frame.getContentPane().add(lblRukes);
		
		JLabel lblhello = new JLabel("<html>\r\n\t<body>\r\n\t\t<ul>\r\n\t\t\t<li>When it is a player's turn, they must roll the dice and advance their token by the number of spaces indicated by the roll of the dice.</li>\r\n\t\t\t<li>If the player lands on an unowned property, he or she may buy it for the price listed on that property's space. If he or she agrees to buy it, he or she pays the Bank the amount shown on the property space and receives the deed for that property.</li>\r\n\t\t\t<li>If the player lands on an unmortgaged property owned by another player, he or she pays rent to that person, as specified on the property's deed.</li>\r\n<li>If the player lands on his or her own property, nothing happens.</li>\r\n<li>If the player lands on Tax, he or she must pay the Bank $200.</li>\r\n<li>If the player lands on a Chance or Community Chest, the player gets to pick a card and performs the instruction given on the card.</li>\r\n<li>If the player lands on the Jail space, he or she is jailed.</li>\r\n</li>If the player lands on or passes Go in the course of his or her turn, he or she receives $1000 from the Bank.</li>\r\n</body></html>");
		lblhello.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblhello.setBounds(12, 113, 754, 530);
		frame.getContentPane().add(lblhello);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBorder(BorderFactory.createMatteBorder(
                2, 2, 2, 2, Color.BLACK));
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnOk.setBounds(328, 600, 97, 50);
		frame.getContentPane().add(btnOk);
	}
}
