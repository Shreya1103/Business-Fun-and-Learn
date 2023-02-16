package internalCode;

public class ChanceBox extends Box{
	public ChanceBox(int pos) {
		setPosition(pos);
		setName("Chance");
		setBuyable(false);
		setColourGroup("None");
		setChance(true);
	}
}
