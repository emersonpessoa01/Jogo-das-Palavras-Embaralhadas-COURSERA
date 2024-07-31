package org.coursera.jogos_das_palavras_embaralhadas;

public class FabricaMecanicaDoJogo {
    public static MecanicaDoJogo getMecanicaDoJogo() {
        return new MecanicaSimples(); // ou uma nova implementação
    }
}

