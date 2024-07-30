package org.coursera.jogos;

public interface MecanicaDoJogo {
    boolean tentarAdivinhar(String tentativa);
    String getPalavraEmbaralhada();
    boolean jogoAcabou();
    int getPontuacao();
}

