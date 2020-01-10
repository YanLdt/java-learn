import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanL
 * @Time: 10:59 2019/11/20
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class UseObjContainer {
    public static void main(String[] args){
        ObjectContainer objectContainer = new ObjectContainer();

        //specify the container type using angle bracket notation when instantiating
        //type check and no type conversion
        GeneticContainer<Integer> myInt = new GeneticContainer<Integer>();

        myInt.setObj(1);
        int geneticInt = myInt.getObj();


        objectContainer.setObj("test");
        System.out.println("Value of objectContainer: " + objectContainer.getObj());

        objectContainer.setObj(3);
        System.out.println(("value of my objectContainer: "  + objectContainer.getObj()));

        objectContainer.setObj(false);
        System.out.println(("value of my objectContainer: "  + objectContainer.getObj()));

        List objectList = new ArrayList();
        objectList.add(objectContainer);


        String myStr = String.valueOf(((ObjectContainer)objectList.get(0)).getObj()); //Convert type, maybe cause a exception

        System.out.println("myInt: " + geneticInt);
        System.out.println("myStr: " + myStr);
}
}
