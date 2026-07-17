package corejava;

//8. Find the Missing Number- Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
public class MissingNumber {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int missingNumber = findMissingNumber(arr);
        System.out.println(missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int diff = (arr[n - 1] - arr[0]) / n;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - arr[i] != diff) {
                return arr[i] + diff;
            }
        }
        return -1;
    }
}
