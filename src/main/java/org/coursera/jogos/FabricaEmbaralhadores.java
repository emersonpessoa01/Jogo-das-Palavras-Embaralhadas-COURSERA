package org.coursera.jogos;

import java.util.Random;

public class FabricaEmbaralhadores {
    private static final Embaralhador[] embaralhadores = {
        new EmbaralhadorInverter(),
        new EmbaralhadorAleatorio()
    };

    public static Embaralhador getEmbaralhador() {
        Random random = new Random();
        return embaralhadores[random.nextInt(embaralhadores.length)];
    }
}

