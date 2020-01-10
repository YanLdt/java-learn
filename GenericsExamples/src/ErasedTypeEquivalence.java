import java.util.*;

/**
 * @Author: YanL
 * @Time: 21:07 2019/11/25
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ErasedTypeEquivalence {
    public static void main(String[] args){
//        Class<?> class1 = new ArrayList<String>().getClass();
//        Class<?> class2 = new ArrayList<Integer>().getClass();
//
//        System.out.println(class1);		//class java.util.ArrayList
//        System.out.println(class2);		//class java.util.ArrayList
//        System.out.println(class1.equals(class2));	//true

        /**
         * class java.util.ArrayList
         * class java.util.ArrayList
         * true
         */

//        class Table {}
//        class Room {}
//        class House<Q> {}
//        class Particle<POSITION, MOMENTUM> {}
//
//        List<Table> tableList = new ArrayList<>();
//        Map<Room, Table> map = new HashMap<>();
//        House<Room> house = new House<>();
//        Particle<Long, Double> particle = new Particle<>();
//
//        System.out.println(Arrays.toString(tableList.getClass().getTypeParameters()));
//        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
//        System.out.println(Arrays.toString(house.getClass().getTypeParameters()));
//        System.out.println(Arrays.toString(particle.getClass().getTypeParameters()));

        /**
         * lost information
         * [E]
         * [K, V]
         * [Q]
         * [POSITION, MOMENTUM]
         *
         * can not get any information of type parameters
         */



    }
}
