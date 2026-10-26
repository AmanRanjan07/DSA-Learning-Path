package Bit_manuplation;

public class countNodDigBaseb {
    public static void main(String[] args) {
        int n = 10;    // suppose n  = 123456;
        int base = 2; // and base will be = 10;  then the output will be the 6

        int ans = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);  // for this here output will 4
    }
}

// Time Complexity will be log(n)...
