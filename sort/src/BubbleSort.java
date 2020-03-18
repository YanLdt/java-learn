
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;


/**
 * @Author: YanL
 * @Time: 16:19 2020/3/18
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class BubbleSort {
    /**
     * 冒泡排序
     *
     * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
     *
     * @param array 数组
     * @return 返回排序后数组
     */
    public static int[] bubbleSort(int[] array){
        if(array.length == 0){
            return array;
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j + 1] < array[j]){
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {13, 2, 3, 45, 6, 67, 7};
        Instant start = Instant.now();
        int[] res = bubbleSort(array);
        Instant end = Instant.now();
        System.out.println(Arrays.toString(res));
        Duration time = Duration.between(start, end);
        System.out.println(time.toMillis());
    }
}
