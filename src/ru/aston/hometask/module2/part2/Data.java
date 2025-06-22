package ru.aston.hometask.module2.part2;

import java.util.Arrays;
import java.util.List;

public class Data {
    public static List<Student> getStudents() {
        return List.of(
                new Student("Dima", Arrays.asList(
                        new Book("Букварь", 300, 1999),
                        new Book("Незнайка", 250, 2005),
                        new Book("Математика", 400, 2001),
                        new Book("Физика", 350, 2015),
                        new Book("Химия", 280, 2010)
                )),
                new Student("Nastya", Arrays.asList(
                        new Book("Букварь", 300, 1999),
                        new Book("История", 320, 2020),
                        new Book("Русский язык", 410, 2021),
                        new Book("Биология", 260, 2018),
                        new Book("Геометрия", 290, 2000)
                ))
        );
    }
}
