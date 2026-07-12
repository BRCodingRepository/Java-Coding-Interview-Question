package corejava;

public class Fibonacci {
    static void main() {
        printFibonacci(10);
        System.out.println();
        printFibonacci(20);
        System.out.println();
        printFibonacci(5);

    }

    public static void printFibonacci(int n) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 2; i < n; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }
    }
}
