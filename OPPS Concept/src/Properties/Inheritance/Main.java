package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.3,7.2,4.9);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w +" "+box1.h);

//        //Inheriting the parent class Info..
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,5,8);
//        System.out.println(box3.h + " " + box3.weight);

//        Box box5 = new BoxWeight(2,4,6,9);
//        System.out.println(box5.w);

        // There are many variables in both parent and child classes
        //You are given access to variables that are in the ref type i.e BoxWeight
        //Hence, you should have access to the weight variable
        //This also means, that ones you are trying to access should be initialized
        // But here, when the obj itself is of type parent class how will you call the constructor of child class
        // that is why it will give you as a erroe
//        BoxWeight box6  = new Box(2,4,7);
//        System.out.println(box6);


        BoxPrice box = new BoxPrice(5,8,200);


    }
}
