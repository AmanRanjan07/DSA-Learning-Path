package DsaInJava.Basic_java.Function;
// Scope is variable is decleare inside a method, it can only be used in the method(local scope)
public class ScopeINJava {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

       // int res = (random(a,b));
        System.out.println(random(a,b));
    }
    static int random(int a,int b){
        int marks = a+b;
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
        return marks;
    }
}
