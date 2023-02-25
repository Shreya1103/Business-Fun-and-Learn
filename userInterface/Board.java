package userInterface;

import internalCode.*;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Board {

	public JFrame frame;
	private ArrayList<JLabel> cells = new ArrayList<JLabel>();
	public ArrayList<Object> cellList = new ArrayList<Object>();
	public JLabel p0;
	public JLabel p1;
	public JLabel p2;
	public JLabel p3;
	public JPanel panel_1;
	public boolean turnStarted = false;
	public MainGame gameMaster;
	public JLabel lblPlayer;
	public JLabel label_1;
	public JButton btnPlay;
	public JButton btnBuyProperty;
	public JButton btnTrade;
	public JButton btnPickCard;
	public JButton btnPayBail;
	public JButton btnEndTurn;
	public int i = 1;
	public JPanel pnlPlr1;
	public JPanel pnlPlr2;
	public JPanel pnlPlr3;
	public JPanel pnlPlr4;
	public JLabel plr1;
	public JLabel plr2;
	public JLabel plr3;
	public JLabel plr4;
	public JLabel lblmp1;
	public JLabel lblmp2;
	public JLabel lblmp3;
	public JLabel lblmp4;
	public JLabel lblRent;
	
	/**
	 * Create the application.
	 */
	public Board(int choice) {
		gameMaster = MainGame.instance();
		initialize(choice);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int choice) {
		
		cellList = MainGame.instance().cellList;
		frame = new JFrame();
		frame.setTitle("Business Fun And Learn");
		frame.setResizable(false);
		frame.setBounds(100, 100, 910, 930);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = (JPanel)frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
				
				// The "GO" label
				JLabel label = new JLabel("");
				label.setBounds(718, 644, 119, 116);
				frame.getContentPane().add(label);
				cells.add(label);
				label.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						StartBox x = (StartBox) cellList.get(0);
						@SuppressWarnings("unused")
						PropertyInfo disp = new PropertyInfo(x);
					}
				});
				
				// The labels between 1 and 8
				int arg0 = 668;
				for (int i = 1; i < 9; i++) {
					JLabel x = new JLabel();
					x.setBounds(arg0, 664, 69, 116);
					frame.getContentPane().add(x);
					
					x.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							Box y = (Box) cellList.get(cells.indexOf(x));
							@SuppressWarnings("unused")
							PropertyInfo disp = new PropertyInfo(y);
						}
					});
					
					cells.add(x);
					arg0 = arg0 - 73;
				}
				
				// The "Jail" label
				JLabel label_10 = new JLabel("");
				label_10.setBounds(0, 664, 119, 116);
				frame.getContentPane().add(label_10);
				label_10.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Box x = (Box) cellList.get(cells.indexOf(label_10));
						@SuppressWarnings("unused")
						PropertyInfo disp = new PropertyInfo(x);
					}
				});
				cells.add(label_10);

				
				int arg1 = 597;
				
				// Labels between 10 and 17
				for (i = 10; i < 18; i++) {
					JLabel x = new JLabel();
					x.setBounds(0, arg1, 119, 78);
					frame.getContentPane().add(x);
					x.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							Box y = (Box) cellList.get(cells.indexOf(x));
							@SuppressWarnings("unused")
							PropertyInfo disp = new PropertyInfo(y);
						}
					});
					cells.add(x);
					arg1 = arg1 - 64;
				}
				
				
				
				// The "Club" label
				JLabel label_18 = new JLabel("");
				label_18.setBounds(0, 0, 119, 116);
				frame.getContentPane().add(label_18);
				label_18.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Box x = (Box) cellList.get(cells.indexOf(label_18));
						@SuppressWarnings("unused")
						PropertyInfo disp = new PropertyInfo(x);
					}
				});
				cells.add(label_18);
