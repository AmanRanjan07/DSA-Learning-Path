package DsaInJava.Searching_Algorithms;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int [] arr = {1,-1,0,-7,87,-2};
        bubble(arr);
        System.out.println("The sorted arr: "+ Arrays.toString(arr));
    }

    // One this here for the Sorted array or there is no swap is occur in the inner loop means that the
    // array is in the sorted order than, finally we have to return the array.
    static void bubble(int[] arr){
        boolean swapped;

        // run the step n - 1 times here
        for(int i=0;i<arr.length;i++){
            swapped = false;
            // For the each items or the step, max item will come at the last respective index
            for(int j = 1;j<arr.length - i;j++){
                // swap if the item is smaller than the pervious item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
//            if(!swapped){ // simple way
            if(swapped == false){
                break;
            }
        }
    }
    // here end of this function ...
}
