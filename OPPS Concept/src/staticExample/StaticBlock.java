package staticExample;
// This is a demo to show initilisization of the static variable ...
public class StaticBlock {
    static int a = 4;
    static int b;
// This will only run once, when the first obj is created i.e when the class is loaded for the first time
    static {
        System.out.println("I am in the static Block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
