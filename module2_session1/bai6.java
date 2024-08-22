package module2_session1;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập điểm toán");
        double toan = sc.nextDouble();
        System.out.println("nhập điểm văn");
        double van = sc.nextDouble();
        System.out.println("nhập điểm a");
        double anh = sc.nextDouble();


        System.out.println("tổng 3 môn là :" +(toan +van + anh));

        System.out.println("trung  3 môn là :" +(toan +van + anh)/3);




    }
}
