

import java.net.*;

public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        OutputStream os = socket.getOutputStream();

        TimeFutsal timeA = new TimeFutsal("Equipe A", "Cidade A");
        TimeFutsal timeB = new TimeFutsal("Equipe B", "Cidade B");
        Resultado[] resultados = new Resultado[] {
            new Resultado(timeA, 3, timeB, 2),
            new Resultado(timeB, 1, timeA, 4)
        };

        ResultadoOutputStream ros = new ResultadoOutputStream(resultados, os);
        ros.enviarResultados();

        socket.close();
    }
}

