package org.coursera.jogos_das_palavras_embaralhadas;

import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class BancoDePalavras {
    private List<String> palavras = Arrays.asList(
        "java", "programacao", "computador", "teclado", "mouse",
        "monitor", "internet", "codigo", "software", "hardware",
        "desenvolvimento", "sistema", "compilador", "memoria", "processador",
        "algoritmo", "variavel", "constante", "objeto", "classe"
    );

    public String getPalavraAleatoria() {
        Random random = new Random();
        return palavras.get(random.nextInt(palavras.size()));
    }
}

