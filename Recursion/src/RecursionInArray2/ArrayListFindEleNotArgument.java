package RecursionInArray2;

import java.util.ArrayList;

// Find the Target value in the arraylist without pass in ArrayList into the argument...
public class ArrayListFindEleNotArgument {
    public static void main(String[] args) {
        int []arr = {1,3,2,4,4,5,6};
        System.out.println(ArrayListWithoutArgs(arr,4,0));
    }
    static ArrayList<Integer> ArrayListWithoutArgs(int []arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){ // It will contains answer for that function call only
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCall = ArrayListWithoutArgs(arr,target,index+1);
        list.addAll(ansFromBelowCall);
        return list;
    }
}
