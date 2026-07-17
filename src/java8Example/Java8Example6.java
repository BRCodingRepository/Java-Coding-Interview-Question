package java8Example;

//6.partition a list of numbers into two groups: even and odd numbers using streams.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Example6 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        Map<Boolean, List<Integer>> collect = integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        for (Map.Entry<Boolean, List<Integer>> map:collect.entrySet()){
            if(map.getKey().equals(Boolean.TRUE)){
                System.out.println("The Even Value List : "+ map.getValue());
            }else {
                System.out.println("The Odd Value List : "+ map.getValue());
            }
        }
    }
}