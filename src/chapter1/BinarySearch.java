package chapter1;

/**
 * Created by yqq on 2017/9/1.
 */
public class BinarySearch {

    /**
     *
     * @param key  要查找的值
     * @param a 有序数组
     * @return 下标
     */
    public static int Rank(int key, int[] a)
    {
        int low = 0;
        int high = a.length - 1;
        while(low < high)
        {
            int mid = low + (high - low) / 2;
            if(key < a[mid]) //小于中间那个值
                high = mid - 1;
            else if (key > a[mid]) //大于中间那个值
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }


    public static void main(String args[])
    {

    }

}
