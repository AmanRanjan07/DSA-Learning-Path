package RecursionLevel1;

public class ReverseNumber {
    static int sum = 0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n % 10;
        sum = sum *10 + rem;
        rev1(n / 10);
    }
    public static void main(String[] args) {
        int n = 1234;
        int ori = n;
        int rev = 0;
        while(n>0){
            int dig = n%10;
            rev = (rev*10)+dig;
            n/=10;
        }
        System.out.println(ori +" number after reversing here: "+rev);

        rev1(1253);
        System.out.println("After reversing the n: "+sum);
    }

}
