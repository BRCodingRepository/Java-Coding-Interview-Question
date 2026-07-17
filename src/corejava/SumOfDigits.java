package corejava;

//9. Sum of Digits- Write a function that returns the sum of the digits of a given number.
public class SumOfDigits {
    static void main() {
        int n=2345;
        int res=0;
        while (n>0){
            res=res+n%10;
            n=n/10;
        }
        System.out.println(res);
    }
}
