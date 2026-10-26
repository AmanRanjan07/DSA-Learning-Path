package ACCESS;

public class A {
    public int num;
    // if make the class it as "private" means that you can't access them from the outside
    String name;
    int [] arr;
// Here we are using the getter and setter method is used to access the value for the
    // from the private method to make them as a public..
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
