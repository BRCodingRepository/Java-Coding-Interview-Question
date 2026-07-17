package java8Example;

//45.From a list of employees, find the average salary of employees
// from each department and store them in a map (using stream API)

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Example45 {
    static void main() {
        List<Employee> employeeList=Employee.getListEmployee();
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("collect = " + collect);

    }
}