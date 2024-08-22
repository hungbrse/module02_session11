package module2_session1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("nhập chiều rộng");

        double chieuDai = sc.nextDouble();
        System.out.println("nhập chiều ");
        double chieuRong = sc.nextDouble();


        System.out.println("Chu pin hình chữ " + (chieuDai * chieuRong) * 2);


        System.out.println("Diện tích hình chữ " + (chieuDai * chieuRong));





    }
}
