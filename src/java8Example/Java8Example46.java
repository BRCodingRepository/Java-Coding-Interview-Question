package java8Example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Java8Example46 {
    static void main() {
        List<Integer> integerList = List.of(3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        int[] arr= {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int[] arr1= {3, 4, 5, 6,  15, 16, 17,21,23,24,25,65,29};
        List<String> stringList = List.of("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Kiwi", "Lemon", "Mango", "Nectarine", "Orange", "Papaya", "Quince");
        String s="swiss";

        //1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

            List<Integer> evenList=integerList.stream().filter(i->i%2==0).collect(Collectors.toList());
            evenList.forEach(System.out::println);

        //2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
            List<Integer> stratsWithPrefix= integerList.stream().map(String::valueOf).filter(s1->s1.startsWith("1")).map(Integer::parseInt).collect(Collectors.toList());
            stratsWithPrefix.forEach(System.out::println);

        //3. How to find duplicate elements in a given integers list in java using Stream functions?
            HashSet<Integer> set=new HashSet<>();
            List<Integer> duplicateElementList=integerList.stream().filter(i->!set.add(i)).toList();
            duplicateElementList.forEach(System.out::println);

        //4. Given the list of integers, find the first element of the list using Stream functions?
            int firstElement=integerList.stream().findFirst().get();
            System.out.println(firstElement);

        //5. Given a list of integers, find the total number of elements present in the list using Stream functions?
            long count=integerList.stream().count();
            System.out.println(count);

        //6. Given a list of integers, find the maximum value element present in it using Stream functions?
            Integer i = integerList.stream().max(Comparator.comparingInt(Integer::intValue)).get();
            System.out.println(i);

        //7. Given a String, find the first non-repeated character in it using Stream functions?
            Character c1 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().map(Map.Entry::getKey).get();
            System.out.println(c1);

        //8. Given a String, find the first repeated character in it using Stream functions?
            Character c2 = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() > 1).findFirst().map(Map.Entry::getKey).get();
            System.out.println(c2);

        //9. Given a list of integers, sort all the values present in it using Stream functions?
            List<Integer> sortedList = integerList.stream().sorted().toList();
            System.out.println(sortedList);

        //10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
            List<Integer> revSortedList = integerList.stream().sorted(Comparator.reverseOrder()).toList();
            System.out.println(revSortedList);

        //11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
            boolean b = IntStream.of(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().anyMatch(entry -> entry.getValue() >= 2);
            System.out.println(b);

            boolean b1= IntStream.of(arr).distinct().count()!=arr.length;
            System.out.println(b1);

        //12. How will you get the current date and time using Java 8 Date and Time API?
            LocalDate date=LocalDate.now();
            LocalTime time=LocalTime.now();
            System.out.println(date);
            System.out.println(time);

        //13. Write a Java 8 program to concatenate two Streams?
            IntStream concat = IntStream.concat(Arrays.stream(arr), Arrays.stream(arr1));
            System.out.println(concat);

        //14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
            List<Integer> list = Arrays.stream(arr1).boxed().map(i2->(int)Math.pow(i2,3)).filter(i1 -> i1 > 50).toList();
            System.out.println(list);


         //15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
            IntStream sorted = Arrays.stream(arr1).sorted();
            System.out.println(Arrays.toString(sorted.toArray()));

        //16. How to use map to convert object into Uppercase in Java 8?
            List<String> list1 = stringList.stream().map(String::toUpperCase).toList();
            System.out.println(list1);

        //17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
            List<Employee> list2=   Employee.getListEmployee();
            TreeMap<Integer, String> collect = list2.stream().collect(Collectors.toMap(Employee::getId, Employee::getName, (ex, re) -> ex, TreeMap::new));
            System.out.println(collect);

        //18. How to count each element/word from the String ArrayList in Java8?
            Map<String,Long> count1 = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println(count1);


        //20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
            Optional.ofNullable(stringList).filter(li->!li.isEmpty()).ifPresent(li1->li1.forEach(System.out::println));

        //21. Write a Program to find the Maximum element in an array?
            Arrays.stream(arr).max().ifPresent(System.out::println);

        //22. Write a program to print the count of each character in a String?
            Map<Character,Long> map=  s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(map);
    }
}
