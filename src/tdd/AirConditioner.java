package tdd;

public class AirConditioner {
    private boolean power;
    //private boolean powerOff;
    private int temperature;
   // private boolean increaseTemperature;

    public boolean getPower () {
        return power;
    }

    public void setPowerOn (boolean on) {
        power = true;
    }

    public void setPowerOff (boolean off) {
        power = true;
    }

    public void setTemperature (int degree) {

        temperature = degree;

        }


    public int getTemperature () {
        return temperature;
    }

    public void increaseTemperature () {
        if (temperature >= 30) {
            this.temperature = temperature;
        }
    }

    public void decreaseTemperature (){temperature = temperature - 1;}


    public void increaseTemperatureInc () {
        int temperatureInc = 30;

            this.temperature = temperatureInc;}

            public void decreaseTemperatureD () {
            int temperatureD = 16;
            this.temperature = temperatureD;
        }



    }