package corejava;

//FizzBuzz- Write a program that prints
// the numbers from 1 to 100 with specific rules for multiples of 3 and 5
public class FizzBuzz {
    static void main() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
