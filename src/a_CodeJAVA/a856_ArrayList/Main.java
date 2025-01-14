package a_CodeJAVA.a856_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList();

        list.add(3.13);
        list.add(5.04);
        list.add(8.50);
        list.set(2,5.34);
        //list.remove(0);
        list.add(3,4.44);
        System.out.println(list.get(2));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
