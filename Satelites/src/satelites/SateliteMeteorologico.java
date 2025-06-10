package satelites;

import util.DadoAleatorio;

public class SateliteMeteorologico extends Satelite {

    public SateliteMeteorologico(String nome) {
        super(nome);
    }

    @Override
    public String enviarDados() {
        double temperatura = DadoAleatorio.gerarTemperatura();
        double umidade = DadoAleatorio.gerarUmidade();
        return nome + ": Temperatura: " + temperatura + "°C | Umidade: " + umidade + "%";
    }
}
