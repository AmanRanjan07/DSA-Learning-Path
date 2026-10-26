package Bit_manuplation;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 45;
        // converting the n into a binary string here ..
        System.out.println(Integer.toBinaryString(n));


        System.out.println(setBit(n));
    }
    static int setBit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        return count;
    }
}
