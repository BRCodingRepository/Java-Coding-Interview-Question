package java8Example;

//14.find the maximum and minimum values in a list of integers in a single pass using streams.

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example15 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        IntSummaryStatistics collect = integerList.stream().collect(Collectors.summarizingInt(Integer::intValue));
        Integer min=collect.getMin();
        Integer max=collect.getMax();
        System.out.println(min);
        System.out.println(max);

    }
}