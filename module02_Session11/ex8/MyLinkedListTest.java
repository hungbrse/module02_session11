package module02_Session11.ex8;

import java.util.LinkedList;

public class MyLinkedListTest
{
    public static void main(String[] args)
    {
//		List<Integer> numbers = new LinkedList<>();
//		System.out.println(numbers);



        MyLinkedList<String> newList = new MyLinkedList<>();
        newList.add(0,"Hello");
        newList.addLast("World!");
        newList.addLast("Hehe");
        newList.addFirst("Dương Dolce");
//		// result => [World!, Hello]
        System.out.println(newList);
        newList.remove(3);
        System.out.println(newList);
    }
}