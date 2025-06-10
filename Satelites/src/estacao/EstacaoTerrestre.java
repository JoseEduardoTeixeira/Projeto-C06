package estacao;

import satelites.Satelite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EstacaoTerrestre {
    private Satelite[] satelites;
    private int numSatelites = 0;
    private Path arquivo = Paths.get("Dados.txt");
    private String dadosLidos;

    public EstacaoTerrestre(int capacidade) {
        satelites = new Satelite[capacidade];
    }

    public void adicionarSatelite(Satelite satelite) {
        if (numSatelites < satelites.length) {
            satelites[numSatelites++] = satelite;
            System.out.println("Satélite adicionado.");
            
        } else {
            System.out.println("Limite de satélites atingido.");
        }
    }

    public void coletarDados() {
        try {
            String data = Files.readString(arquivo);
            dadosLidos = data + "\n";

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < numSatelites; i++) {
            dadosLidos += satelites[i].enviarDados() + "\n";
        }

        System.out.println(dadosLidos);

        try {
            Files.writeString(arquivo, dadosLidos);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
