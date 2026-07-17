package java8Example;

//12.find the sum of all prime numbers in a list of integers using streams.


import java.util.List;

public class Java8Example12 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        int sum = integerList.stream().filter(Java8Example12::checkPrime).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }

   public static boolean checkPrime(int n){
        if(n<=1) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}