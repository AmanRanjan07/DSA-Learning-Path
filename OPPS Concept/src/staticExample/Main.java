package staticExample;

public class Main {
    public static void main(String[] args) {
        Human Aman  = new Human(21,"Aman Ranjan",100000,false);
        Human Ankit  = new Human(24,"Ankit Ranjan",200000,false);

        System.out.println(Aman.name);
        System.out.println(Human.popolution); // without calling the reference variable we can directly call the static variable

        System.out.println(Aman.popolution);
        System.out.println(Ankit.popolution);
    }
    // this is not dependent on objects
    static void fun(){
//        greeting();// you can't use this because it requires an instance
        // but the function you are using it in does not depends on instance

        // you cannot access non static stuff without referenceing their instance in a static context
        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
        // we know that something which is not static belongs to an object...
    }
    void greeting(){
        System.out.println("Hello world!");
    }


}


// Static is not depends on the object and static will dose't refering the object here