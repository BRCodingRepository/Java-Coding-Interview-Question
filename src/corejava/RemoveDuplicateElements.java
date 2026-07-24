package corejava;

import java.util.Arrays;

public class RemoveDuplicateElements {
    static void main() {
        //13.Remove Duplicates from Array- Write a function to remove duplicate elements from an array.
        int[] integerList = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 7, 8, 9, 10, 11, 12, 13, 14};
        int j = removeDuplicateElements(integerList);
        System.out.println(Arrays.toString(Arrays.copyOf(integerList, j)));
    }

    private static int removeDuplicateElements(int[] arr) {
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
}
