package ACCESS;

public class subClass extends A {


    public subClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        subClass obj = new subClass(45,"Aman Ranjan");
//        int n = obj.num; // So using the protcted part you are able to access the with the same package
    }
}
