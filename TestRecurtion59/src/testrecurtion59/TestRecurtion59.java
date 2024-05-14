package testrecurtion59;

public class TestRecurtion59 {

    public static void main(String[] args) {

        System.out.println(findFibonaccy(55));

    }

    public static long factorial(int n) {
        if (n == 0)// Base case
        {
            return 1;
        } else {
            return n * factorial(n - 1);// Recursive call
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        } else if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        } else {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }

    public static long findFibonaccy(int index) {

        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;

        }
        else{
        
            return findFibonaccy(index-1)+findFibonaccy(index-2);
        }

    }

}
