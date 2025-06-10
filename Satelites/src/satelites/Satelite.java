package satelites;

public abstract class Satelite {
    protected String nome;

    public Satelite(String nome) {
        this.nome = nome;
    }

    public abstract String enviarDados();
}
