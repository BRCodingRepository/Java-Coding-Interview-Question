package java8Example;

//26.convert a list of integers to a list of strings representing their binary equivalents.
//27.calculate the product of all elements in a list of integers using streams.
//28. group a list of employees by department and then count the number of employees in each department.
//29. sort a list of strings based on their lengths and then alphabetically using streams.
//30.filter a list of Employee to find all employees with a specific last name and collect their email addresses into a list.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Example26 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        Map<Integer, String> collect = integerList.stream().collect(Collectors.toMap(i -> i, Integer::toBinaryString));
        System.out.println(collect);
    }
}