//package DsaInJava.Basic_java;
//
//import java.util.Scanner;
//
//public class Reverse_num {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num = sc.nextInt();
//        int reverse = 0;
//
//        while(num > 0){
//            int rev = num%10;  // By this you will get the last digit..
//            num /= 10;    //Remove the Last digit of the number
//            reverse = reverse* 10 + rev;
//        }
//        System.out.println("Reverse of the number: "+reverse);
//    }
//}

package DsaInJava.Basic_java;

import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.next();
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse Element:" + rev);
        if (str.equals(rev)) {
            System.out.println("Its is Palindrome String: 151" + rev);
        } else {
            System.out.println("Not a Palindrome Number: " + str);
        }
    }
}