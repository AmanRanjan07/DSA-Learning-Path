package exceptionHandling;

import ACCESS.A;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//           divide(a,b);

            // Throw your own exceptions here
            String name = "Aman";
            if (name.equals("Aman")){
                throw  new MyException("Name is Aman");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will always execute here..");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
//        return a / b;
        if(b == 0){
            throw new ArithmeticException("Please do not divide it by Zero");
        }
        return a/b;
    }
}
