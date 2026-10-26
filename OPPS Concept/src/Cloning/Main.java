package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aman = new Human(21,"Aman Ranjan");
//        Human twin = new Human(aman);
        // Insted of the above line we can use here as a Clone operation into this
        // Clone is help here to fast copy of the object here without using the "new" thing and "this" like without usnig of the constructor here...
        Human twin = (Human)aman.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
