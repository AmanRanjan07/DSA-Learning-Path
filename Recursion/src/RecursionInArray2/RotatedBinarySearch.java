package RecursionInArray2;

import javax.xml.stream.events.StartDocument;

// RBS in the given array here make a search for the target element here accordingly...
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int []arr = {5,6,7,8,9,1,2,3};
        System.out.println(Search(arr,9,0,arr.length-1));
    }
    static int Search(int []arr,int target,int s,int e){
        if(s > e){
            return - 1;
        }
        int mid = s + (e - s) / 2;

        if(arr[mid] == target){
            return mid; // means that found the answer...
        }
        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                return Search(arr,target,s,e-1);
            } else {
                return Search(arr,target,mid+1,e);
            }
        }
        if(target >= arr[mid] && target <=  arr[e]){
            return Search(arr,target,mid+1,e);
        }
        return Search(arr, target,s,mid-1);
    }
}
