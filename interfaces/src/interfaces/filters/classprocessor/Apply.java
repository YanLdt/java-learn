package interfaces.filters.classprocessor;

/**
 * @Author: YanL
 * @Time: 16:38 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */

import java.util.*;

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}
class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}

public class Apply {
    public static void process(Processor p, Object s){
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args){
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new splitter(), s);
    }
}
