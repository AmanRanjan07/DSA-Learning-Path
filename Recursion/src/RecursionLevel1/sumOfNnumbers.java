package RecursionLevel1;

public class sumOfNnumbers {
    public static void main(String[] args) {
        int num = 5;
        int ans = SumNnumber(5);
        System.out.println(ans);
    }
    static int SumNnumber(int n) {
       if(n<0){
           return 0;
       }
        return n+SumNnumber(n-1);  // passing the value here again and again here accordingly

    }

}

