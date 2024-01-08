package mudit;

//Parent class
class student {
private String name;

public student(String name) {
   this.name = name;
}

public String getDetails() {
   return "Student: " + name;
}
}

//Child class
class faculty extends student {
private String designation;

public faculty(String name, String designation) {
   super(name);
   this.designation = designation;
}

// Override the getDetails method in the child class
@Override
public String getDetails() {
   return "Faculty: " + super.getDetails() + ", Designation: " + designation;
}
}

public class Main {
public static void main(String[] args) {
   // Creating objects of the classes
   student studentObject = new student("Mudit Jain");
   faculty facultyObject = new faculty("Umadevi KS", "HOD");

   // Calling the getDetails method using the objects
   System.out.println(studentObject.getDetails());
   System.out.println(facultyObject.getDetails());

   // Using a polymorphic object to call the parent class method
   student polyObject = new faculty("Rajukmar R", "Profrssor Grade 1");
   System.out.println(polyObject.getDetails());
}
}
