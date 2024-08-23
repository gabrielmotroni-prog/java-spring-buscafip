package br.com.gabrielmotroni.buscafipe.model;

public enum TipoVeiculo {
    CARROS("carros"),
    MOTOS("motos"),
    CAMINHOES("caminhoes");

    private final String valor; // Variável de instância para armazenar o valor associado

    TipoVeiculo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}