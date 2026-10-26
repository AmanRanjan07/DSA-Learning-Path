import java.util.Arrays;

public class StringManuplation {
    public static void main(String[] args) {
        String a  = "Aman";
        String b = "Aman";
        // here both are coming under the same pool and both are pointing to the same value Aman into the string.
        // String is immutable in java
// String is class in java because everything in java class first latter will be in capital latter...
        String c = a;
        System.out.println(c);
        System.out.println("Comparing the string ==");
        System.out.println(a == c);
        System.out.println(a == b);
        // by the above you can see that both are pointing to same heap memory..
// Creating saperate allocation in outside of the heap..
// here both are pointing to a separate value for n1 and n2...
        System.out.println("Create Create for the class method for the STRING");
        String n1 = new String("Aman");
        String n2 = new String("Aman");
        System.out.print("== use to check diff obj:  ");
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));

        // To access the element of the String you can't do it like Array use charAt(0)
        // Work as String object like
        System.out.println(n1.charAt(0));


        // what will do sime in case of toString java it's a pre-define object/method in java..

        System.out.println(Arrays.toString(new int[]{1,2,5,3,6}));


    }
}
