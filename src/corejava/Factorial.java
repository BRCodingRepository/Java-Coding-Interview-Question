package corejava;

//6. Factorial- Write a function that returns the factorial of a given number.

public class Factorial {
    static void main() {
        int n = 5;
        int result = getFactorial(n);
        System.out.println(result);

    }

    public static int getFactorial(int n) {
        if (n == 0) return 1;
        return n * getFactorial(n - 1);
    }
}
