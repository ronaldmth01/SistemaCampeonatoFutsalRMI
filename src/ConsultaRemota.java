import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ConsultaRemota extends Remote {
    List<Resultado> listarResultados() throws RemoteException;
    String consultarPlacar(String time1, String time2) throws RemoteException;
    void adicionarResultado(Resultado r) throws RemoteException;
    List<TimeFutsal> listarTimes() throws RemoteException;
}

