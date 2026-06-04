package Basics;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q10 {
    //Remove duplicates
    public static void main(String[] args) {
        List <Integer> numbers = List.of(0 , 1, 2, 2, 3, 0);

        // List <Integer> newNumbers = numbers.stream().distinct().toList(); //approach 1 : distinct() preserves insertion order.
       // Set <Integer> newNumbers = numbers.stream().collect(Collectors.toSet()); ////approach 2 : Set does NOT guarantee order
        List <Integer> newNumbers = numbers.stream().distinct().toSet(); ////approach : 3??

           System.out.println(newNumbers);
    }



}
