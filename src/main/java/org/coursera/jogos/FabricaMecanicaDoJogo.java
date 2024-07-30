package org.coursera.jogos;

public class FabricaMecanicaDoJogo {
    public static MecanicaDoJogo getMecanicaDoJogo() {
        return new MecanicaSimples(); // ou uma nova implementação
    }
}

