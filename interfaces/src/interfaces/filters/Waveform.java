package interfaces.filters;

/**
 * @Author: YanL
 * @Time: 16:54 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform " + id;
    }
}

