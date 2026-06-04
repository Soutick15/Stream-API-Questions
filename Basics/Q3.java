package Basics;

import java.util.List;

public class Q3 {

    //3. Find names starting with "A"

    public static void main(String[] args) {
        List<String> names = List.of("Ayan", "Soutick", "Akash", "ankita");
        List<String> result = names.stream()
                                    .filter(s -> s.toLowerCase().startsWith("a"))
                                    .toList();
        System.out.println(result);

    }
    
}
