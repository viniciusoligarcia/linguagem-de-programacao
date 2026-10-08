public class Escola {

    private Aluno[] alunos;
    private Professor[] professores;

    public Escola(Aluno[] alunos, Professor[] professores) {
        this.alunos = alunos;
        this.professores = professores;
    }

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Diogo", "diogo@email.com", true, 8, true);
        Aluno a2 = new Aluno("Maria", "maria@email.com", true, 2, false);

        Professor p1 = new Professor("Carlos", 3, "Bom", "Alta", true, "Atenção na chamada!");

        Aluno[] listaAlunos = {a1, a2};
        Professor[] listaProfessores = {p1};

        Escola escola = new Escola(listaAlunos, listaProfessores);

        System.out.println("=== ALUNOS ===");

        for (Aluno aluno : escola.alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            aluno.fingirEstudar();
            aluno.dormirNaAula();
        }

        System.out.println("\n=== PROFESSORES ===");

        for (Professor professor : escola.professores) {
            System.out.println("Professor: " + professor.getNome());
            professor.ensinar();
            professor.tomarCafe();
        }
    }
}