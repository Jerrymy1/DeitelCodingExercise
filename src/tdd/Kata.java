package tdd;

public class Kata {
    // private int result;

    public int multiply(int num) {
        if (num > 0 && num <= 4) {
            return num * 2000;
        }

        if (num >= 5 && num <= 9) {
            return num * 1800;
        }
        //result = num * 1800;}

        if (num >= 10 && num <= 29) {
            return num * 1600;
        }
        // result = num * 1600;}

        if (num >= 30 && num <= 49) {
            return num * 1500;
        }

        if (num >= 50 && num <= 99) {
            return num * 1300;
        }

        if (num >= 100 && num <= 199) {
            return num * 1200;
        }

        if (num >= 200 && num <= 499) {
            return num * 1100;
        }

        if (num <= 500) {
            return num * 1000;
        }


        return num;
    }
}
