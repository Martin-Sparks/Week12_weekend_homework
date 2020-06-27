package Instruments;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {


     Piano piano1;

        @Before
        public void before(){
            piano1 = new Piano("Les Paul", "Electric", 1000,1300, 72);
        }

        @Test
        public void getName(){
            assertEquals("Les Paul", piano1.getName());
        }

        @Test
        public void setName(){
            piano1.setName("Telecaster");
            assertEquals("Telecaster", piano1.getName());
        }

        @Test
        public void getTpye(){
            assertEquals("Electric", piano1.getType());
        }

        @Test
        public void setType(){
            piano1.setType("Stratocaster");
            assertEquals("Stratocaster", piano1.getType());
        }

        @Test
        public void getBuyValue(){
            assertEquals(1000, piano1.getBuyvalue());
        }

        @Test
        public void setBuyValue(){
            piano1.setBuyvalue(1100);
            assertEquals(1100, piano1.getBuyvalue());
        }

        @Test
        public void getSellValue(){
            assertEquals(1300, piano1.getSellvalue());
        }

        @Test
        public void setSellValue(){
            piano1.setSellvalue(1400);
            assertEquals(1400, piano1.getSellvalue());
        }

    @Test
    public void getSound(){
        String results = piano1.play("C#");
        assertEquals("Play keys C#", results);
    }

    @Test
    public void getKeys(){
            assertEquals(72, piano1.getKeys());
    }

    @Test
    public void setKeys(){
            piano1.setKeys(10);
            assertEquals(10, piano1.getKeys());
    }

    }

