package DsaInJava.Basic_java.Function;

import java.util.Scanner;

public class ArmstrongUsingFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstorm(n));  // passing the referance to the isArmstrom function
        for(int i=0;i<1000;i++){
            if(isArmstorm(i)){  // here we are passing the i as the referance to the isArmstrom
                System.out.println(i);
            }
        }
    }
    static boolean isArmstorm(int n){  // here we are passing the both n and i in the function.
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            n /= 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;

    }
}
