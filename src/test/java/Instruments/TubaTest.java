package Instruments;

import instruments.Tuba;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

        Tuba tuba1;

        @Before
        public void before(){
            tuba1 = new Tuba("Les Paul", "Electric", 1000,1300);
        }

        @Test
        public void getName(){
            assertEquals("Les Paul", tuba1.getName());
        }

        @Test
        public void setName(){
            tuba1.setName("Telecaster");
            assertEquals("Telecaster", tuba1.getName());
        }

        @Test
        public void getTpye(){
            assertEquals("Electric", tuba1.getType());
        }

        @Test
        public void setType(){
            tuba1.setType("Stratocaster");
            assertEquals("Stratocaster", tuba1.getType());
        }

        @Test
        public void getBuyValue(){
            assertEquals(1000, tuba1.getBuyvalue());
        }

        @Test
        public void setBuyValue(){
            tuba1.setBuyvalue(1100);
            assertEquals(1100, tuba1.getBuyvalue());
        }

        @Test
        public void getSellValue(){
            assertEquals(1300, tuba1.getSellvalue());
        }

        @Test
        public void setSellValue(){
            tuba1.setSellvalue(1400);
            assertEquals(1400, tuba1.getSellvalue());
        }

    }
