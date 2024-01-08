package mudit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    private int id;
    private int marks;
    private String subject;

    public Student(int id, int marks, String subject) {
        this.id = id;
        this.marks = marks;
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.getMarks(), this.getMarks());
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Marks: " + marks + ", Subject: " + subject;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, 90, "Math"));
        students.add(new Student(2, 85, "Science"));
        students.add(new Student(3, 92, "English"));
        students.add(new Student(4, 88, "Social Science"));
        students.add(new Student(5, 95, "IT"));
        students.add(new Student(6, 94, "Math"));
        students.add(new Student(7, 87, "Science"));

        // Using Comparable
        System.out.println("Sorted by Comparable (highest marks in Math):");
        Collections.sort(students);
        printStudents(students);

        // Using Comparator and Collection.sort
        System.out.println("\nSorted by Comparator (highest marks in Math):");
        Collections.sort(students, Comparator.comparingInt(Student::getMarks)
                .thenComparing(student -> student.getSubject().equals("Math") ? 0 : 1, Comparator.naturalOrder())
                .reversed());
        printStudents(students);
    }

    private static void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
