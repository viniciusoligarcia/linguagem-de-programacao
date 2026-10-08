public class Aluno {

    private String nome;
    private String email;
    private boolean inteligente;
    private int nivel_sono;
    private boolean piscando_lento;

    public Aluno(String nome, String email, boolean inteligente, int nivel_sono, boolean piscando_lento) {
        this.nome = nome;
        this.email = email;
        this.inteligente = inteligente;
        this.nivel_sono = nivel_sono;
        this.piscando_lento = piscando_lento;
    }

    public void dormirNaAula() {
        System.out.println(this.nome + " dormiu na aula.");
    }

    public void fingirEstudar() {
        System.out.println(this.nome + " esta fingindo estudar...");
    }

    public String getNome() {
        return nome;
    }
}