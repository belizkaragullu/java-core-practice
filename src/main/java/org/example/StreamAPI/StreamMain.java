package org.example.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);
        list.add(12);
        list.add(3);
        list.add(89);
        list.add(25);
        list.add(44);
        list.add(100);
        list.add(7);
        list.add(63);

        System.out.println("\nPrint all numbers:");

        //foreach
        list.stream().
                forEach(element -> System.out.println(element));

        System.out.println("\nPrint numbers that are greater than 60:");

        //filter
        list.stream().filter(num -> num> 60)
                .forEach(num ->System.out.println(num));


        System.out.println("\nPrint list without duplication:");

        //distinct
        list.stream().distinct()
                .forEach(i -> System.out.println(i));

        System.out.println("\nSorted list:");

        //asc sort
        list.stream().sorted()
                .forEach(i -> System.out.println(i));

        System.out.println("\nSorted list in descending order:");

        //desc sort
        list.stream().sorted(Comparator.reverseOrder())
                .forEach(i->System.out.println(i));

        System.out.println("\nPrint first 5 number:");

        //limit
        list.stream().limit(5)
                .forEach(i-> System.out.println(i));

        //anymatch
        boolean isEqualsTo25 = list.stream().anyMatch(i -> i ==25);
        boolean isGreaterThan100 =list.stream().anyMatch(i -> i >100);

        System.out.println("\nIs there any number that equals to 25? "+ isEqualsTo25);
        System.out.println("Is there any number that greater than 100? " +isGreaterThan100);

        System.out.println("\nMultiply every element by 2: ");

        //map
        list.stream().map(i -> i*2)
                .forEach(i -> System.out.println(i));
    }
}
