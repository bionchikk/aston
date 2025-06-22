package ru.aston.hometask.module2.part1;

public class Main {
    public static void main(String[] args) {
        MyHashSet<String> sett = new MyHashSet<>();
        sett.add("Dima");
        sett.add("Nastya");
        System.out.println(sett);
        sett.remove("Dima");
        System.out.println(sett);
//        sett.add("Nastya");
//        sett.remove("Dima");

        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(1);
        System.out.println("ArrayList: " + list);

    }
}
