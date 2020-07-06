package newPractice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListsExamples {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");


        list.add("Alaska");
//        System.out.println(list);
//
//        list.remove(0);
//        System.out.println(list);
//
//        String state = list.get(2);
//        System.out.println(state);
//
//        int pos = list.indexOf("Alaska");
//        System.out.println("Alaska is at position " +  pos);

        System.out.println("ArrayList Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println();

        System.out.println("ForEach Iterator");
        for (String value: list) {
            System.out.println(value);
        }

        System.out.println();

        System.out.println("Java8 method reference");
        list.forEach(System.out::println);

    }
}
