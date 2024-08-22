package module02_Session11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*10));
            System.out.println(list.get(i));
        }


        System.out.println("max" + Collections.max(list));

        Collections.reverse(list);

        System.out.println("reverse" + list);


        Collections.sort(list);

        System.out.println("sort" + list);

    }
}
