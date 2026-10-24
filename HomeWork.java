package com.mycompany.homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class HomeWork {
public static void main(String[] args) {
    List<Number> numbers = new ArrayList<>();
    List<Object> objects = new ArrayList<>();

    addIntegers(numbers);
    addIntegers(objects);
    System.out.println("numbers: " + numbers);
    System.out.println("objects: " + objects);

    Box<Number> box = new Box<>(0);
    fillBox(box);
    System.out.println("box: " + box.getValue());

    List<Double> doubles = Arrays.asList(2.5, 7.5);
    copyAll(doubles, numbers);
    System.out.println("numbers after copy: " + numbers);
}
static class Box<T> {
    private T value;
    public Box(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
}
static void addIntegers(List<? super Integer> list) {
    list.add(20);
    list.add(30);
    list.add(40);
     list.add(50);
}
static void fillBox(Box<? super Integer> box) {
    box.setValue(100);
}
static <T extends Number> void copyAll(List<T> from, List<? super T> to) {
    for (T item : from) {
        to.add(item);
    }
}}
