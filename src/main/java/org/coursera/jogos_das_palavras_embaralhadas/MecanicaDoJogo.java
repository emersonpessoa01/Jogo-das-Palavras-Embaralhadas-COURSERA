package org.coursera.jogos_das_palavras_embaralhadas;

public interface MecanicaDoJogo {
    boolean tentarAdivinhar(String tentativa);
    String getPalavraEmbaralhada();
    boolean jogoAcabou();
    int getPontuacao();
}