//				
//				// The "Free parking" label
//				JLabel label_20 = new JLabel("");
//				label_20.setBounds(0, 0, 119, 116);
//				frame.getContentPane().add(label_20);
//				label_20.addMouseListener(new MouseAdapter() {
//					public void mouseClicked(MouseEvent e) {
//						Box x = (Box) cellList.get(cells.indexOf(label_20));
//						@SuppressWarnings("unused")
//						PropertyInfo disp = new PropertyInfo(x);
//					}
//				});
//				cells.add(label_20);
//				
				int arg2 = 165;
				
				// Labels between 19 and 27
				for (i = 19; i < 27; i++) {
					JLabel x = new JLabel();
					x.setBounds(arg2, 0, 74, 116);
					frame.getContentPane().add(x);
					x.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							Box y = (Box) cellList.get(cells.indexOf(x));
							@SuppressWarnings("unused")
							PropertyInfo disp = new PropertyInfo(y);
						}
					});
					cells.add(x);
					arg2 = arg2 + 71;
				}
				
				// The "Rest House" label
				JLabel label_27 = new JLabel("");
				label_27.setBounds(739, 0, 119, 116);
				frame.getContentPane().add(label_27);
				label_27.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Box x = (Box) cellList.get(cells.indexOf(label_27));
						@SuppressWarnings("unused")
						PropertyInfo disp = new PropertyInfo(x);
					}
				});
				cells.add(label_27);

				int arg3 = 148;
				
				// Labels between 28 and 36
				for (i = 28; i < 36; i++) {
					JLabel x = new JLabel();
					x.setBounds(737, arg3, 119, 71);
					frame.getContentPane().add(x);
					x.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent e) {
							Box y = (Box) cellList.get(cells.indexOf(x));
							@SuppressWarnings("unused")
							PropertyInfo disp = new PropertyInfo(y);
						}
					});
					cells.add(x);
					arg3 = arg3 + 66;
				}
		
		
		pnlPlr1 = new JPanel();
		pnlPlr1.setOpaque(false);
		pnlPlr1.setBounds(127, 129, 196, 148);
		frame.getContentPane().add(pnlPlr1);
		pnlPlr1.setLayout(null);
		
//		JLabel lblPlayer_1 = new JLabel("Player 1");
//		lblPlayer_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lblPlayer_1.setBounds(45, 20, 70, 20);
//		pnlPlr1.add(lblPlayer_1);
		
		plr1 = new JLabel("");
		plr1.setHorizontalAlignment(SwingConstants.CENTER);
		plr1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		plr1.setBounds(45, 20, 70, 20);
//		plr1.setBounds(23, 56, 150, 25);
		pnlPlr1.add(plr1);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBackground(Color.RED);
		label_2.setBounds(120, 22, 37, 25);
		pnlPlr1.add(label_2);
		
		JLabel lblMoney = new JLabel("Money");
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMoney.setBounds(45, 52, 56, 25);
		pnlPlr1.add(lblMoney);
		
		lblmp1 = new JLabel("");
		lblmp1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmp1.setBounds(99, 52, 94, 25);
		pnlPlr1.add(lblmp1);
		
		pnlPlr2 = new JPanel();
		pnlPlr2.setOpaque(false);
		pnlPlr2.setBounds(577, 129, 196, 148);
		frame.getContentPane().add(pnlPlr2);
		pnlPlr2.setLayout(null);
		
//		JLabel lblPlayer_2 = new JLabel("Player 2");
//		lblPlayer_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lblPlayer_2.setBounds(50, 20, 70, 20);
//		pnlPlr2.add(lblPlayer_2);
		
		plr2 = new JLabel("");
		plr2.setHorizontalAlignment(SwingConstants.CENTER);
		plr2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		plr2.setBounds(50, 20, 70, 20);
