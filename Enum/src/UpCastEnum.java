import java.util.Arrays;
import java.util.Random;

/**
 * @Author: YanL
 * @Time: 23:39 2019/12/3
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class UpCastEnum {
    public static void main(String[] args){
        Random random = new Random(47);
        System.out.println(random.nextInt(12));
        Search[] vals = Search.values();
        //UpCast
        Enum e = Search.HITHER;
        System.out.println(e);
        for(Enum en : e.getClass().getEnumConstants()){
            System.out.println(en);
        }
        System.out.println(Arrays.toString(vals));
    }
}

enum Search {
    //
    HITHER, YON
}