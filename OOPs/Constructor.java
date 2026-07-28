package OOPs;

public class Constructor {
    
    /*A constructor is a special method that is automatically called when an object is created. It is used to initialise the object's data.

Rules
Constructor name must be the same as the class name.
It has no return type (not even void).
It is called automatically when using the new keyword. */

public static void main(String[] args) {

        Student s1 = new Student();
        
    }


}

class Student {

    String name;
    int age;

    // Constructor
    Student() {
        System.out.println("Constructor Called");
    }
}

