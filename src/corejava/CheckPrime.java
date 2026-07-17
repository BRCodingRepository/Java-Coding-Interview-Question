package corejava;

//Prime Number Check- Write a function that checks if a given number is a prime number
public class CheckPrime {
    static void main() {
        int n = 10;
        if (checkPrimeNumber(n)) {
            System.out.println("The Given number is prime");
        } else {
            System.out.println("The Given number is not  prime");
        }
    }

    private static boolean checkPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
