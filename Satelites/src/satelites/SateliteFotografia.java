package satelites;

public class SateliteFotografia extends Satelite {

    public SateliteFotografia(String nome) {
        super(nome);
    }

    @Override
    public String enviarDados() {
        return nome + ": Foto enviada com sucesso";
    }
}
