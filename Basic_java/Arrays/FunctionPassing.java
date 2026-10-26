package DsaInJava.Basic_java.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionPassing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []nums = {3,4,5,6,8,9};
        System.out.println("The Actual Arr: "+Arrays.toString(nums));
        change(nums);
        System.out.println("The changes in the arr:"+Arrays.toString(nums));
    }
    static void change(int []arr){
        arr[2] = 143;
    }
}
