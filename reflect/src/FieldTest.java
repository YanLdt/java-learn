import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @Author: YanL
 * @Time: 14:31 2019/12/11
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class FieldTest {
    public static void main(String[] args) {
        Class mClass = SonClass.class;
        System.out.println("类的名称：" + mClass.getName());

        //2.1 获取所有 public 访问权限的变量
        // 包括本类声明的和从父类继承的
        //Field[] fields = mClass.getFields();

        //2.2 获取所有本类声明的变量（不问访问权限）
        Field[] fields = mClass.getDeclaredFields();

        //3. 遍历变量并输出变量信息
        for (Field field :
                fields) {
            //获取访问权限并输出
            int modifiers = field.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            //输出变量的类型及变量名
            System.out.println(field.getType().getName()
                    + " " + field.getName());

        }
    }


        class FatherClass {
            public String mFatherName;
            public int mFatherAge;

            public void printFatherMsg() {
            }
        }

        class SonClass extends FatherClass {

            private String mSonName;
            protected int mSonAge;
            public String mSonBirthday;

            public void printSonMsg() {
                System.out.println("Son Msg - name : "
                        + mSonName + "; age : " + mSonAge);
            }

            private void setSonName(String name) {
                mSonName = name;
            }

            private void setSonAge(int age) {
                mSonAge = age;
            }

            private int getSonAge() {
                return mSonAge;
            }

            private String getSonName() {
                return mSonName;
            }
        }
    }