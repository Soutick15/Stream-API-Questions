package Query;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<Employee> employee = Test.getEmployees();
        Map<String, Optional<Employee>> result =
        employee.stream()
                 .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.maxBy(
                                 Comparator.comparing(Employee::getSalary)
                         )
                 ));

System.out.println(result);
    }
}
