package java8Example;

import java.util.*;
import java.util.stream.Collectors;
import java8Example.Employee;

public class EmployeeExample {

    static void main() {
        //List Of Employees : employeeList
        List<Employee>  listEmployee = Employee.getListEmployee();

        // 3.1 : How many male and female employees are there in the organization?
            Map<String, Long> maleAndFemaleEmp = listEmployee.stream()
                    .collect(Collectors.groupingBy(Employee::getGender,
                            Collectors.counting()));
            for (Map.Entry<String,Long> map: maleAndFemaleEmp.entrySet()){
                System.out.println(map.getKey()+"  "+ map.getValue());
            }
        // 3.2 : Print the name of all departments in the organization?
            List<String> list = listEmployee.stream()
                    .map(Employee::getDepartment)
                    .distinct()
                    .toList();
            System.out.println(list);

        // 3.3 : What is the average age of male and female employees?
            Map<String,Double> map1 = listEmployee.stream()
                    .collect(Collectors.groupingBy(Employee::getGender,
                            Collectors.averagingInt(Employee::getAge)));
            System.out.println(map1);

        // 3.4 : Get the details of highest paid employee in the organization?
            Employee employee = listEmployee.stream()
                    .max(Comparator.comparing(Employee::getSalary))
                    .orElseThrow(()->new RuntimeException("No Employee Found"));
            System.out.println("employee = " + employee);

        // 3.5 : Get the names of all employees who have joined after 2015?
            List<String> list1 = listEmployee.stream()
                    .filter(e -> e.getYearOfJoining() > 2015)
                    .map(Employee::getName).toList();
            System.out.println("list1 = " + list1);

        // 3.6 : Count the number of employees in each department?
            Map<String, Long> collect = listEmployee.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.counting()));
            System.out.println("collect = " + collect);

        // 3.7 : What is the average salary of each department?
            Map<String, Double> collect1 = listEmployee.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.averagingDouble(Employee::getSalary)));
            System.out.println("collect1 = " + collect1);

        // 3.8 : Get the details of youngest male employee in the product development department?
            Employee employee1 = listEmployee.stream()
                    .filter(e->"Male".equals(e.getGender()))
                    .filter(e -> e.getDepartment().equals("Product Development"))
                    .min(Comparator.comparing(Employee::getAge)).orElseThrow(()->new RuntimeException("No Employee Found"));
            System.out.println("employee1 = " + employee1);

        // 3.9 : Who has the most working experience in the organization?
           Employee employee2 = listEmployee.stream()
                   .min(Comparator.comparing(Employee::getYearOfJoining))
                   .orElseThrow(()->new RuntimeException("No Employee Found"));
           System.out.println("employee2 = " + employee2);

        //3.10 : How many male and female employees are there in the sales and marketing team?
            Map<String, Long> collect2 = listEmployee.stream().
                    filter(e -> "Sales And Marketing".equals(e.getDepartment()))
                    .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
            System.out.println("collect2 = " + collect2);

        //3.11 : What is the average salary of male and female employees?
            Map<String, Double> collect3 = listEmployee.stream()
                    .collect(Collectors.groupingBy(Employee::getGender,
                            Collectors.averagingDouble(Employee::getSalary)));
            System.out.println("collect3 = " + collect3);

        //3.12 : List down the names of all employees in each department?
            Map<String, List<Employee>> collect4 = listEmployee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
                for (Map.Entry<String, List<Employee>> map:collect4.entrySet()){
                    System.out.println("map.getKey() = " + map.getKey());
                    System.out.println("map.getValue(). = " + map.getValue().stream().map(Employee::getName).toList());
                }
        //3.13 : What is the average salary and total salary of the whole organization?
            DoubleSummaryStatistics collect5 = listEmployee.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
            System.out.println(collect5.getAverage());
            System.out.println(collect5.getSum());

        //3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
            Map<Boolean, List<Employee>> collect6 = listEmployee.stream().collect(Collectors.partitioningBy(e -> e.getAge() <= 25));
            collect6.entrySet().stream().forEach(entry->{
                System.out.println("entry.getKey() = " + entry.getKey());
                System.out.println("entry.getValue() = " + entry.getValue());
            });

        //3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Employee employee3 = listEmployee.stream()
                .max(Comparator.comparing(Employee::getAge))
                .orElseThrow(() -> new RuntimeException("No Employee Found"));
        System.out.println("employee3 = " + employee3);

    }



}
