package Query;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q1 {
    //Group employees by department

    public static void main(String[] args) {
        List<Employee>  employees = Test.getEmployees();
        // Map<String, List<Employee>> groupingList = employees.stream()
        //         .collect(Collectors.groupingBy(Employee::getDepartment));
                
        // System.out.println(groupingList);// prints the whole object after grouping


        Map<String, List<String>> groupingList = employees.stream()
                                                          .collect(Collectors.groupingBy(
                                                                Employee::getDepartment,    
                                                                Collectors.mapping(
                                                                    Employee :: getName, 
                                                                    Collectors.toList()
                                                                )
                                                            ));
                
                System.out.println(groupingList);


    }
}
