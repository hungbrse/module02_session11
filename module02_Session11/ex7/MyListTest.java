package module02_Session11.ex7;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();


        list1.add(10);
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }

        list1.add(20);
        System.out.println("\n");
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }

        list1.add(0,70);
        System.out.println("\n");
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }

        list1.remove(2);
        System.out.println("\n");
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }





        System.out.println("Do dai cua mang ");
        System.out.println(list1.size());

        list1.clear();


        System.out.println("\nSau khi xoa het");
        for(int i=0;i< list1.size();i++){
            System.out.println(list1.get(i));
        }


    }
}
