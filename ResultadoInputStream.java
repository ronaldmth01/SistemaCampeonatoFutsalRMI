
import java.io.*;
import java.util.ArrayList;

public class ResultadoInputStream {
    private BufferedReader br;

    public ResultadoInputStream(InputStream is) {
        this.br = new BufferedReader(new InputStreamReader(is));
    }

    public Resultado[] receberResultados() throws IOException {
        ArrayList<Resultado> lista = new ArrayList<>();
        String linha;

        while ((linha = br.readLine()) != null && !linha.isEmpty()) {
            String[] partes = linha.split(",");
            if (partes.length == 4) {
                TimeFutsal time1 = new TimeFutsal(partes[0], "");
                int gols1 = Integer.parseInt(partes[1]);
                TimeFutsal time2 = new TimeFutsal(partes[2], "");
                int gols2 = Integer.parseInt(partes[3]);

                Resultado r = new Resultado(time1, gols1, time2, gols2);
                lista.add(r);
            }
        }
        return lista.toArray(new Resultado[0]);
    }

    public void close() throws IOException {
        br.close();
    }
}

