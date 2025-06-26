

import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Servidor aguardando conexão...");

        Socket cliente = servidor.accept();
        System.out.println("Cliente conectado.");

        InputStream is = cliente.getInputStream();
        ResultadoInputStream ris = new ResultadoInputStream(is);
        Resultado[] resultados = ris.receberResultados();

        for (Resultado r : resultados) {
            System.out.println(r.getTime1().getNome() + " " + r.getGols1() + " x " +
                               r.getGols2() + " " + r.getTime2().getNome());
        }

        ris.close();
        cliente.close();
        servidor.close();
    }
}

