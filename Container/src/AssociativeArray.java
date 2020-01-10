/**
 * @Author: YanL
 * @Time: 15:38 2019/12/2
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;
    public AssociativeArray(int length){
        pairs = new Object[length][2];
    }
    public void put(K key, V value){
        if(index >= pairs.length)
            throw new ArrayIndexOutOfBoundsException();
        pairs[index++] = new Object[] {key, value};
    }

    public V get(K key){
        for(int i = 0; i < pairs.length; i++){
            if(key.equals(pairs[i][0]))
                return (V)pairs[i][1];
        }
        return null;
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < pairs.length; i++){
            result.append(pairs[i][0].toString());
            result.append(": ");
            result.append(pairs[i][1].toString());
            result.append("\n");
        }
        return result.toString();
    }
    public static void main(String[] args){
        AssociativeArray<String, Integer> map = new AssociativeArray<>(4);

        map.put("sky", 1);
        map.put("grass", 2);
        map.put("ocean", 3);
        map.put("tree", 4);
        try {
            map.put("wr", 5);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Too many objects");
        }
        System.out.print(map);
        System.out.print(map.get("tree"));
    }
}
