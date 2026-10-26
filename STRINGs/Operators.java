import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' +'b');// what happen here, it's simply do changes into the ascci value and do the operation
        System.out.println("a" + "b"); // simply concat the value of that ..
        System.out.println((char)'a'+3); // typeCasting here add the ASCII value and the Digit and return the character..


        System.out.println("a" + 1);
    // what it will gives same as after few steps is "a" + "1" ..
    // integer will be convert to Integer that will call it as toString...


        // making the new integer array here with an object..

        System.out.println("Aman "+ new ArrayList<>());
        System.out.println("Aman new object value: " + new Integer(007));
        String ans = (new Integer(100) +""+new ArrayList<>());
        System.out.println("For joining two object using atleast String object: "+ans);

        System.out.println("a"+'z'); // if any data type is string the output will be string..
    }
}
