package module02_Session11;

public class ex2 {
    public static void main(String[] args) {
        String chuoi = "Rikkei de nong dan biet code";

        String[] arrStr = chuoi.split(" ");


        for (String str : arrStr) {
            if (str.length() >= 3) {
                System.out.println(str);
            }
        }
    }
}
