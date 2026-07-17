package java8Example;
//28. group a list of employees by department and then count the number of employees in each department.

import java.util.List;
import java.util.stream.Collectors;

public class Java8Example28 {
    static void main() {
        Employee employee=new Employee();
        List<Employee> employeeList=employee.getListEmployee();
        java.util.Map<String,Long> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(map);
    }
}