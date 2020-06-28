package Shop;

import instruments.Instrument;
import org.junit.Before;
import org.junit.Test;
import instruments.Guitar;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    ArrayList<Instrument> stockForSale;
    Instrument instrument;
    Instrument guitar1;

    @Before
    public void before(){
        guitar = new Guitar("Les Paul", "Gibson", 1000, 1200, 6);
        shop = new Shop(1,stockForSale);
    }

    @Test
    public void getMarkUp() {
        instrument = new Instrument("Les Paul", "bla", 1000, 1100) {
        };
        assertEquals(100, shop.markUp(instrument));
    }

    @Test
    public void canAddItem(){
        shop.addToStock(guitar);
        assertEquals(1, shop.checkStock());
    }

    @Test
    public void canRemoveItem(){
        shop.addToStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.checkStock());
    }

}

