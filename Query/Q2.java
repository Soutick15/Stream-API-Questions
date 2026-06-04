package Query;

import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    // Find average salary of employees

    public static void main(String[] args) {
            List<Employee> emp = Test.getEmployees();
            double avergae = emp.stream().collect(Collectors.averagingDouble(Employee :: getSalary));

            System.out.println(avergae);
        
    }

    
}
