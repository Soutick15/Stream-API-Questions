package Basics;

import java.util.List;

public class Q4 {
    // 4. Count strings with length > 5

    public static void main(String[] args) {
        List<String> names = List.of("Ayan", "Soutick", "John", "ankita", "Shivaji");
        long count = names.stream()
                            .filter(s -> s.length() > 5)
                            .count();
        System.out.println(count); // 3

    }

}
