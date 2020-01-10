package interfaces.filters.interfaceprocessor;
import interfaces.filters.*;

/**
 * @Author: YanL
 * @Time: 17:18 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class FilterProcessor {
    public static void main(String[] args){
        Waveform w = new Waveform();
        Apply.process(new FilterAdapter(new LowPass(1.0)), w);
        Apply.process(new FilterAdapter(new HighPass(2.0)), w);
        Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
    }
}

class FilterAdapter implements Processor{
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter = filter;
    }
    public String name(){
        return filter.name();
    }
    public Waveform process(Object input){
        return filter.process((Waveform)input);
    }
}