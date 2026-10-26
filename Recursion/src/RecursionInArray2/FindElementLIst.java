package RecursionInArray2;

import java.util.ArrayList;

// Question is find the number of the target that will matches the target return the index for that in a list..
public class FindElementLIst {
    public static void main(String[] args) {
        int []arr = {2,5,3,4,4,6,4,7};
        System.out.println(findAllIndex(arr,4,0));
        System.out.println(list);

        System.out.println(FindAllInd(arr,4,0,new ArrayList<>()));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static boolean findAllIndex(int []arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
        return false;
    }


    // something we are going to solve the Arraylist in the another apprach..
    static ArrayList<Integer> FindAllInd(int []arr,int target,int index,ArrayList<Integer> list_l){
        if(index == arr.length){
            return list_l;
        }
        if(arr[index] == target){
            list_l.add(index);
        }
        return FindAllInd(arr,target,index+1,list_l);
    }
}
