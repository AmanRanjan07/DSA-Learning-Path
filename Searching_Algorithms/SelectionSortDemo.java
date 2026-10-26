package DsaInJava.Searching_Algorithms;
// this good and enough for the small size of the array length.
// basically here we are choosing the max/min element into the array and place it on the correct position
import java.util.Arrays;

public class SelectionSortDemo {
    public static void main(String[] args) {
        int []arr = {3,1,4,63,2,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            // Find the max item in the remainaing array and swap with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr,int fisrt,int second){
        int temp = arr[fisrt];
        arr[fisrt] = arr[second];
        arr[second] = temp;
    }
    static int getMaxIndex(int []arr,int start,int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
