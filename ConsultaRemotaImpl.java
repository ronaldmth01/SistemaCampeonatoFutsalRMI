import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ConsultaRemotaImpl extends UnicastRemoteObject implements ConsultaRemota {

    private List<Resultado> resultados;
    private List<TimeFutsal> times;

    public ConsultaRemotaImpl() throws RemoteException {
        super();
        resultados = new ArrayList<>();
        times = new ArrayList<>();

        // Dados iniciais (exemplo)
        TimeFutsal t1 = new TimeFutsal("Equipe A", "Cidade A");
        TimeFutsal t2 = new TimeFutsal("Equipe B", "Cidade B");

        times.add(t1);
        times.add(t2);

        resultados.add(new Resultado(t1, 3, t2, 2));
        resultados.add(new Resultado(t2, 1, t1, 4));
    }

    @Override
    public List<Resultado> listarResultados() throws RemoteException {
        return resultados;
    }

    @Override
    public String consultarPlacar(String time1, String time2) throws RemoteException {
        for (Resultado r : resultados) {
            if (r.getTime1().getNome().equalsIgnoreCase(time1) &&
                r.getTime2().getNome().equalsIgnoreCase(time2)) {
                return time1 + " " + r.getGols1() + " x " + r.getGols2() + " " + time2;
            }
        }
        return "Partida não encontrada.";
    }

    @Override
    public void adicionarResultado(Resultado r) throws RemoteException {
        resultados.add(r);
        if (!times.contains(r.getTime1())) {
            times.add(r.getTime1());
        }
        if (!times.contains(r.getTime2())) {
            times.add(r.getTime2());
        }
    }

    @Override
    public List<TimeFutsal> listarTimes() throws RemoteException {
        return times;
    }
}

