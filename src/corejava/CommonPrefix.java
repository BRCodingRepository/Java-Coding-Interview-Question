package corejava;
//11. Longest Common Prefix- Write a function to find the
// longest common prefix string amongst an array of strings.

public class CommonPrefix {
    static void main() {
     String[] arrStr={"fly","flight","flying","flat"};
        System.out.println(printCommonPrefix(arrStr));

    }

  public static String printCommonPrefix(String[] arrStr) {
      for (int i = 0; i < arrStr.length; i++) {
          int k = 0;
          for (int j = 0; j < arrStr[i].length(); j++) {
              if (arrStr[i].length() > 1 && arrStr[i + 1].length() > 1 && (arrStr[i].charAt(j) == arrStr[i + 1].charAt(j))) {
                  k++;
              }
          }
          return arrStr[i].substring(0, k);
      }
      return "";
  }

}
