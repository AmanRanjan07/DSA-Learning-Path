package DsaInJava.Basic_java.Function;
// Java sometime you want a maethod to accept a variable number of argument instead of a fix count
import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        fun(2,3,4,5,6,72,99,190);
        fun("aman","ankit","shiva","khusbhboo");// NO need to pass the "..." for the variable passing
        //❌ Problem: ... is used only in method definition, not while calling the method.
        //While calling, you just pass values normally.

        multiple(4/2,9/3,"kunal","Rahul","devu");

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...s){  // decleare them fun for the different fun for different data type
        System.out.println(Arrays.toString(s));
    }
    static void multiple(int a, int b,String ...v){  // multiple is the function name not the anything...
        System.out.println(a+b+Arrays.toString(v));// by this line of code you will understand the creating the different types of
        // in the single fun of the code.: Here we are returing the sum of a and b vaiable and after that what are string after that.

    }
}


// function Overloading means Defining multiple method with the same name but Different Parameter list int he same class.
// The compiler decides which method to call based on the number of argument and their type.
// It's way of achieve - compile - time - polymorphism.
/*for example:
✔ This IS Function Overloading
Because:Same method name → fun
Different parameter list:
One takes int...
One takes String...
So this is:Compile-time polymorphism (Method Overloading) ✅
 */