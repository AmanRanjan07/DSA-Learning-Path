package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list2.add(21);
        list2.add(24);
        list2.add(27);
        list2.add(29);
        list2.add(43);
        list2.add(46);
        System.out.println(list2);

// Vector is thread safe and synchronised from ..
        List<Integer> vector = new Vector<>();
        vector.add(43);
        vector.add(5);
        vector.add(15);
        vector.add(55);
        System.out.println(vector);
    }
}
