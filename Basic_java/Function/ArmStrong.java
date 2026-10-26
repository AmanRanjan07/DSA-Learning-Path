package DsaInJava.Basic_java.Function;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length();

        while(num > 0){
            int digit = num % 10;
            result += Math.pow(digit,digits); // Make sure about this line.you have to take a digit to the power digits..
            num /= 10;
        }
        if (result == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is NOT an Armstrong Number.");
        }
    }
}
