import java.io.Serializable;

public class Atleta extends TimeFutsal implements Serializable {
    private String nomeAtleta;
    private int numero;

    public Atleta(String nomeTime, String cidade, String nomeAtleta, int numero) {
        super(nomeTime, cidade);
        this.nomeAtleta = nomeAtleta;
        this.numero = numero;
    }

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public int getNumero() {
        return numero;
    }
}

