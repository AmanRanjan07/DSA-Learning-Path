package DsaInJava.Searching_Algorithms.LinearSearching;
//1.Linear Search Algorithm: It's a simplest searching algorithm that checks each element sequentially until a match is found.
// It is a good for unshorted array and small datasets.
public class LinearSearchDemo {
    public static void main(String[] args) {
        int []num = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int ans=LinearSearch(num,target);
        System.out.print(ans);
    }
    static int LinearSearch(int []arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int idx=0;idx<arr.length;idx++){
            int element = arr[idx];
            if(element == target){
                System.out.println(element+" Element is present."+"\n"+"On index element:");

                return idx; // Return the index if the element is present...
            }
        }
        return -1;
    }
}
