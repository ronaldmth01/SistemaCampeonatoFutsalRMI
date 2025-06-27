import java.io.Serializable;

public class Arbitro extends TimeFutsal implements Serializable {
    private String nomeArbitro;

    public Arbitro(String nomeTime, String cidade, String nomeArbitro) {
        super(nomeTime, cidade);
        this.nomeArbitro = nomeArbitro;
    }

    public String getNomeArbitro() {
        return nomeArbitro;
    }
}

