/**
 * @Author: YanL
 * @Time: 20:18 2019/11/25
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class LyList {

        private Object[] elements=new Object[10];
        private int size;

        public void add(Object item) {
            elements[size++] = item;
        }

        public Object get(int index) {
            return elements[index];
        }


}
