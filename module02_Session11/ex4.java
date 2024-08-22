package module02_Session11;

import java.util.ArrayList;
import java.util.List;

public class ex4 {
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



        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i + 1 ; j < list.size(); j++) {
                if(list.get(i) > list.get(j)) {
                    int temp = list.get(j);
                list.set(j, list.get(i));
                list.set(i, temp);

                }
            }
        }

        System.out.println(list);



    }
}
