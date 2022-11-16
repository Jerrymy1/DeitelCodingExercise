package tdd;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    @Test
    public void addTest (){
       Kata firstDriller = new Kata();
        int multiply = firstDriller.multiply(4);
        assertEquals(8000, multiply);
    }


    @Test
    public void addTestTwo () {
        Kata firstDriller = new Kata();
        int multiply = firstDriller.multiply(9);
        assertEquals(16200, multiply);
    }

    @Test
    public void addTestThree () {
        Kata firstDriller = new Kata();
        int multiply = firstDriller.multiply(10);
        assertEquals(16000, multiply);
    }

    @Test
    public void addTestFour () {
        Kata firstDriller = new Kata();
        int multiply = firstDriller.multiply(30);
        assertEquals(45000, multiply);
    }

    @Test
    public void addTestFive () {
        Kata firstDriller = new Kata();
        int multiply = firstDriller.multiply(50);
        assertEquals(65000, multiply);
    }

    @Test
    public void addTestSix () {
        Kata firstDriller = new Kata();
        int multiply = firstDriller.multiply(100);
        assertEquals(120000, multiply);
    }

    @Test
    public void addTestSeven () {
        Kata firstDriller = new Kata();
        int multiply = firstDriller.multiply(200);
        assertEquals(220000, multiply);
    }

    @Test
    public void addTestEight () {
        Kata firstDriller = new Kata();
        int multiply = firstDriller.multiply(500);
        assertEquals(500000, multiply);
    }
}
