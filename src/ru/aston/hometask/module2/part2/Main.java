package ru.aston.hometask.module2.part2;

import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Book> optionalBook = Data.getStudents().stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .peek(book -> System.out.println("Год выпуска книги: " + book.getYear()))
                .findFirst();


        optionalBook
                .map(book -> "Найденная книга за  определенный год год: " + book.getYear())
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Книг не найдено")
                );
    }
}