//		plr2.setBounds(22, 46, 150, 25);
		pnlPlr2.add(plr2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBackground(Color.BLUE);
		label_3.setOpaque(true);
		label_3.setBounds(120, 22, 37, 25);
		pnlPlr2.add(label_3);
		
		JLabel label_7 = new JLabel("Money");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(50, 52, 56, 25);
		pnlPlr2.add(label_7);
		
		lblmp2 = new JLabel("");
		lblmp2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmp2.setBounds(104, 52, 94, 25);
		pnlPlr2.add(lblmp2);
		
		pnlPlr3 = new JPanel();
		pnlPlr3.setOpaque(false);
		pnlPlr3.setBounds(127, 620, 196, 148);
		frame.getContentPane().add(pnlPlr3);
		pnlPlr3.setLayout(null);
		
//		JLabel lblPlayer_3 = new JLabel("Player 3");
//		lblPlayer_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lblPlayer_3.setBounds(45, 20, 70, 20);
//		pnlPlr3.add(lblPlayer_3);

		plr3 = new JLabel("");
		plr3.setHorizontalAlignment(SwingConstants.CENTER);
		plr3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		plr3.setBounds(45, 20, 70, 20);
//		plr3.setBounds(22, 46, 150, 25);
		pnlPlr3.add(plr3);
		
		JLabel label_4 = new JLabel("");
		label_4.setOpaque(true);
		label_4.setBackground(Color.GREEN);
		label_4.setBounds(120, 14, 37, 25);
		pnlPlr3.add(label_4);
	
		JLabel label_9 = new JLabel("Money");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_9.setBounds(45, -6, 56, 25);
		pnlPlr3.add(label_9);
		
		lblmp3 = new JLabel("");
		lblmp3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmp3.setBounds(99, -6, 94, 25);
		pnlPlr3.add(lblmp3);
		
		pnlPlr4 = new JPanel();
		pnlPlr4.setOpaque(false);
		pnlPlr4.setBounds(577, 620, 196, 148);
		frame.getContentPane().add(pnlPlr4);
		pnlPlr4.setLayout(null);
		
//		JLabel lblPlayer_4 = new JLabel("Player 4");
//		lblPlayer_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		lblPlayer_4.setBounds(50, 20, 70, 20);
//		pnlPlr4.add(lblPlayer_4);
		
		plr4 = new JLabel("");
		plr4.setHorizontalAlignment(SwingConstants.CENTER);
		plr4.setFont(new Font("Tahoma", Font.PLAIN, 16));
//		plr4.setBounds(50, 20, 70, 20);
		plr4.setBounds(50, 20, 70, 20);
		pnlPlr4.add(plr4);
//		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.YELLOW);
		label_5.setBounds(120, 14, 37, 25);
		pnlPlr4.add(label_5);
////		
		JLabel label_12 = new JLabel("Money");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_12.setBounds(45, -8, 56, 25);
		pnlPlr4.add(label_12);
////		
		lblmp4 = new JLabel("");
		lblmp4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmp4.setBounds(45, -8, 60, 25);
		pnlPlr4.add(lblmp4);
		
		// Player 1
		p0 = new JLabel("1");
		p0.setOpaque(true);
		p0.setBackground(Color.RED);
		p0.setBounds(771, 737, 20, 20);
		frame.getContentPane().add(p0);
		// Player 2
		p1 = new JLabel("2");
		p1.setBackground(Color.BLUE);
		p1.setOpaque(true);
		p1.setBounds(771, 737, 20, 20);
		frame.getContentPane().add(p1);
		
		// Player 3
		p2 = new JLabel("3");
		p2.setOpaque(true);
		p2.setBackground(Color.GREEN);
		p2.setBounds(771, 737, 20, 20);
		frame.getContentPane().add(p2);
		if (choice < 3) {
			p2.setVisible(false);
			pnlPlr3.setVisible(false);
		}
		
		// Player 4
		p3 = new JLabel("4");
		p3.setBackground(Color.YELLOW);
		p3.setOpaque(true);
		p3.setBounds(771, 737, 20, 20);
		frame.getContentPane().add(p3);
		if (choice < 4) {
			p3.setVisible(false);
			pnlPlr4.setVisible(false);
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(270, 270, 390, 300);
		panel_1.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel_1);
		panel_1.setBorder(BorderFactory.createMatteBorder(
                5, 5, 5, 5, Color.BLACK));
		panel_1.setLayout(null);
		
		lblPlayer = new JLabel("Player:");
		lblPlayer.setForeground(Color.BLACK);
		lblPlayer.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPlayer.setBounds(100, 18, 100, 27);
		panel_1.add(lblPlayer);
		
		label_1 = new JLabel();
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setForeground(Color.BLACK);
		label_1.setBounds(175, 22, 180, 20);
		panel_1.add(label_1);
		
		
		btnPlay = new JButton("Roll the dice!");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gameMaster.btnPlayClicked();
			}
		});
		btnPlay.setEnabled(false);
		btnPlay.setBounds(100, 60, 172, 40);
		btnPlay.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlay.setBorder(BorderFactory.createMatteBorder(
                2, 2, 2, 2, Color.BLACK));
		panel_1.add(btnPlay);
		
		btnBuyProperty = new JButton("Buy Property");
		btnBuyProperty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnBuyPropertyClicked();
			}
			
		});

		btnBuyProperty.setEnabled(false);
		btnBuyProperty.setBounds(100, 100, 172, 40);
		btnBuyProperty.setBorder(BorderFactory.createMatteBorder(
                2, 2, 2, 2, Color.BLACK));
		btnBuyProperty.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnBuyProperty);
		
		
		btnPickCard = new JButton("Pick a card");
		
		btnPickCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnPickCardClicked();
			}
		});

		btnPickCard.setEnabled(false);
		btnPickCard.setBounds(100, 140, 172, 40); 
		btnPickCard.setBorder(BorderFactory.createMatteBorder(
                2, 2, 2, 2, Color.BLACK));
		btnPickCard.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnPickCard);
		
		btnPayBail = new JButton("Pay Bail");
		btnPayBail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnPayBailClicked();
			}
		});

		btnPayBail.setEnabled(false);
		btnPayBail.setBounds(100, 180, 172, 40);
		btnPayBail.setBorder(BorderFactory.createMatteBorder(
                2, 2, 2, 2, Color.BLACK));
		btnPayBail.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnPayBail);
		
		btnTrade = new JButton("Trade");
		btnTrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnTradeClicked();
			}
		});
		btnTrade.setEnabled(true);								// The trade is the evergreen button
		btnTrade.setBounds(100, 220, 172, 40);
		btnTrade.setBorder(BorderFactory.createMatteBorder(
                2, 2, 2, 2, Color.BLACK));
		btnTrade.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnTrade);
		
		btnEndTurn = new JButton("End Turn");
		btnEndTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnEndTurnClicked();
			}
		});
		btnEndTurn.setEnabled(false);
		btnEndTurn.setBounds(100, 260, 172, 40);
		btnEndTurn.setBorder(BorderFactory.createMatteBorder(
                2, 2, 2, 2, Color.BLACK));
		btnEndTurn.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnEndTurn);
		
		lblRent = new JLabel("");
		lblRent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRent.setBounds(562, 373, 191, 54);
		frame.getContentPane().add(lblRent);
		
		
		JLabel bgLbl = new JLabel();
		bgLbl.setBounds(0, 0, 925, 800);
		bgLbl.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Board.class.getResource("/media/screen2.jpg"))));
		panel.add(bgLbl);
		frame.setLocationRelativeTo(null);
		}
			public void setPlayerPos(int pos, Player plr) {
				JLabel pLabel = plr.lbl;
				JLabel cell = cells.get(pos);
				int index = plr.getIndex();
				int mpy = cell.getHeight() / 2;
				int mpx = cell.getWidth() / 2;
				int x = cell.getX();
				int y = cell.getY();
				
				int x_new = x + mpx;
				int y_new = y + mpy;
				
				if (index == 0) {
					pLabel.setBounds(x_new-20, y_new-20, 20, 20);
				}
				else if (index == 1) {
					pLabel.setBounds(x_new-20, y_new, 20, 20);
				}
				else if (index == 2) {
					pLabel.setBounds(x_new, y_new-20, 20, 20);
				}
				else {
					pLabel.setBounds(x_new, y_new, 20, 20);
				}
			}
	
}
