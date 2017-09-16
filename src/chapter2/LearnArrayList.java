package chapter2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yqq on 2017/9/16.
 */



public class LearnArrayList {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(9);
        al.add("343");

        //System.out.println(al.size());

        //0.使用普通的for
        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i));
        }

        //1.使用迭代器遍历
        for (Iterator it = al.iterator(); it.hasNext();){
            System.out.println(it.next());
        }

        //2.使用增强for语句, for-each
        for(Object ob : al ){
            System.out.println(ob);
        }

        for (Object ob: al
             ) {
            System.out.println(ob);
        }
    }




}
