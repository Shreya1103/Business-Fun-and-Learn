package internalCode;

import java.util.ArrayList;
import javax.swing.JLabel;

public class Player {
	
	public JLabel lbl;
	private String name;
	private int index;
	private int colour;
	private int money = 0;
	private int position = 0;
	private boolean inJail = false;
	private boolean isOut = false;
	private ArrayList<Property> properties = new ArrayList<Property>();
	public int lastRollValue = 0;
	
	public Player(JLabel x){
		this.lbl = x;
	}

	public String getName() {
		return name;
	}

	public int getColour() {
		return colour;
	}

	
	public int getIndex() {
		return index;
	}

	
	public void setIndex(int index) {
		this.index = index;
	}
	
	
	public void setColour(int colour) {
		this.colour = colour;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	/**
	 * @param money : the money to be added
	 * This method adds the money to the player
	 */
	public void addMoney(int add) {
		this.money = this.money + add;
	}
	
	/**
	 * @param money : the money to be subtracted
	 * This method subtracts the money from the player
	 */
	public void subMoney(int sub) {
		this.money = this.money - sub;
	}
	

	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	
	public boolean isInJail() {
		return inJail;
	}

	
	public void setInJail(boolean inJail) {
		this.inJail = inJail;
	}

	
	public boolean getIsOut() {
		return isOut;
	}

	
	public void setOut(boolean isOut) {
		this.isOut = isOut;
	}
	
	public void addProperty(Property a) {
		properties.add(a);
	}
	
	public ArrayList<Property> getPropertyList() {
		return properties;
	}
	
	public void removeProperty(Property e) {
		properties.remove(e);
	}
	
	public ArrayList<Integer> rollDice() {
		Dice die = new Dice();
		int a = die.roll();
		int b = die.roll();
		int value = a + b;
		ArrayList<Integer> dice = new ArrayList<Integer>();
		dice.add(a);
		dice.add(b);
		dice.add(value);
		lastRollValue = value;
		return dice;
	}
	
	public void destroy() {
		if (getIsOut()) {
			lbl.setVisible(false);
			for (Property x : properties) {
				x.setPowner(null);
				x.setOwner("Bank");
			}
		}
	}
	
}