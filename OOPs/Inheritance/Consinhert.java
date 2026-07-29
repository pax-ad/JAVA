package OOPs.Inheritance;

public class Consinhert {
    
    
    public static void main(String[] args) {

        new Dog();
    }
}

class Animal {

    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("Dog Constructor");
    }
}

