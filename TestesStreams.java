
import java.io.*;

public class TestesStreams {
    public static void main(String[] args) throws IOException {
        TimeFutsal timeA = new TimeFutsal("Equipe A", "Cidade A");
        TimeFutsal timeB = new TimeFutsal("Equipe B", "Cidade B");

        Resultado[] resultados = new Resultado[] {
            new Resultado(timeA, 3, timeB, 2),
            new Resultado(timeB, 1, timeA, 4)
        };

        ResultadoOutputStream rosConsole = new ResultadoOutputStream(resultados, System.out);
        rosConsole.enviarResultados();

        FileOutputStream fos = new FileOutputStream("resultados.txt");
        ResultadoOutputStream rosFile = new ResultadoOutputStream(resultados, fos);
        rosFile.enviarResultados();
        fos.close();

        FileInputStream fis = new FileInputStream("resultados.txt");
        ResultadoInputStream risFile = new ResultadoInputStream(fis);
        Resultado[] recebidos = risFile.receberResultados();

        for (Resultado r : recebidos) {
            System.out.println(r.getTime1().getNome() + " " + r.getGols1() + " x " +
                               r.getGols2() + " " + r.getTime2().getNome());
        }
        risFile.close();
        fis.close();
    }
}
