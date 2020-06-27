package Shop;

import Behaviours.ISell;
import instruments.Guitar;
import instruments.Instrument;

import java.util.ArrayList;

public class Shop implements ISell {

    private int markUp;
    private ArrayList<Instrument> stockForSale;

    public Shop(int markUp, ArrayList<Instrument> stockForSale){
        this.markUp = markUp;
        this.stockForSale = new ArrayList<Instrument>();
    }


    public void addToStock(Instrument instrument){
        stockForSale.add(instrument);
    }

    public int markUp() {
        return 0;
    }

    public int checkStock() {
        return stockForSale.size();
    }

    public void removeStock(Guitar guitar) {
        stockForSale.remove(guitar);
    }
}
