package interfaces.filters;

/**
 * @Author: YanL
 * @Time: 16:55 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public Waveform process(Waveform input){
        return input;
    }
}
