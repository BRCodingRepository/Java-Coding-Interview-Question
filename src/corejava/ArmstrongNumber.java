package corejava;

//12. Armstrong Number - Write a function to check if a given number is an Armstrong number.

public class ArmstrongNumber {
    static void main() {
        System.out.println(checkNumberIsArmstrong(153));
        System.out.println(checkNumberIsArmstrong(234));
        System.out.println(checkNumberIsArmstrong(432));


    }

   public static boolean checkNumberIsArmstrong(int n){
        int original=n;
        int digits=String.valueOf(n).length();
        int rem=0;
        int res=0;
        while (n>0){
            rem=n%10;
            res+=(int) Math.pow(rem,digits);
            n/=10;
        }
        return original==res;
    }
}

