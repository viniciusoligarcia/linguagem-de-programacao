public class Professor {

    private String nome;
    private int quantidadeCafe;
    private String humor;
    private String nivelDePaciencia;
    private boolean usaDatashow;
    private String fraseFavorita;

    public Professor(String nome, int quantidadeCafe, String humor, String nivelDePaciencia, boolean usaDatashow, String fraseFavorita) {
        this.nome = nome;
        this.quantidadeCafe = quantidadeCafe;
        this.humor = humor;
        this.nivelDePaciencia = nivelDePaciencia;
        this.usaDatashow = usaDatashow;
        this.fraseFavorita = fraseFavorita;
    }

    public void ensinar() {
        System.out.println("Professor " + this.nome + " finge ensinar.");
    }

    public void tomarCafe() {
        this.quantidadeCafe++;
        System.out.println("Professor " + this.nome + " tomou cafe. Total: " + this.quantidadeCafe);
    }

    public String getNome() {
        return nome;
    }
}