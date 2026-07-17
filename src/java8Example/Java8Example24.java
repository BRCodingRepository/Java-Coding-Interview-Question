package java8Example;

//24. count the number of vowels in a string using streams.
//25. find the common elements between two lists of strings using streams.
//26.convert a list of integers to a list of strings representing their binary equivalents.
//27.calculate the product of all elements in a list of integers using streams.
//28. group a list of employees by department and then count the number of employees in each department.
//29. sort a list of strings based on their lengths and then alphabetically using streams.
//30.filter a list of Employee to find all employees with a specific last name and collect their email addresses into a list.

public class Java8Example24 {
    static void main() {
        String s="Hello world";
        long count = s.chars().mapToObj(c -> (char) c).filter(c -> "aeiou".indexOf(c) != 1).count();
        System.out.println(count);
    }
}