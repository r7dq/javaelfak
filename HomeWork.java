package com.mycompany.homework;
import java.util.ArrayList;
public class HomeWork {
public static void main(String[] args) {
    ArrayList<Double> grades = createGrades();
    ArrayList<Number> allGrades = new ArrayList<>();
    ArrayList<Object> reports = new ArrayList<>();
    for (Double grade : grades) {
        addGrade(allGrades, new Box<>(grade));
    }
    copyGrades(grades, reports);
    System.out.println("Student Grades:");
    displayGrades(grades);
    System.out.println("All Grades:");
    displayGrades(allGrades);
    System.out.println("Reports:");
    displayGrades(reports);
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
static ArrayList<Double> createGrades() {
    ArrayList<Double> grades = new ArrayList<>();
    grades.add(85.5);
    grades.add(92.0);
    grades.add(78.5);
    return grades;
}
static void addGrade( ArrayList<? super Number>destination,Box<? extends Number> gradeBox){
    destination.add(gradeBox.getValue());
}
static <T extends Number> void copyGrades(ArrayList<T> source,ArrayList<? super T> destination){
    for (T grade : source) {
        destination.add(grade);
    }
}
static void displayGrades(ArrayList<?> grades) {
    for (Object grade : grades) {
        System.out.println(grade);
    }
}}
  