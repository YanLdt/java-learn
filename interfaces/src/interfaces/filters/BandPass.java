package interfaces.filters;

/**
 * @Author: YanL
 * @Time: 17:00 2019/10/16
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;
    public BandPass(double lowCutoff, double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
