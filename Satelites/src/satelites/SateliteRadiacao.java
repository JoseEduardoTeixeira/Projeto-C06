package satelites;

import util.DadoAleatorio;

public class SateliteRadiacao extends Satelite {

    public SateliteRadiacao(String nome) {
        super(nome);
    }

    @Override
    public String enviarDados() {
        double radiacao = DadoAleatorio.gerarRadiacao();
        return nome + ": Nível de radiação: " + radiacao + " μSv/h";
    }
}
