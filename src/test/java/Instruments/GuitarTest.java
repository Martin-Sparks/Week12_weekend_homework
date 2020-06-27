package Instruments;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void before(){
        guitar1 = new Guitar("Les Paul", "Electric", 1000,1300, 6);
    }

    @Test
    public void getName(){
        assertEquals("Les Paul", guitar1.getName());
    }

    @Test
    public void setName(){
        guitar1.setName("Telecaster");
        assertEquals("Telecaster", guitar1.getName());
    }

    @Test
    public void getTpye(){
        assertEquals("Electric", guitar1.getType());
    }

    @Test
    public void setType(){
        guitar1.setType("Stratocaster");
        assertEquals("Stratocaster", guitar1.getType());
    }

    @Test
    public void getBuyValue(){
        assertEquals(1000, guitar1.getBuyvalue());
    }

    @Test
    public void setBuyValue(){
        guitar1.setBuyvalue(1100);
        assertEquals(1100, guitar1.getBuyvalue());
    }

    @Test
    public void getSellValue(){
        assertEquals(1300, guitar1.getSellvalue());
    }

    @Test
    public void setSellValue(){
        guitar1.setSellvalue(1400);
        assertEquals(1400, guitar1.getSellvalue());
    }

    @Test
    public void getSound(){
        String results = guitar1.play("G#");
        assertEquals("Play sound G#", results);
    }

    @Test
    public void getStrings(){
        assertEquals(6, guitar1.getStrings());
    }

    @Test
    public void setStings(){
        guitar1.setStrings(7);
        assertEquals(7, guitar1.getStrings());
    }

}
