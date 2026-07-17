package java8Example;

//30.filter a list of Employee to find all employees with a specific last name and collect their email addresses into a list.


import java.util.List;
import java.util.stream.Collectors;

public class Java8Example30 {
    static void main() {
        List<Employee> employeeList=Employee.getListEmployee();
        List<String> collect = employeeList.stream().filter(e -> e.getName().startsWith("M")).map(Employee::getName).collect(Collectors.toList());
        System.out.println(collect);
    }
}