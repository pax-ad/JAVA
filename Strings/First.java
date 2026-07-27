package Strings;

//strings in java

public class First {

    public static void main(String[] args) {
        String name1 = "Java";
        String name2 = "java";

        // Case-sensitive comparison
        boolean isEqual = name1.equals(name2); 
        System.out.println("Is equal (case-sensitive)? " + isEqual); // Prints false

        // Case-insensitive comparison
        boolean isEqualIgnore = name1.equalsIgnoreCase(name2); 
        System.out.println("Is equal (case-insensitive)? " + isEqualIgnore); // Prints true
    }
}
