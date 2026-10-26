package Properties.Polymorphism;

public class ObjectPrint {
    int num;
    public ObjectPrint(int num){ // Construct the num..
        this.num = num;
    }
        // Use the toString method to print the method


    @Override
    public String toString(){
        return "ObjectPrint{"+
                "num= "+ num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);
        System.out.println(obj);
    }
}
