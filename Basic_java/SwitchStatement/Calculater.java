package DsaInJava.Basic_java.SwitchStatement;

import java.util.Scanner;

public class Calculater {
    public Calculater() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = 0;

        while(true) {
            System.out.println("Enter the Operation: ");
            char var3 = var1.next().trim().charAt(0);
            if (var3 != '+' && var3 != '-' && var3 != '*' && var3 != '/' && var3 != '%') {
                if (var3 == 'E' || var3 == 'e') {
                    return;
                }
            } else {
                System.out.println("Enter the Number: ");
                int var4 = var1.nextInt();
                int var5 = var1.nextInt();
                if (var3 == '+') {
                    var2 = var4 + var5;
                }

                if (var3 == '-') {
                    var2 = var4 - var5;
                }

                if (var3 == '*') {
                    var2 = var4 * var5;
                }

                if (var3 == '/') {
                    if (var5 != 0) {
                        var2 = var4 / var5;
                    } else {
                        System.out.println("Invalid Number is!");
                    }
                }

                if (var3 == '%') {
                    var2 = var4 % var5;
                }
            }

            System.out.println("For exit the enter the 'E' or 'e'.");
            System.out.println("Output: " + var2);
        }
    }
}
