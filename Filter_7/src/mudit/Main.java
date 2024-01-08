package mudit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class A {
    private int id;
    private int marks;
    private String subject;

    public A(int id, int marks, String subject) {
        this.id = id;
        this.marks = marks;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubject() {
        return subject;
    }
}

public class Main {
    public static void main(String[] args) {
        List<A> listOfA = Arrays.asList(
                new A(1, 95, "Math"),
                new A(2, 54, "English"),
                new A(3, 82, "Science"),
                new A(4, 45, "History")
        );

        // Use Java 8 streams to filter the list based on marks > 60
        List<A> filteredList = listOfA.stream()
                .filter(a -> a.getMarks() > 60)
                .collect(Collectors.toList());

        // Print the filtered list
        System.out.println("Filtered List with Marks > 60:");
        filteredList.forEach(a -> System.out.println("ID: " + a.getId() + ", Marks: " + a.getMarks() + ", Subject: " + a.getSubject()));
    }
}

