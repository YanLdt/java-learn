import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanL
 * @Time: 20:25 2019/11/20
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class GeneticBetter {
    public static void main(String[] args){
        List myObjList = new ArrayList();

        //Store instances of ObjectContainer
        for(int i = 0; i <= 5; i++){
            ObjectContainer myObj = new ObjectContainer();
            myObj.setObj("Test " + i);
            myObjList.add(myObj);
        }
        //get the objects we need to cast
        for(int i = 0; i <= myObjList.size() - 1; i++){
            ObjectContainer obj = (ObjectContainer)myObjList.get(i);
            System.out.println("Value: " + obj.getObj());
        }


        List<GeneticContainer> geneticContainerList = new ArrayList<GeneticContainer>();
        for(int i = 0; i <= 5; i++){
            GeneticContainer geneticContainer = new GeneticContainer<String>();
            geneticContainer.setObj("Generic test:" + i);
            geneticContainerList.add(geneticContainer);
        }
        for(GeneticContainer<String> obj:geneticContainerList){
            String objString = obj.getObj();
            System.out.println(objString);
        }


    }


}
