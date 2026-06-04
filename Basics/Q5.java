package Basics;

import java.util.List;

public class Q5 {

    //5. Sort strings alphabetically
    public static void main(String[] args) {
        List<String> names = List.of("Zyan", "Ayan", "Soutick", "John", "ankita", "Shivaji");

         List<String> sortNames = names.stream()
                                        .map(String :: toUpperCase)
                                        .sorted()
                                        .toList();
         System.out.println(sortNames);
        
    }   
}
