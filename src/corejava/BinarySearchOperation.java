package corejava;

public class BinarySearchOperation {
    static void main() {
        int[] arr = {2, 3, 4, 5, 6, 10, 13, 15, 17, 18, 19};
        int k=17;
        int index = binarySearchOp(arr, k);
        System.out.println(index);
    }

    public static int binarySearchOp(int[] arr, int k) {
        int mid=arr.length/2;
        int left=0;
        int right=arr.length-1;
       while (left<=right){
           mid=left+(right-left)/2;
           if(arr[mid]==k){
               return mid;
           } else if (arr[mid]>k) {
               right=mid-1;
           }else {
               left=mid+1;
           }
       }

        return -1;
    }
}
