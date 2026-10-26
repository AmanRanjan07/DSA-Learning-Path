import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Aman Roy I am your business partner ";
        System.out.println(Arrays.toString(name.toCharArray()));  // Change into a character Array
        System.out.println(name.toLowerCase()); // Make it that string into a lower case
        System.out.println(name); //But String is Immuatable so that it will not change into the original array

        System.out.println(name.indexOf('a'));

        // strip() used in to remove the extra space into that...
        System.out.println("      Aman     ".strip());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
