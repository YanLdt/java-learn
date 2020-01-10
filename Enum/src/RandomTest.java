/**
 * @Author: YanL
 * @Time: 11:13 2019/12/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class RandomTest {
    public static void main(String[] args){
        for(int i = 0; i < 20; i++){
            System.out.print(Enums.random(Activity.class) + " ");
        }
    }
}

enum Activity {
    //some activity
    SITTING, LYING, STANDING, HOPPING, RUNNING, DOGGING, JUMPING, FALLING, FLYING
}
