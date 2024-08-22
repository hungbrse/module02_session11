package module02_Session11;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {

        String chuoi = "mua troi ca bau troi nang vut di nhung loi buon";

        String[] arrStr = chuoi.split(" ");

        List<String> list = new ArrayList<String>();

        int doDai = arrStr[0].length();

        for (int i = 0; i < arrStr.length; i++) {

            if (arrStr[i].length() < doDai) {
                doDai = arrStr[i].length();
            }
        }

        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() == doDai) {
                list.add(arrStr[i]);
            }
        }

        System.out.println(list);

    }
}
