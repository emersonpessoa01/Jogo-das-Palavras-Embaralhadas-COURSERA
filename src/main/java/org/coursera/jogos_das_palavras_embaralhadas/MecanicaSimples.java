package org.coursera.jogos_das_palavras_embaralhadas;

public class MecanicaSimples implements MecanicaDoJogo {
    private BancoDePalavras bancoDePalavras = new BancoDePalavras();
    private Embaralhador embaralhador = FabricaEmbaralhadores.getEmbaralhador();
    private String palavraAtual;
    private String palavraEmbaralhada;
    private int pontuacao;
    private int tentativas;

    public MecanicaSimples() {
        iniciarNovaRodada();
    }

    private void iniciarNovaRodada() {
        palavraAtual = bancoDePalavras.getPalavraAleatoria();
        palavraEmbaralhada = embaralhador.embaralhar(palavraAtual);
        tentativas = 3; // Por exemplo, 3 tentativas por palavra
    }

    @Override
    public boolean tentarAdivinhar(String tentativa) {
        if (tentativa.equalsIgnoreCase(palavraAtual)) {
            pontuacao++;
            iniciarNovaRodada();
            return true;
        } else {
            tentativas--;
            if (tentativas <= 0) {
                iniciarNovaRodada();
            }
            return false;
        }
    }

    @Override
    public String getPalavraEmbaralhada() {
        return palavraEmbaralhada;
    }

    @Override
    public boolean jogoAcabou() {
        // Por exemplo, o jogo acaba após 5 palavras adivinhadas
        return pontuacao >= 5;
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }
}
