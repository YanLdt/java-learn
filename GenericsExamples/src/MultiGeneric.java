/**
 * @Author: YanL
 * @Time: 22:15 2019/11/20
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class MultiGeneric {
    public static void main(String[] args){
        MultiGenericContainer<String, String> multiGenericContainer = new MultiGenericContainer<String, String>("ly","zy");
        MultiGenericContainer<Integer, Double> multiGenericContainer1 = new MultiGenericContainer<Integer, Double>(22, 22.0);

        String myStr = multiGenericContainer.getFirstPosition();
        double myDouble = multiGenericContainer1.getSecondPosition();
        System.out.println(myStr + myDouble);
    }
}
