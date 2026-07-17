package corejava;

//7. Reverse String- Write a function that reverses a given string.
public class ReverseString {
    static void main() {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println(sb.toString());
    }
}
