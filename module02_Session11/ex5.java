package module02_Session11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ex5 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(100);
        list.add(10);


        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                      newList.add(list.get(i));
            }
        }

        System.out.println(newList);
    }
}
