package Bit_manuplation;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a-1);

        System.out.println("XOR from a to b is :"+ans);

        // using the loops it will make TLE for the large number...
        int ans2 = 0;
        for(int i=a;i<=b;i++){
            ans2 ^= i;
        }
        System.out.println("Using loops not for the large number: "+ ans2);
    }
    // this gives XOR from 0 till a
    static int xor(int a){
        if(a % 4 == 0){
            return  a;
        }
        if(a % 4 == 1){
            return  1;
        }
        if(a % 4 == 2){
            return  a+1;
        }
        return 0;

    }
}
