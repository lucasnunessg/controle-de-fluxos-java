public class Arrays {
    public static void main(String[] args) {
        String[] alunos = {"MARCOS", "LUCAS", "JOSÉ", "JULIA", "PATRICIA"};
        String log;

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        int totalAlunos = alunos.length;
        log = "A lista de chamada possui " + totalAlunos + "alunos\n";

        int matricula;
                for (int posicao = 0; posicao < totalAlunos; posicao++) {
                    matricula = posicao + 1;
                    log = "A matrícula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
                    System.out.println(log);
                }
    }
}
