package RecursionLevel1;

public class SumofDigits {
    public static void main(String[] args) {
        int dig = 12345;
        int ans = DigitSum(dig);
        System.out.println(ans);
    }
    static int DigitSum(int d){
        if(d == 0){
            return 0;
        }
        return (d%10)+DigitSum(d/10);
    }
}
