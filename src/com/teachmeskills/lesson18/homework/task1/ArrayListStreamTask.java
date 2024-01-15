package com.teachmeskills.lesson18.homework.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStreamTask {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add((int) (Math.random() * 20));
        }

        System.out.println(numbers);

        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique elements: " + uniqueNumbers);

        List<Integer> evenNumbersInRange = uniqueNumbers.stream()
                .filter(num -> num % 2 == 0 && num >= 7 && num <= 17)
                .collect(Collectors.toList());
        System.out.println("Even numbers between 7 and 17: " + evenNumbersInRange);

        List<Integer> multipliedNumbers = uniqueNumbers.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
        System.out.println("Elements multiplied by 2: " + multipliedNumbers);

        List<Integer> sortedFirstFour = multipliedNumbers.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("First 4 sorted elements: " + sortedFirstFour);

        long count = multipliedNumbers.stream().count();
        System.out.println("Elements` number in stream: " + count);

        double average = multipliedNumbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average of all numbers: " + average);
    }
}
