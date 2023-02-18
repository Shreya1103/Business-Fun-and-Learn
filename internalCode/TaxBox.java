package internalCode;

public class TaxBox extends Box{
	public TaxBox(int pos, int value) {
		setPosition(pos);
		setName("Income Tax");
		setBuyable(false);
		setColourGroup("None");
		setRent(value);
		setTaxCollection(true);
	}
}
