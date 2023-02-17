package internalCode;

public class GiftBox extends Box{
public GiftBox(int pos) {
		
		setPosition(pos);
		setName("Community Chest");
		setBuyable(false);
		setColourGroup("None");
		setCommunity_chest(true);
	}

}
