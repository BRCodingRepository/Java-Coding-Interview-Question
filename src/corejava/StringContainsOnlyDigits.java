package corejava;

public class StringContainsOnlyDigits {

    static void main() {
        String s="131231231231231231231231231212312312";
        if (checkNumberContainsOnlyDigits(s)){
            System.out.println("The given string contains only digit");
        }else {
            System.out.println("The given string not contains only digit");
        }

    }

   static boolean checkNumberContainsOnlyDigits(String s) {
   for (char c:s.toCharArray()){
       if(!Character.isDigit(c)){
           return false;
       }
   }
   return true;
    }
}
