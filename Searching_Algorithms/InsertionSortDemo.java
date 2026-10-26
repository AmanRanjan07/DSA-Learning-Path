package DsaInJava.Searching_Algorithms;

import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int []arr = {5,7,-1,0,2,3};
        System.out.println("Original Array:"+Arrays.toString(arr));
        insetionSort(arr);
        System.out.println("Sorted Array"+Arrays.toString(arr));
    }
    static void insetionSort(int[] arr){
        for(int i=0;i<arr.length -1;i++){
            for(int j=i+1;j>0;j--){  // comparing the i and the j index into it
                if(arr[j] < arr[j-1]){
                    swaped(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swaped(int []arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
