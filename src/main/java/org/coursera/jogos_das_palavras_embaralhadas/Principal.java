package org.coursera.jogos_das_palavras_embaralhadas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanicaDoJogo();

        System.out.println("Bem-vindo ao jogo de adivinhar palavras!");
        
        while (!mecanica.jogoAcabou()) {
            System.out.println("Palavra embaralhada: " + mecanica.getPalavraEmbaralhada());
            System.out.print("Sua tentativa: ");
            String tentativa = in.nextLine();
            
            if (mecanica.tentarAdivinhar(tentativa)) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Tente novamente!");
            }
        }

        System.out.println("O jogo acabou! Sua pontuação final foi: " + mecanica.getPontuacao());
        in.close();
    }
}

