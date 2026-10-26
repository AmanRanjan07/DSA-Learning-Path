package Bit_manuplation;
// Implement the code for the number N is power of 2 or not ....

public class CheckWeatherNpower2 {
    public static void main(String[] args) {

        // note fix for n = 0 beacuse it will give you true

        int n = 16;
        boolean ans = (n&(n-1)) == 0;
        System.out.println(ans);
        if(ans == true){
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a power of 2");
        }
    }
}
