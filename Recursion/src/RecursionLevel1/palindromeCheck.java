package RecursionLevel1;

public class palindromeCheck {
    public static boolean isPalindrome(int num){
        if(num<0){
            return false;
        }
        int ori = num;
        int revnum = 0;
        while(num > 0){
            int rem = num % 10;
            revnum = revnum * 10 +rem;
            num /= 10;
        }
        return ori == revnum;
    }
    public static void main(String[] args) {
        boolean ans = isPalindrome(121);
        System.out.println(ans);
    }
}
