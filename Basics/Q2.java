package Basics;

import java.util.List;

public class Q2 {

    //2. Filter even numbers

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2 , 7, 6 , 3 , 0 ,1 , 12);
        List<Integer> eveNumbers = numbers.stream().filter(n -> n%2==0).toList();
        System.out.println(eveNumbers); //[2, 6, 0, 12]

    }
}
