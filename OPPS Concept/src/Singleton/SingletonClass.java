package Singleton;

import javax.swing.*;

public class SingletonClass {
    // IN case only one of the instance is allowed then what we can do
    // PRIVATE means that you can only use in the class only

    private SingletonClass() {

    }
    private static SingletonClass instance;
        public static SingletonClass getInstance() {
            if (instance == null) {
                instance = new SingletonClass();
            }
            return instance;
        }

}
