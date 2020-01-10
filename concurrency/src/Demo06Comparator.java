import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: YanL
 * @Time: 22:07 2019/12/9
 * @Email: imyanl.dt@gmail.com
 * @Description: 使用数组存储多个person对象，对数组种的person对象使用arrays的sort方法通过年龄进行升序排序
 */
public class Demo06Comparator {
    public static void main(String[] args) {
        Person[] array = {
                new Person("迪丽热巴",19),
                new Person("古力娜扎",18),
                new Person("马儿扎哈",23)
        };
        Arrays.sort(array, (Person a, Person b) -> {
            return a.getAge() - b.getAge();
        });

//        Arrays.sort(array, Comparator.comparingInt(Person::getAge));
        for(Person p : array){
            System.out.println(p);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String n, int a){
        this.age = a;
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}