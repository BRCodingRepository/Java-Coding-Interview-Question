package corejava;

//19. Sum of Elements in an Array -
// Write a function that calculates the sum of all elements in a given array of integers using a for loop.

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumElements {
    static void main(String[] args) {
        int[] arr={3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
       int sum= sumOfElements(arr);
        System.out.println(sum);
        System.out.println(Arrays.stream(arr).sum());
    }

    private static int sumOfElements(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }


}
