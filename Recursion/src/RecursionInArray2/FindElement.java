package RecursionInArray2;

public class FindElement {
    public static void main(String[] args) {
        int []arr = {1,2,5,2,4,6};
        System.out.println(find(arr,4,0));
        System.out.println(findEle(arr,4,0));
    }
    static boolean find(int []arr,int target,int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    static int findEle(int []arr,int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findEle(arr,target,index+1);
        }
    }
}
