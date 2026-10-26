package Singleton;

public class Main {
    public static void main(String[] args) {
//        SingletonClass obj = new SingletonClass(); // you did the singleton class private so that you can't access through the another class
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        SingletonClass obj3 = SingletonClass.getInstance();

        //All 3 referance variables are pointing to the just one object ....
    }
}
