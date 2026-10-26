package DsaInJava.Searching_Algorithms.BinarySearching;
// Here basically the thing is you may have to return the ceiling Value for the target
// ceil is refers to the smallest number in the sorted array that is greater than or equeal to a given target
public class CeillingIN_TheFloor {
    public static void main(String[] args) {
        int []arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = BinarySearchTarget(arr, target);
        System.out.println(ans);
    }
    static int BinarySearchTarget(int []arr, int target){
        int start = 0;
        int end = arr.length - 1;
// What if the target element is greater than the Number in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return  mid;
            }
        }
        return end   ;
    }
}
