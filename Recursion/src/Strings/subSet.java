package Strings;

import java.util.ArrayList;

public class subSet {
    public static void main(String[] args) {
        subseq("","abc");

        System.out.println(subsetReq("","ABC"));

        // how to get the ascii value here ..
        char ch = 'a';
        System.out.println(ch+0);
        System.out.println((char)(ch+1));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }

    // Some what using the ArrayList in the method
    static ArrayList<String> subsetReq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsetReq(p+ch,up.substring(1));
        ArrayList<String> right = subsetReq(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
