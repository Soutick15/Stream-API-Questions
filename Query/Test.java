package Query;

import java.util.List;

public class Test {
    private static final List<Employee> employees = List.of(
            new Employee("Soutick", 25, 90000, "IT"),
            new Employee("Priya", 22, 40000, "HR"),
            new Employee("Akash", 25, 50000, "IT"),
            new Employee("Animita", 25, 60000, "Accounts")
    );

    // Public getter to access the private list
    public static List<Employee> getEmployees() {
        return employees;
    }
}