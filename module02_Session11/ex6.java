package module02_Session11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        List<Integer> newList = new ArrayList<>();


        for (Integer number : list) {
            if (!newList.contains(number)) {
                newList.add(number);
            }
        }
        System.out.println(newList);

    }
}
