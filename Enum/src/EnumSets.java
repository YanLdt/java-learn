import java.util.EnumSet;

/**
 * @Author: YanL
 * @Time: 16:21 2019/12/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */

public class EnumSets {
    public static void main(String[] args){
        //empty set
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);

        points.add(AlarmPoints.BATHROOM);
        System.out.println(points);
        points.addAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
        System.out.println(points);
        points = EnumSet.allOf(AlarmPoints.class);
        System.out.println(points);
        points.removeAll(EnumSet.allOf(AlarmPoints.class));
        System.out.println(points);

        points.addAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
        System.out.println(points);
        //存在枚举中但是不包含在指定enumSet中的值
        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}
