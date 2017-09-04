package chapter1;

/**
 * Created by yqq on 2017/9/4.
 */
public class Practice1 {


    public static int Mystery(int a, int b){

        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return  Mystery(a + a , b / 2);
        return Mystery(a + a, b / 2) + a;
    }

    public static void main(String[] args) {

        System.out.println(Mystery(5, 5));
    }
}
