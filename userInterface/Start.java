package userInterface;

import internalCode.*;

import internalCode.MainGame;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
public class Start {
	
	private MainGame gameMaster;
	private Board gameBoard;
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblPlayer_2;
	private JLabel lblPlayer_3;
	private JButton btnStart;
	private JButton btnRules;
	private JButton btnAbout;
	private static Integer[] plrs = {2,3};
	private int choice = 2;
	private ArrayList<String> players = new ArrayList<String>();
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		  try {         
	          	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());     
	     	}catch (ClassNotFoundException e) {
	     	        e.printStackTrace();     
	        }catch (InstantiationException e) {   
	                e.printStackTrace();     
	        }catch (IllegalAccessException e) {         
	        		e.printStackTrace();
	        } catch (UnsupportedLookAndFeelException e) {
	                e.printStackTrace();
	        }
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Business Fun And Learn");
		frame.setBounds(100, 100, 715, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		Container c=frame.getContentPane();
		c.setBackground(Color.BLACK);
		
		JLabel lblBusiness = new JLabel("Business Fun And Learn");
		lblBusiness.setForeground(Color.CYAN);
		lblBusiness.setFont(new Font("Tahoma", Font.TYPE1_FONT, 52));
		lblBusiness.setBounds(30, 2, 800, 100);
		lblBusiness.setPreferredSize(lblBusiness.getPreferredSize());
		frame.getContentPane().add(lblBusiness);
		
		JLabel lblPlayer = new JLabel("Player 1");
		lblPlayer.setBounds(450, 148, 56, 40);
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlayer.setForeground(Color.yellow);
		frame.getContentPane().add(lblPlayer);
		
		textField = new JTextField();
		textField.setBounds(450, 181, 130, 28);
		textField.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		lblPlayer_1.setBounds(450, 210, 56, 40);
		lblPlayer_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlayer_1.setForeground(Color.yellow);
		frame.getContentPane().add(lblPlayer_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(450, 243, 130, 28);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String plr0 = textField.getText();
				String plr1 = textField_1.getText();
				players.add(plr0);
				players.add(plr1);
				if (choice == 3) {
					String plr2 = textField_2.getText();
					players.add(plr2);
				}
				else if (choice == 4) {
					String plr3 = textField_3.getText();
					players.add(plr3);
				}
				//Everything starts from here.
				//Check for empty player names.
				for (String x: players) {
					if (x.equals("")) {
						label.setText("<html><body><h3>Enter a valid player name!</h3></body></html>");
						players.clear();
						return;
					}
				}
				
				//Check for duplicate names.
				for (int i = 0; i < players.size() - 1; i++) {
					for (int j = i+1; j < players.size(); j++) {
						if (players.get(i).equals(players.get(j))) {
							label.setText("<html><body><h3>Same player names cannot be assigned!</h3></body></html>");
							players.clear();
							return;
						}
					}
				}
				
				frame.dispose();
				gameMaster = MainGame.instance();
				gameBoard = new Board(choice);
				gameMaster.setGameBoard(gameBoard);
				gameMaster.setPlayers(players);
				gameMaster.startGame();
				//And it ends here. Add start game method before ending this method.
			}
		});
		btnStart.setBounds(450, 434, 108, 73);
		btnStart.setBackground(Color.green);
		btnStart.setForeground(Color.RED);
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(btnStart);
		
		btnRules = new JButton("Rules");
		btnRules.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Rules r = new Rules();
				r.frame.setVisible(true);
			}
		});
		btnRules.setBounds(60, 434, 97, 73);
		btnRules.setBackground(Color.green);
		btnRules.setForeground(Color.RED);
		frame.getContentPane().add(btnRules);
		
		btnAbout = new JButton("About");
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About a = new About();
				a.frame.setVisible(true);
			}
		});
		btnAbout.setBounds(210, 434, 97, 73);
		btnAbout.setForeground(Color.RED);
		btnAbout.setBackground(Color.green);
		frame.getContentPane().add(btnAbout);
		
		JLabel lblSelectTheNo = new JLabel("Select the no. of players");
		lblSelectTheNo.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSelectTheNo.setBounds(60, 148, 350, 40);
		lblSelectTheNo.setForeground(Color.cyan);
		frame.getContentPane().add(lblSelectTheNo);
		
		lblPlayer_2 = new JLabel("Player 3");
		lblPlayer_2.setVisible(false);
		lblPlayer_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlayer_2.setBounds(450, 281, 56, 16);
		lblPlayer_2.setForeground(Color.YELLOW);
		frame.getContentPane().add(lblPlayer_2);
		
		textField_2 = new JTextField();
		textField_2.setVisible(false);
		textField_2.setColumns(10);
		textField_2.setBounds(450, 301, 130, 28);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(textField_2);
		
		lblPlayer_3 = new JLabel("Player 4");
		lblPlayer_3.setVisible(false);
		lblPlayer_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlayer_3.setForeground(Color.YELLOW);
		lblPlayer_3.setBounds(450, 342, 56, 16);
		frame.getContentPane().add(lblPlayer_3);
		
		textField_3 = new JTextField();
		textField_3.setVisible(false);
		textField_3.setColumns(10);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setBounds(450, 363, 130, 28);
		frame.getContentPane().add(textField_3);
		JComboBox<Integer> comboBox = new JComboBox<Integer>(plrs);
		comboBox.setBounds(345, 155, 65, 28);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(comboBox);
		
		comboBox.addItemListener(new ItemListener(){

			//This is used to change the number of players dynamically.
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				choice = (int) arg0.getItem();
				if (choice == 2) {
					lblPlayer_2.setVisible(false);
					textField_2.setVisible(false);
					lblPlayer_3.setVisible(false);
					textField_3.setVisible(false);
				}
				else if (choice == 3) {
					lblPlayer_2.setVisible(true);
					textField_2.setVisible(true);
					lblPlayer_3.setVisible(false);
					textField_3.setVisible(false);
				}
				else if (choice == 4) {
					lblPlayer_2.setVisible(true);
					textField_2.setVisible(true);
					lblPlayer_3.setVisible(true);
					textField_3.setVisible(true);
				}
			}
			
		});
		
		// Label for displaying error messages.
		label = new JLabel("");
		label.setBounds(54, 230, 237, 137);
		label.setForeground(Color.CYAN);
		frame.getContentPane().add(label);
	}
}