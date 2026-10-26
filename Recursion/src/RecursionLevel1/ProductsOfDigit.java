package RecursionLevel1;

public class ProductsOfDigit {
    public static void main(String[] args) {
        int dig = 1234;
        int ans = prodDig(dig);
        System.out.println(ans);
    }
    static int prodDig(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * prodDig(n/10);
    }
}
