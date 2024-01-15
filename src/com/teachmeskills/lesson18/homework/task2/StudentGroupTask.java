package com.teachmeskills.lesson18.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentGroupTask {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Даниил");
        students.add("Сергей");
        students.add("Андрей");
        students.add("Дмитрий");
        students.add("Полина");
        students.add("Степан");
        students.add("Артур");
        students.add("Иван");
        students.add("Федор");
        students.add("Елизавета");
        students.add("Марк");

        List<String> filteredNames = students.stream()
                .filter(name -> name.toLowerCase().startsWith("а"))
                .sorted(String::compareToIgnoreCase)
                .collect(Collectors.toList());

        System.out.println("All the names that start with 'a': " + filteredNames);

        if (!filteredNames.isEmpty()) {
            String firstFilteredName = filteredNames.get(0);
            System.out.println("First name that starts with 'а': " + firstFilteredName);
        } else {
            System.out.println("There are no names that start with 'а'");
        }
    }
}
