import java.io.Serializable;

public class TimeFutsal implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String cidade;

    public TimeFutsal(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TimeFutsal)) return false;
        TimeFutsal other = (TimeFutsal) obj;
        return nome.equalsIgnoreCase(other.nome) && cidade.equalsIgnoreCase(other.cidade);
    }

    @Override
    public int hashCode() {
        return nome.toLowerCase().hashCode() + cidade.toLowerCase().hashCode();
    }
}

