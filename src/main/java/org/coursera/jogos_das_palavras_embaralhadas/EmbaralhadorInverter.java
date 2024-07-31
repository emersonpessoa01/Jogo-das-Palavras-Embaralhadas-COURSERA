package org.coursera.jogos_das_palavras_embaralhadas;

public class EmbaralhadorInverter implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }
}


