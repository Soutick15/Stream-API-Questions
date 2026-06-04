package Basics;

import java.util.Comparator;
import java.util.List;

public class Q6 {
    //6. Sort numbers in descending order
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2 , 7, 6 , 3 , 0 ,1 , 12);
        List<Integer> decendingNumbers = numbers.stream()
                                                .sorted(Comparator.reverseOrder())
                                                .toList();

        System.out.println(decendingNumbers);
    }
    
}
