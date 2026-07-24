package corejava;

//19. Sum of Elements in an Array -
// Write a function that calculates the sum of all elements
// in a given array of integers using a for loop.

public class DecimalToBinary {
    static void main() {
        System.out.println(decimalToBinary(200));
    }

  public static String decimalToBinary(int i){
        StringBuilder str=new StringBuilder();
        int n=i;
        while (n>0){
            int temp=n%2;
            str.append(temp);
            n=n/2;
        }
        return  str.reverse().toString();
    }
}
