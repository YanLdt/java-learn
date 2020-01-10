/**
 * @Author: YanL
 * @Time: 15:47 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
class Grain{
    public String toString(){
        return "Grain";
    }
}

class Wheat extends Grain{
    public String toString(){
        return "wheat";
        }
}

class Mill{
    Grain process(){
        return new Grain();
    }
}

class WheatMill extends Mill{
    Wheat process(){
        return new Wheat();
    }
}

public class CovarianReturn {
    public static void main(String[] args){
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(m);
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(m);
        System.out.println(g);
    }
}
