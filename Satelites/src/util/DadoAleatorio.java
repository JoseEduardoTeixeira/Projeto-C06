package util;

import java.util.Random;

public class DadoAleatorio {
    private static Random rand = new Random();

    public static double gerarTemperatura() {
        return Math.round((rand.nextDouble() * 40 - 10) * 10.0) / 10.0; // -10°C a 30°C
    }

    public static double gerarUmidade() {
        return Math.round((rand.nextDouble() * 100) * 10.0) / 10.0; // 0% a 100%
    }

    public static double gerarRadiacao() {
        return Math.round((rand.nextDouble() * 5.0) * 10) / 10.0 + 0.1; // entre 0.1 e 5.1 μSv/h
    }
}
