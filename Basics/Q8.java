package Basics;

import java.util.List;

public class Q8 {
    //Find sum of all numbers

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2 , 6 , 3 , 0 ,1 );

        long sum = numbers.stream().mapToInt(i -> i.intValue()).sum();
        System.out.println(sum);

        
    }
    
}
