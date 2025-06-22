package ru.aston.hometask.module2.part1;

import java.util.LinkedList;

public class MyHashSet<E> {
    private static final int SIZE = 16;
    private LinkedList<E>[] lists;

    public MyHashSet(){
        lists = new LinkedList[SIZE];
        for(int i = 0; i<SIZE; i++){
            lists[i] = new LinkedList<>();
        }

    }

    private int getIndex(E element){
        return Math.abs(element.hashCode()) % SIZE;
    }

    public void add(E element){
        int index = getIndex(element);
        LinkedList<E> list = lists[index];
        if(!list.contains(element)){
            list.add(element);
        }

    }

    public void remove(E element){
        int index = getIndex(element);
        lists[index].remove(element);

    }

    public boolean contains(E element){
        int index = getIndex(element);
        return lists[index].contains(element);


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (LinkedList<E> bucket : lists) {
            for (E e : bucket) {
                sb.append(e).append(", ");
            }
        }
        if (sb.length() > 1) sb.setLength(sb.length() - 2);
        sb.append("]");
        return sb.toString();
    }
}
