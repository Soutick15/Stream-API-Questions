package Basics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class Q11 {

    public static void main(String[] args) {
        //Find second highest number
         List<Integer> numbers = List.of(2 , 7, 6 , 3 , 0 ,1 , 12);

          secondInteger =  numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().

    }
}