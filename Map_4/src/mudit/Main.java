package mudit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private int ID;
    private int age;
    private String name;

    public Student(int ID, int age, String name) {
        this.ID = ID;
        this.age = age;
        this.name = name;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Student{ID=" + ID + ", age=" + age + ", name='" + name + '\'' + '}';
    }
}

class Subject {
    private int ID;
    private String name;

    public Subject(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Subject{ID=" + ID + ", name='" + name + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Map of class <Student, List<Subject>>
        Map<Student, List<Subject>> studentSubjectMap = new HashMap<>();

        // Creating students
        Student student1 = new Student(1, 22, "Mudit");
        Student student2 = new Student(2, 20, "MJ");

        // Creating subjects
        Subject subject1 = new Subject(101, "Math");
        Subject subject2 = new Subject(102, "Science");
        Subject subject3 = new Subject(103, "History");

        // Associating subjects with students
        List<Subject> subjectsForStudent1 = new ArrayList<>();
        subjectsForStudent1.add(subject1);
        subjectsForStudent1.add(subject2);

        List<Subject> subjectsForStudent2 = new ArrayList<>();
        subjectsForStudent2.add(subject2);
        subjectsForStudent2.add(subject3);

        studentSubjectMap.put(student1, subjectsForStudent1);
        studentSubjectMap.put(student2, subjectsForStudent2);

        // Iterating through the map and printing key-value pairs
        for (Map.Entry<Student, List<Subject>> entry : studentSubjectMap.entrySet()) {
            Student student = entry.getKey();
            List<Subject> subjects = entry.getValue();

            System.out.println("Student: " + student);
            System.out.println("Subjects: " + subjects);
            System.out.println();
        }
    }
}

