package math;

public class MaxMinChange {

    public static final  int NUMBER1=50;
    public static int number2;
    public static int number3;

    public MaxMinChange() {
    }

    public MaxMinChange( int number2, int number3) {
        
        this.number2 = number2;
        this.number3 = number3;
    }

    public static int findMaxNumber() {
        if (NUMBER1 > number2 && NUMBER1 > number3) {

            return NUMBER1;

        } else if (number2 > NUMBER1 && number2 > number3) {
            return number2;
        } else {
            return number3;
        }

    }

    public static int findMinNumber() {
        if (NUMBER1 < number2 && NUMBER1 < number3) {

            return NUMBER1;

        } else if (number2 < NUMBER1 && number2 < number3) {
            return number2;
        } else {
            return number3;
        }

    }

}
