package aplicacao;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {


    @Override
    public void ligar() {
        System.out.println("Ligando para um numero telefônico");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação ");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma página de Internet ");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba ");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando uma página de Intenet ");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma música! ");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando uma música! ");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando uma música!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Iphone iphone = new Iphone();

        //Usando Reprodutor musical

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println();

        //Usando a funcao ligar, atender e pausar

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();

        //Usando app para navegar na internet

        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}


