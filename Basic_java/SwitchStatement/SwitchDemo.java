package DsaInJava.Basic_java.SwitchStatement;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name:\n1.mango\n2.Apple\n3.Orange\n4.Grapes");
        String fruit = sc.next();
// This is the switch statement in the Enhanced way of the code in the clean way

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet and Red in Color");
            case "Orange" -> System.out.println("A Round and Orange in color");
            case "Grapes" -> System.out.println("A Small in size");
            default -> System.out.println("Enter the valid Fruit \n1.mango\n2.Apple\n3.Orange\n4.Grapes");
        }
    }
}

//
//switch (fruit){
//        case "Mango":
//        System.out.println("King of Fruits");
//                break;
//                        case "Apple":
//                        System.out.println("A sweet and Red in Color");
//                break;
//                        case "Orange":
//                        System.out.println("A Round and Orange in color");
//                break;
//                        case "Grapes":
//                        System.out.println("A Small in size");
//                break;
//default:
//        System.out.println("Enter the valid Fruit \n1.mango\n2.Apple\n3.Orange\n4.Grapes");
//        }