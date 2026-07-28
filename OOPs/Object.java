package OOPs;

//An object is an instance of a class. It occupies memory and can access the class's variables and methods.

class Student {

    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Object {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Aman";
        s1.age = 21;

        Student s2 = s1;

        s2.display();

        s2.name = "Rahul";

        s1.display();

        s1 = null;

        System.out.println(s2.name);
    }
}