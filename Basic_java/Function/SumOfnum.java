package DsaInJava.Basic_java.Function;

import java.util.Scanner;

public class SumOfnum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1+n2;
        System.out.println("The sum of the number is: "+sum);
    }
}
