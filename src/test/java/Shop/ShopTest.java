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

    @Before
    public void before(){
        guitar = new Guitar("Les Paul", "Gibson", 1000, 1200, 6);
        shop = new Shop(1,stockForSale);
    }

//    @Test
//    public void getMarkUp() {
//        assertEquals();
//    }

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

