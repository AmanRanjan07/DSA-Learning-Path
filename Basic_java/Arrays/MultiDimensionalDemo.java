package DsaInJava.Basic_java.Arrays;

import java.util.Scanner;

public class MultiDimensionalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][2];
        System.out.println(arr.length);   // By this you will get the Number of row in the array.
        System.out.println("Enter the row col values: ");
        // Taking the input in the array
        for(int row=0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }
        //For that input and we go to see the output
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();   // by this you will see three row and two column here...
        }
    }
}
