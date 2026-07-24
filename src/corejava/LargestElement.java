package corejava;

//16. Find the Largest Element in an Array- Write a function that finds the largest element in a given array.

import java.util.Arrays;

public class LargestElement {
    static void main() {
        int[] integerList = {3, 4, 5, 6, 7, 8, 9, 7, 8, 9, 10, 11, 12, 13, 14, 10, 11, 12, 13, 14, 15, 16, 17};
      int max=  findLargestElement(integerList);
        System.out.println("max = " + max);

    }

    private static int findLargestElement(int[] integerList) {
        if(integerList.length==0 || integerList==null) return -1;
        int max=integerList[0];
        for (int i = 1; i < integerList.length; i++) {
            if(integerList[i]>max){
                max=integerList[i];
            }
        }

        return max;
    }
}
