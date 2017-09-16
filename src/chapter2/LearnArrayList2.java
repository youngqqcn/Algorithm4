package chapter2;

import java.util.LinkedList;

import static java.util.Collections.max;

/**
 * Created by yqq on 2017/9/16.
 */
public class LearnArrayList2 {
    public static void main(String[] args) {


//        ArrayList <Double> al = new ArrayList<Double>(10);
//
//        for (int i = 0; i < 1000; i++) {
//
//            al.add(i * 100.0);
//        }
//        System.out.println(al.size());
//
//        Collections.reverse(al);
//
//        for (Object obj: al
//             ) {
//            System.out.println(obj);
//        }
//
//        sort(al);
//
//        System.out.println( binarySearch(al, 900.0)); //返回索引
//
//        ArrayList<Double> al2 = new ArrayList<Double>(10);
//        al2 = (ArrayList<Double>) al.clone();
//
//        System.out.println(al2.size());


        LinkedList list = new LinkedList();
        list.addLast(343);
        list.addLast(333);
        list.addLast(3143);
        list.addLast(43);
        list.addLast(439);

        System.out.println("Max Value is " + max(list) );

    }
}
