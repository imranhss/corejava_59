package util;

public class QuotientWithException {

    public int quotient(int number1, int number2) {
        int result = 0;
        if (number2 == 0) {
            try {
                result = number1 / number2;
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Hi");
        }

        return result;
    }

}
