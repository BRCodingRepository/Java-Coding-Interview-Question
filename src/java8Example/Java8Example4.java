package java8Example;

//4.merge two lists of integers, remove duplicates, and find the average of the remaining numbers.

import java.util.List;
import java.util.stream.Stream;

public class Java8Example4 {
    static void main() {
        List<Integer> integerList1 = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        List<Integer> integerList2 = List.of(3, 4, 5, 6, 7, 8, 9, 10, 15, 16, 17,20,21,22,23,24,25);
        double avg=Stream.concat(integerList1.stream(),integerList2.stream()).distinct().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(avg);
    }
}

