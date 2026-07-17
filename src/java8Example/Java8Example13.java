package java8Example;

//13.filter a list of Employees to find all Employees older than a certain age and collect their names into a map
// with key being their name and value being their age.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Example13 {
    static void main() {
       List<Employee> empList= Employee.getListEmployee();
        Map<String, Integer> collect = empList.stream().filter(e -> e.getAge() > 25).collect(Collectors.toMap(Employee::getName, Employee::getAge));
        collect.entrySet().forEach((entry)->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });

    }
}