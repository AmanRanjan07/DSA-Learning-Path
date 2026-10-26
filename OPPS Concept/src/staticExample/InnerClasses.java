package staticExample;
// Outside class cannot be static ....
public class InnerClasses {
    // Only the inner can be the static here/.....
       static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Aman");
        Test b = new Test("Ankit");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a); // due to the toString method it will prints the value of a here

    }
}
// Object are created on the run time here/ Static and all stuff are resolved at the compile time according