import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 21:27 2020/3/18
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {13, 2, 3, 45, 6, 67, 7};
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * 希尔排序---------------
     * 把未排序序列按照希尔增量分组，对每组进行插入排序，直到增量为1
     * {n/2,(n/2)/2...1}，称为增量序列。
     *
     *
     * 最佳情况：T(n) = O(nlog2 n)  最坏情况：T(n) = O(nlog2 n)  平均情况：T(n) =O(nlog2n)　
     * @param arr 待排序数组
     * @return  已排序数组
     */
    public static int[] shellSort(int[] arr){
        if(arr.length == 0){
            return arr;
        }
        int cur, gap = arr.length / 2;
        while(gap > 0) {
            for (int i = gap; i < arr.length; i++) {
                cur = arr[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && arr[preIndex] > cur) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex-=gap;
                }
                arr[preIndex + gap] = cur;
            }
            gap /= 2;
        }

        return arr;
    }

}
