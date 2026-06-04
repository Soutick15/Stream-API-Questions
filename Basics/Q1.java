package Basics;
import java.util.List;


public class Q1 {
    //1. Convert all strings to uppercase
    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "grapes");
        List <String> newFruits = fruits
                                        .stream()
                                        .map(s -> s.toUpperCase())
                                        .toList();

        System.out.println(newFruits); //[APPLE, BANANA, GRAPES]
    }
}