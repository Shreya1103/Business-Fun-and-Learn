package internalCode;
import java.util.ArrayList;

import internalCode.ChanceBox;
import internalCode.Club;
import internalCode.GiftBox;
import internalCode.Jail;
import internalCode.Property;
import internalCode.RestHouse;
import internalCode.StartBox;
import internalCode.TaxBox;

public class BoardConstructor {
public ArrayList<Object> cellList = new ArrayList<Object>();
	public ArrayList<Object> read() {
				cellList.add(new StartBox());
				cellList.add(new Property("USA",1,7500,"Brown"));
				cellList.add(new Property("TRAVEL",2,9000,"Brown"));
        		cellList.add(new Property("SWEDEN",3,7000,"Green"));
                cellList.add(new Property("ARGENTINA",4,4400,"Green"));
                cellList.add(new TaxBox(5,200));
                cellList.add(new Property("LIGHT",6,5500,null));
                cellList.add(new ChanceBox(7));
                cellList.add(new Property("TRANSPORT",8,3800,"Yellow"));
                cellList.add(new Jail(9));
                cellList.add(new Property("PERU",10,9000,"Yellow"));
                cellList.add(new Property("NORWAY",11,4000,null));
                cellList.add(new Property("DENMARK",12,3200,"Red"));
                cellList.add(new Property("SHIP",13,6500,"Red"));
                cellList.add(new Property("COLOMBIA",14,2500,"Red"));
                cellList.add(new Property("HONG-KONG",15,2500,"Orange"));
                cellList.add(new GiftBox(16));
                cellList.add(new Property("PORTUGAL",17,6500,"Orange"));
                cellList.add(new Club(18));
                cellList.add(new Property("AFRICA",19,7500,"Orange"));
                cellList.add(new ChanceBox(20));
                cellList.add(new Property("UK",21,3500,null));
                cellList.add(new Property("BELGIUM",22,4100,"Pink"));
                cellList.add(new Property("MALAYSIA",23,3000,"Pink"));
                cellList.add(new TaxBox(24,200));
                cellList.add(new Property("PHILIPPI",25,3000,null));
                cellList.add(new Property("SWITZERALAND",26,2100,"Pink"));
                cellList.add(new RestHouse(27));
                cellList.add(new Property("BRAZIL",28,5500,"Blue"));
                cellList.add(new GiftBox(29));
                cellList.add(new Property("INDIA",30,8000,"Orange"));
                cellList.add(new Property("NEWZELAND",31,5000,"Blue"));
                cellList.add(new Property("INDONESIA",32,3500,null));
                cellList.add(new Property("CHINA",33,3000,null));
                cellList.add(new Property("AEROPLANE",34,10500,null));
                cellList.add(new Property("RUSSIA",35,4400,null));
                return cellList;
	}
}
