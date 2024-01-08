package override_2;

class A {
    // This method cannot be overridden by a child class
    public final void nonOverridableMethod() {
        System.out.println("This method cannot be overridden by a child class.");
    }
}

// Class B cannot override nonOverridableMethod
class B extends A {
    // public void nonOverridableMethod() { }
}

// Another class using the non-overridable method from class A
class AnotherClass {
    public void useMethodFromA() {
        A objA = new A();
        objA.nonOverridableMethod();
    }
}

public class Main {
    public static void main(String[] args) {
        A objA = new A();
        objA.nonOverridableMethod();  // Directly calling from class A

        B objB = new B();
        objB.nonOverridableMethod();  // This will call the method from class A

        AnotherClass anotherObj = new AnotherClass();
        anotherObj.useMethodFromA();  // Using the method in another class
    }
}
