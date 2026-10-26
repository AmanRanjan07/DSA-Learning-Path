package Introduction_Recursion;

public class RecursionExample1 {
    public static void main(String[] args) {
        print(1);  // just pass the value into the function here// after-words it terminate at the end until it will reach the base condition here

    }
    static void print(int n){
        if(n == 5){  // This line of the code is called it as a base condition here where we have to stopped creating the
            // stack points...
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);  // It will make function calling it self here one by one here ....
    }
}
