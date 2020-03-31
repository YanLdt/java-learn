import java.util.Arrays;

/**
 * @Author: YanL
 * @Time: 16:16 2020/3/18
 * @Email: imyanl.dt@gmail.com
 * @Description: 快排不稳定---数据量大使用，序列基本有序不适用
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {1,4,3,2,6,9,8,7,5};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }


    public static void quickSort(int[] nums, int start, int end){
        int left = start, right = end;
        if(left >= right) {
            return;
        }
        //以left为中间值
        //小于temp的放在左边，大于temp的放在右边
        int temp = nums[left];
        while(left < right){
            while(left < right && nums[right] >= temp){
                right--;
            }
            nums[left] = nums[right];
            while(left < right && nums[left] <= temp){
                left++;
            }
            nums[right] = nums[left];
        }
        //
        nums[left] = temp;



        quickSort(nums, start, left);
        quickSort(nums, left + 1, end);

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
