package java8Example;

//5.find the second highest value in a list of integers using streams.


import java.util.Comparator;
import java.util.List;

public class Java8Example5{
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        Integer secondHig= integerList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHig);
        }
}
