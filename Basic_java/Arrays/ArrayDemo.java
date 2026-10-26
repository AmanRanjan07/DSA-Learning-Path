package DsaInJava.Basic_java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of arr:");
        int n = sc.nextInt();
        int []arr = {1,6,3,5};
        int []ar = new int[n];
        for(int i=0;i<ar.length;i++){
            ar[i] = sc.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(ar));
//        Using Arrays.toString() (Best)
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
