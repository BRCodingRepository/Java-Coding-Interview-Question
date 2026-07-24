package corejava;

//17. Count Occurrences of a Character-
//Write a function that counts the occurrences of a specific character in a given string.

public class FindCharacterMap {
    static void main() {
        String s="Hellohowareyou";
        char tar='o';
int count= findSpecificCharacterOccurrence(s,tar);
        System.out.println("Character = "+tar +" count = " + count);
    }

    private static int findSpecificCharacterOccurrence(String s, char tar) {
        int count=0;
        for (char c:s.toCharArray()){
            if(tar==c){
                count++;
            }
        }

        return count;
    }
}
