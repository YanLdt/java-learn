import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author: YanL
 * @Time: 15:28 2019/12/3
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class SerTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        Student s1 = new Student("老王", 1);
        Student s2 = new Student("小张", 2);
        Student s3 = new Student("老李", 3);
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        try {
            //serialize(arrayList);

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("list.txt"));
            ArrayList<Student> arrayList1 = (ArrayList<Student>) in.readObject();
            for (Student s : arrayList1) {
                System.out.println(s.getName() + "--" + s.getIndex());
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    static void serialize(ArrayList<Student> arrayList) throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.txt"));
        out.writeObject(arrayList);
        out.close();
    }


}



class Student implements Serializable {
    private String name;
    private int index;
    Student(String s, Integer i){
        this.name = s;
        this.index = i;
    }
    @Override
    public String toString(){
        return name + " " + index;
    }

    String getName() {
        return name;
    }
    Integer getIndex(){
        return index;
    }
}