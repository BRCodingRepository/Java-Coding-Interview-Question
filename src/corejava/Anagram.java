package corejava;

import java.util.Arrays;

//Anagram Check - Write a function that checks if two given strings are anagrams of each other.

public class Anagram {
    static void main() {
        String s1 = "racecar";
        String s2 = "carrace";
        checkAnagram(s1, s2);
    }

    private static void checkAnagram(String s1, String s2) {
        String[] charArr1 = s1.split("");
        String[] charArr2 = s2.split("");
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        if (Arrays.equals(charArr1, charArr2)) {
            System.out.println("The given strings are anagram");
        } else {
            System.out.println("The given strings are not anagram");
        }
    }
}
