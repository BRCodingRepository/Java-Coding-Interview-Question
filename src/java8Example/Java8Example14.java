package java8Example;

//15. sort a list of Employees first by age and then by name using streams.

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Example14 {
    static void main() {
        List<Employee> listEmployee = Employee.getListEmployee();
        List<Employee> sortedEmpList = listEmployee.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName)).collect(Collectors.toList());
        sortedEmpList.forEach(System.out::println);
    }
}