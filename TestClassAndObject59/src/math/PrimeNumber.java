package math;

public class PrimeNumber {

    int number = 5;

    public PrimeNumber() {
    }

    public PrimeNumber(int newNumber) {
        number = newNumber;
    }

    public String checkPrimeNumber() {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return "It is Prime Numebr";
        } else {
            return "It is not Prime Numebr";
        }

    }
    
    
//    public boolean checkPrimeNumber() {
//        int count = 0;
//        for (int i = 1; i <= number; i++) {
//            if (number % i == 0) {
//                count++;
//            }
//        }
//
//        if (count == 2) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
    

}
