package interfaces.filters;

/**
 * @Author: YanL
 * @Time: 16:58 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
