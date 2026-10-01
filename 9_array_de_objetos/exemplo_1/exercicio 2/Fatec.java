
public class Fatec {

    public static void main(String[] args) {

        Aluno[] alunos = {
            new Aluno("João", "joao@email.com"),
            new Aluno("Kaio", "kaio@email.com"),
            new Aluno("Lyncon", "lyncon@email.com"),
            new Aluno("Samuel", "Samuel@email.com")
        };

        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.nome);
            System.out.println("Email: " + aluno.email);
            System.out.println();
        }
    }
}