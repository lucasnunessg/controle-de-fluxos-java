public class While {
    public static void main(String[] args) {
        String[] candidatos = {"Lucas", "Julia", "Eloisa", "Fernando", "Cristian", "Carol"};
        final int nVagas = 6;
        String[] vagas = new String[nVagas];

        int vagaAtual = 0;

        String inscrito = "INDEFINIDO";
        String log;

        while (vagaAtual < nVagas) {

            inscrito = candidatos[vagaAtual];
            log= "Vaga preenchida: " + inscrito + " Na vaga: " + (vagaAtual +1) + "\n";
            vagas[vagaAtual] = inscrito;
            vagaAtual++;
            System.out.println(log);

        }
    }


}
