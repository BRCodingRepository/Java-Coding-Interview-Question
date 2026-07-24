package corejava;

//20. Calculate Average of Array Elements-Write a function that calculates the average of all elements in a given array of integers using a for loop.

public class AverageOfArray {
    static void main() {
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        float avg = averageArray(arr);
        System.out.println("avg = " + avg);
    }

    private static float averageArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (float) sum / arr.length;
    }
}
