import java.rmi.Naming;
import java.util.List;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            ConsultaRemota servico = (ConsultaRemota) Naming.lookup("rmi://localhost/FutsalService");

            Scanner scanner = new Scanner(System.in);
            int opcao;

            do {
                System.out.println("\n--- Menu Cliente RMI ---");
                System.out.println("1. Listar Resultados");
                System.out.println("2. Consultar Placar");
                System.out.println("3. Adicionar Resultado");
                System.out.println("4. Listar Times");
                System.out.println("0. Sair");
                System.out.print("Escolha: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar buffer

                switch (opcao) {
                    case 1:
                        List<Resultado> resultados = servico.listarResultados();
                        for (Resultado r : resultados) {
                            System.out.println(r.getTime1().getNome() + " " + r.getGols1() +
                                               " x " + r.getGols2() + " " + r.getTime2().getNome());
                        }
                        break;

                    case 2:
                        System.out.print("Time 1: ");
                        String time1 = scanner.nextLine();
                        System.out.print("Time 2: ");
                        String time2 = scanner.nextLine();
                        String placar = servico.consultarPlacar(time1, time2);
                        System.out.println("Resultado: " + placar);
                        break;

                    case 3:
                        System.out.print("Nome do Time 1: ");
                        String t1 = scanner.nextLine();
                        System.out.print("Cidade do Time 1: ");
                        String c1 = scanner.nextLine();
                        System.out.print("Gols do Time 1: ");
                        int g1 = scanner.nextInt(); scanner.nextLine();

                        System.out.print("Nome do Time 2: ");
                        String t2 = scanner.nextLine();
                        System.out.print("Cidade do Time 2: ");
                        String c2 = scanner.nextLine();
                        System.out.print("Gols do Time 2: ");
                        int g2 = scanner.nextInt(); scanner.nextLine();

                        Resultado novo = new Resultado(new TimeFutsal(t1, c1), g1, new TimeFutsal(t2, c2), g2);
                        servico.adicionarResultado(novo);
                        System.out.println("Resultado adicionado com sucesso!");
                        break;

                    case 4:
                        List<TimeFutsal> times = servico.listarTimes();
                        System.out.println("Times registrados:");
                        for (TimeFutsal t : times) {
                            System.out.println("- " + t.getNome() + " (" + t.getCidade() + ")");
                        }
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } while (opcao != 0);

            scanner.close();

        } catch (Exception e) {
            System.err.println("Erro no cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

