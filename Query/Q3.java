package Query;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {

        // Find average salary of employees for each department

        List<Employee> emp = Test.getEmployees();
        Map<String, Double> averageSalaryByDepartment = emp.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(averageSalaryByDepartment);

    }

}
