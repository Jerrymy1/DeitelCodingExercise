package tdd;

public class Bike {


    public Bike getAccelerateBike;
    private boolean bikePower = false;


    //getter method will not collect parameters

    public boolean getBikePower() {
        return this.bikePower;
    }

    //setter method always collects a parameters
    public void setBikePower(boolean power) {
        if (power = true
        ){
            bikePower = true;
        }

    }


    public boolean getAccelerateBike() {
        return true;
    }

    public void AccelerateBike() {
        boolean accelerate;
        if( accelerate = true){
        }else
            accelerate = false;
    }

    public void AccelerateBike(int gear) {
        boolean b = gear > 100;
    }
}
