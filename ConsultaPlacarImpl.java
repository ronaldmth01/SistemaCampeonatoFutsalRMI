public class ConsultaPlacarImpl implements ConsultaPlacar {
    public void exibirPlacar(Resultado resultado) {
        System.out.println(
            resultado.getTime1().getNome() + " " + resultado.getGols1() +
            " x " + resultado.getGols2() + " " + resultado.getTime2().getNome()
        );
    }
}