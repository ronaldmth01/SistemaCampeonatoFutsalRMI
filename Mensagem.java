import java.io.Serializable;

public class Mensagem implements Serializable {
    private Resultado resultado;
    private String status;

    public Mensagem(Resultado resultado, String status) {
        this.resultado = resultado;
        this.status = status;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public String getStatus() {
        return status;
    }
}

