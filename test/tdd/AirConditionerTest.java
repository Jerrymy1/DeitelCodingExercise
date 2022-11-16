package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void powerAcOn () {
        //Given that I have an AC
        AirConditioner jerryAc = new AirConditioner();
        // When AC turns on
        jerryAc.setPowerOn(true);
        // Check that AC is on
        assertEquals(true, jerryAc.getPower());
    }

    @Test
    public void powerAcOff () {
        // Given that I have an AV
        AirConditioner jerryAc = new AirConditioner();
        //When AC turns off
        jerryAc.setPowerOff(true);
        //Check that AC is off
        assertEquals(true, jerryAc.getPower());
    }

    @Test
    public void increaseAcTemperature () {
        // Given that I have an AC
        AirConditioner jerryAc = new AirConditioner();
        //Given that the AC is off and i turn it on
        jerryAc.setPowerOn(true);
        //When i increase temperature
        jerryAc.setTemperature(22);
        jerryAc.increaseTemperature();
        assertEquals(22, jerryAc.getTemperature());

    }

   @Test
    public void decreaseTemperature () {
        //Given that i have an AC
       AirConditioner jerryAc = new AirConditioner();
       //Given that the AC is on
       jerryAc.setPowerOn(true);
       // when i decrease temperature
       jerryAc.setTemperature(25);
       jerryAc.decreaseTemperature();
       // check
       assertEquals(24, jerryAc.getTemperature());
   }

   @Test
     public void increaseTemperatureBeyond30 () {
       //Given that i have an AC
       AirConditioner jerryAc = new AirConditioner();
       //Given that the AC is on
       jerryAc.setPowerOn(true);
       // When i increase temperature
       jerryAc.setTemperature(32);
       jerryAc.increaseTemperatureInc();
       // Check
       assertEquals(30, jerryAc.getTemperature());
   }

   @Test
   public void decreaseTemperatureBelow16 () {
       //Given that i have an AC
       AirConditioner jerryAc = new AirConditioner();
       //Given that the AC is on
       jerryAc.setPowerOn(true);
       // When i increase temperature
       jerryAc.setTemperature(12);
       jerryAc.decreaseTemperatureD();
       // Check
       assertEquals(16, jerryAc.getTemperature());
    }
}
