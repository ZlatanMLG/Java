package lab7;

import lab6.Rate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(new Rate(80000, 50));
        myList.add(new Rate(150000,100));
        myList.add(new Rate(1000,550));

        MyList emptyList = new MyList();
        emptyList.add(new Rate(2000,300));

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Rate(80000,50));
        arrayList.add(new Rate(150000,100));
        MyList list2 = new MyList(arrayList);

        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(iterator.next());

        System.out.println("++++++++++++");

        ListIterator listIterator = list2.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

        System.out.println(list2.contains(new Rate(4,4)));
    }
}