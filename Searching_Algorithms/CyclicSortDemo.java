package DsaInJava.Searching_Algorithms;

import java.util.Arrays;
// IN this basically the array element should be in the in between the range of up to n ....
public class CyclicSortDemo {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,4};
        Cyclic(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(arr));
    }
    static  void Cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;  // assign the correct to arr element
            if(arr[i] != arr[correct]){ // chech weather the element is the correct position or not if not than do swap operation
                swap(arr,i,correct);  // swap with the element or the value = index - 1;
            }
            else{
                i++;  // else mean element is at the correct position check the next Element.
            }

        }
    }
    static void swap(int []arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
