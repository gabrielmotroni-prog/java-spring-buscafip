package br.com.gabrielmotroni.buscafipe.Principal;

import br.com.gabrielmotroni.buscafipe.model.TipoVeiculo;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    TipoVeiculo tipoVeiculoSelecionado;

    public void exibiMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** OPÇÕES *** \n\n Carro \n Moto \n Caminhão");
        String carroDigitadoPeloUsuario = scanner.next().toLowerCase();

        switch (carroDigitadoPeloUsuario) {
            case "carro" -> {
                tipoVeiculoSelecionado = TipoVeiculo.CARROS;
            }
            case "moto" -> {
                tipoVeiculoSelecionado = TipoVeiculo.MOTOS;
            }
            case "caminhão" -> {
                tipoVeiculoSelecionado = TipoVeiculo.CAMINHOES;
            }
            default -> {
                System.out.println("Tipo de Veiculo não reconhecido");
                scanner.close();
            }
        }


        System.out.println(tipoVeiculoSelecionado.getValor());


    }
}
