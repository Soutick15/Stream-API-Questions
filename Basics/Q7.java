package Basics;

import java.util.List;
import java.util.stream.Collectors;

public class Q7 {
    //7. Convert List<String> to comma separated string
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "grapes");

        String result = fruits.stream().collect(Collectors.joining(", " ));
        
        System.out.println(result);
       
        
    }
    
}
