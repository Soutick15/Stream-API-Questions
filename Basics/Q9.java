package Basics;

import java.util.List;

public class Q9 {

    //Get square of each number

    public static void main(String[] args) {
        List <Integer> numbers = List.of(0 , 1, 2, 3);

        List<Integer> squareSum = numbers.stream()
                                        .map(n -> n*n).toList();

        System.out.println(squareSum); //[0, 1, 4, 9]
    }
    
}
