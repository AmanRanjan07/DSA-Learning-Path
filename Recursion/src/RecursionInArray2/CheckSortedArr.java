package RecursionInArray2;

public class CheckSortedArr {
    public static void main(String[] args) {
        int []arr = {1,2,4,5,6,7,82,9};
        System.out.println(SortedArr(arr,0));
    }
    static boolean SortedArr(int []arr,int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && SortedArr(arr,index+1);
    }


}
