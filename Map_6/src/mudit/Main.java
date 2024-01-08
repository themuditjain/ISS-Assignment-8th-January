package mudit;

import java.util.*;

class Student {
    private int ID;
    private String name;
    private String address;

    public Student(int ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return ID == student.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Subject {
    private int ID;
    private String name;

    public Subject(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Map<Student, List<Subject>> studentSubjectMap = new HashMap<>();

        Student student1 = new Student(1, "Mudit", "E-1A Meerut, Uttar Pradesh");
        Student student2 = new Student(2, "MJ", "Shahdara, Delhi");

        Subject subject1 = new Subject(101, "Math");
        Subject subject2 = new Subject(102, "Science");

        // Add entries to the map
        studentSubjectMap.computeIfAbsent(student1, k -> new ArrayList<>()).add(subject1);
        studentSubjectMap.computeIfAbsent(student2, k -> new ArrayList<>()).add(subject2);

        // Add another entry with the same key
        studentSubjectMap.computeIfAbsent(student1, k -> new ArrayList<>()).add(new Subject(103, "History"));

        // Print the map
        for (Map.Entry<Student, List<Subject>> entry : studentSubjectMap.entrySet()) {
            System.out.println("Student: " + entry.getKey());
            System.out.println("Subjects: " + entry.getValue());
            System.out.println();
        }
    }
}

