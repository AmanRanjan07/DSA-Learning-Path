package DsaInJava.Basic_java.Function;

public class ShodowingDemo {
    static int x = 90; // class-level variable based on the variable
    static void fun(){
        System.out.println("Inside fun(), x = " +x);  //
    }
    public static void main(String[] args) {
        System.out.println("Before shadowing, x = " +x);
        int x = 40;// this local x SHADOWS the class variable
        System.out.println("After shadowing, local x = " +x);
        fun();  // prints class-level x, not local one  // here this will print the fun funtion x value that is declear globoly.
    }
}
