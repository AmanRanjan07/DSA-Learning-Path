package Strings;

import java.util.ArrayList;

public class Leetcode17_phone {
    public static void main(String[] args) {
        pad("","12");

        System.out.println(PadRet("","12"));
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int dig = up.charAt(0) - '0';
        for(int i=(dig - 1) * 3; i<dig*3; i++){
            char ch = (char)('a' + i); // converting to the charater......
            pad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> PadRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int dig = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();

        for(int i=(dig - 1) * 3; i< dig * 3;i++){
            char ch = (char)('a' + i);
            list.addAll(PadRet(p+ch,up.substring(1)));
        }
        return list;
    }
}
