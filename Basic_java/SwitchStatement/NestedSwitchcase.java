package DsaInJava.Basic_java.SwitchStatement;

import java.util.Scanner;

public class NestedSwitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empid and departement: ");
        int empId = sc.nextInt();
        String dept = sc.next();
        switch(empId){
            case 1 -> System.out.println("Aman Ranjan");
            case 2 -> System.out.println("Ankit Ranjan");
            case 3 -> System.out.println("Sanjan Naidu");
            case 4 -> System.out.println("Mallaswari Kumari");
            case 5 -> {
                System.out.println("Enter emp dept");
                switch (dept) {
                    case "it" -> System.out.println("IT department");
                    case "sc" -> System.out.println("Science Department");
                    case "cse" -> System.out.println("Computer Science Department");
                    case "ece" -> System.out.println("Electronic Department");
                }
            }
            default -> System.out.println("Enter correct EmpId");
        }
    }
}
