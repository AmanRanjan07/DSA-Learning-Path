package DsaInJava.Basic_java;
import java.util.Scanner;
public class find_Dublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the you number: ");
        int num = sc.nextInt();
        System.out.print("Enter the number that you have to find: ");
        int n = sc.nextInt();
        int count = 0;
        while(num >0){
            int rem = num%10;
            if(rem == n){
                count ++;
            }
            num = num/10;
        }
        System.out.println("Count of digit is: "+count);
    }
}
