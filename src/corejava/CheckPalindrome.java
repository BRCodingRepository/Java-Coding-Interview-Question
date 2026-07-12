package corejava;

// check the given string using two pointer method to check palindrome or not


public class CheckPalindrome {
    static void main() {
        String s = "madam1";
        if (checkPalindrome(s)) {
            System.out.println("The given string is palindrome");
        } else {
            System.out.println("The given string is not palindrome");
        }
    }

    public static boolean checkPalindrome(String s) {
        if (s.length() == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

