package OOPs;

public class Constructor_OVerloading {

     public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Aman");
        Student s3 = new Student("Aman", 21);
    }
    
}

class Student {

    Student() {
        System.out.println("No Arguments");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    Student(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


