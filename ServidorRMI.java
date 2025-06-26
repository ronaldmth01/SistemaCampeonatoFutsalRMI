import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // Inicia o RMI Registry na porta 1099 (padrão)
            //LocateRegistry.createRegistry(1099);

            // Cria a implementação do serviço
            ConsultaRemotaImpl obj = new ConsultaRemotaImpl();

            // Registra o serviço no RMI Registry
            Naming.rebind("FutsalService", obj);

            System.out.println("Servidor RMI pronto. Serviço registrado como 'FutsalService'.");
        } catch (Exception e) {
            System.err.println("Erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

