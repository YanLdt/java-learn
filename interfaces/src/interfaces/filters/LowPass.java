package interfaces.filters;

/**
 * @Author: YanL
 * @Time: 16:56 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
