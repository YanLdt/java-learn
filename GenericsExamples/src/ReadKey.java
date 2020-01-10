import java.io.IOException;
import java.util.*;

/**
 * @Author: YanL
 * @Time: 11:15 2019/11/25
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ReadKey {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //int i = (Integer) System.in.read();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] num = str.split(" ");
        int[] nums = new int[num.length];

        for(int i = 0; i < num.length; i++){
            nums[i] = Integer.parseInt(num[i]);
        }

        for(int n : nums){
            System.out.println(n);
            arrayList.add(n);
        }

        Collections.reverse(arrayList);

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });





        System.out.println(arrayList.toString());
    }
}
