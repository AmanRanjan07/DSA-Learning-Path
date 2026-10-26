package Strings;

import java.util.Locale;

public class Strime {
    public static void main(String[] args) {
        skipCh("","baccah");
        System.out.println(skip("baeecah"));
        System.out.println(skipApple("abbbcdeAppleched"));
    }
    static void skipCh(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch == 'a'){
            skipCh(p,up.substring(1));
        } else{
            skipCh(p+ch,up.substring(1));
        }
    }

    //Using the return value into this
    static  String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        }
        else{
            return ch+ skip(up.substring(1));
        }
    }


    // removing the word form the string if it is containing a particular word like "Apple"///////
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("Apple")){
            return skipApple(up.substring(5));
        } else{
            return up.charAt(0)+skipApple(up.substring(1));
        }
    }
}
