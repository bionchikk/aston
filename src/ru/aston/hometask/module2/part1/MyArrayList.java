package ru.aston.hometask.module2.part1;

import java.util.Arrays;

public class MyArrayList <E>{
    private Object[] data;
    private int size;

    public MyArrayList(){
        data = new Object[10];
        size = 0;
    }

    public void  add(E element){
        increaseSize();
        data[size++] = element;

    }

    public E get(int index){
        checkIndex(index);
        return (E) data[index];

    }

    public E remove(int index){
        checkIndex(index);
        E removed = (E) data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
        return removed;

        }

    public void addAll(MyArrayList<E> other) {
        for (int i = 0; i < other.size; i++) {
            this.add(other.get(i));
        }
    }

    private void increaseSize(){
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }

    }


    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, size));
    }

    // по желанию можно добавить выброс ошибок, если не хотим что бы в список можно было добавить null

}
