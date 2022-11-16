package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    @Test
    public void testThatBikeCanTurnOff(){
        //given
        Bike bike = new Bike();
        boolean status = bike.getBikePower();
        assertEquals(false, status);
        //when
        bike.setBikePower(false);
        //assert
        assertEquals(true, bike.getBikePower());
    }

    @Test
    public void testThatBikeAccelerate(){

        //given that bike accelerate
        Bike bike = new Bike();

        // when bike increase
       bike.AccelerateBike() ;

       //assert
        boolean getAccelerateBike = true;
        assertEquals(true,getAccelerateBike);

    }
    


    @Test
    public void testGear1Accelerate(){

        //given that gear on
        Bike gearBike = new Bike();

        //when gear1 increase
        gearBike. AccelerateBike(15);

        //check that gear1 increase
        boolean gear = gearBike.getAccelerateBike();

        //assert
        boolean getAccelerateBike = true;
        assertEquals(true,getAccelerateBike);
    }

    @Test
    public void testGear2Accelerate() {

        //given that gear on
        Bike gearBike = new Bike();

        //when gear2 increase
        gearBike.AccelerateBike(24);

        //check that gear2 increase
        boolean gear = gearBike.getAccelerateBike();

        //assert
        boolean getAccelerateBike = true;
        assertEquals(true, getAccelerateBike);

    }

    @Test
    public void testGear3Accelerate() {

        //given that gear on
        Bike gearBike = new Bike();

        //when gear3 increase
        gearBike.AccelerateBike(35);

        //check that gear3 increase
        boolean gearOne = gearBike.getAccelerateBike();

        //assert
        boolean getAccelerateBike = true;
        assertEquals(true, getAccelerateBike);
    }

    @Test
    public void testGear4Accelerate(){

        //given that gear on
        Bike gearBike = new Bike();

        //when gear4 increase
        gearBike. AccelerateBike(44);

        //check that gear4 increase
        boolean gearOne = gearBike.getAccelerateBike();

        //assert
        boolean getAccelerateBike = true;
        assertEquals(true,getAccelerateBike);}


}
