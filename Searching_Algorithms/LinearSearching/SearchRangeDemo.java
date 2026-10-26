package DsaInJava.Searching_Algorithms.LinearSearching;

public class SearchRangeDemo {
    public static void main(String[] args) {
        int []arr = {18,12,-7,3,14,28};
        int target = 1;
        System.out.println(LinSer(arr,target,1,4));
    }
    static int LinSer(int[] arr, int tar,int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            int ele = arr[i];
            if(ele == tar){
                return i;
            }
        }
        return -1;

    }
}
