package java8Example;

import java.util.List;
import java.util.stream.Collectors;

//43.Collect all the strings  which are palindrome from a list of strings using streams.

public class Java8Example43 {
    static void main() {
        List<String> stringList = List.of("madam","gadag","racecar","hello","hello2");
        List<String> collect = stringList.stream().filter(Java8Example43::palindromeCheck).collect(Collectors.toList());
        System.out.println("collect = " + collect);

    }
    
    static boolean palindromeCheck(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return  false;
            }
            
        }
        return true;
    }
}