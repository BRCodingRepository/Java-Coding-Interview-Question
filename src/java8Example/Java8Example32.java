package java8Example;

//32.Given a List of Integers find total count, min, max, sum, and the average for numbers by using Stream api

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example32 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        IntSummaryStatistics collect = integerList.stream().collect(Collectors.summarizingInt(Integer::intValue));
        long sum = collect.getSum();
        int min = collect.getMin();
        int max = collect.getMax();
        long count = collect.getCount();
        double average = collect.getAverage();
        System.out.println("average = " + average);
        System.out.println("count = " + count);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
    }

}