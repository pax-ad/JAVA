package Predict_output;

public class PQ1 {
    
    public static void main(String[] args) {
        //1
        int x = 10;
        System.out.println(x++);
        System.out.println(++x);

        //2
        String s = "Java";
        s.concat(" Programming");
        System.out.println(s);

        //3
        String a = "Java";
        String b = "Java";
        System.out.println(a == b);

        //4
        String c = new String("Java");
        String d = new String("Java");
        System.out.println(c == d);

        //5
        System.out.println(10 + 20 + "Java");

        //6
        System.out.println("Java" + 10 + 20);
    }
}
