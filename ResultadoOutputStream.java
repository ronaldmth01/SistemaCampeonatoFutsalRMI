
import java.io.*;

public class ResultadoOutputStream {
    private Resultado[] resultados;
    private OutputStream os;

    public ResultadoOutputStream(Resultado[] resultados, OutputStream os) {
        this.resultados = resultados;
        this.os = os;
    }

    public void enviarResultados() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        for (Resultado r : resultados) {
            bw.write(r.getTime1().getNome() + "," + r.getGols1() + "," +
                     r.getTime2().getNome() + "," + r.getGols2());
            bw.newLine();
        }
        bw.flush();
    }
}

