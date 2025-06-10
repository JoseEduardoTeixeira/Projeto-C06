import estacao.EstacaoTerrestre;
import satelites.SateliteRadiacao;
import satelites.SateliteMeteorologico;
import satelites.SateliteFotografia;

public class Main {
    public static void main(String[] args) {
        EstacaoTerrestre estacao = new EstacaoTerrestre(5);

        estacao.adicionarSatelite(new SateliteMeteorologico("MetSat-1"));
        estacao.adicionarSatelite(new SateliteRadiacao("RadSat-A"));
        estacao.adicionarSatelite(new SateliteFotografia("FotoSat-1"));
        estacao.adicionarSatelite(new SateliteFotografia("FotoSat-2"));

        estacao.coletarDados(); // Mostra no console e escreve em arquivo
    }
}
