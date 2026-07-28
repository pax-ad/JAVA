package OOPs.Encapsulation;

public class Encapsule 
{
     public static void main(String[] args) {

        Student s = new Student();

        s.setName("Aman");
        s.setAge(21);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}   

//access using getter and setter

   class Student {

    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }
}
