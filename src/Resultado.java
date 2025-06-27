import java.io.Serializable;

public class Resultado implements Serializable {
    private static final long serialVersionUID = 1L;

    private TimeFutsal time1;
    private int gols1;
    private TimeFutsal time2;
    private int gols2;

    public Resultado(TimeFutsal time1, int gols1, TimeFutsal time2, int gols2) {
        this.time1 = time1;
        this.gols1 = gols1;
        this.time2 = time2;
        this.gols2 = gols2;
    }

    public TimeFutsal getTime1() {
        return time1;
    }

    public int getGols1() {
        return gols1;
    }

    public TimeFutsal getTime2() {
        return time2;
    }

    public int getGols2() {
        return gols2;
    }
}

