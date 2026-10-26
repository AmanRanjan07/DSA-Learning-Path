package DsaInJava.Searching_Algorithms.LinearSearching;

import java.util.Arrays;

public class SearchIN2Darray {
    public static void main(String[] args) {
        int [][]arr = {
                {23,1,4},{18,12,3,9},
                {78,99,34,56},{18,112}
        };
        int target = 34;
        int []ans = Search(arr,target);
        System.out.println("Available on: "+"Row: " + ans[0] + ", Col: " + ans[1]);
        System.out.println("Available on: "+Arrays.toString(ans));  // Using the Arrays function to the index of element..
    }
    static int[] Search(int [][]arr,int tar){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == tar){
                    return new int []{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
