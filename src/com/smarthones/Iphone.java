package com.smarthones;

public class Iphone implements reprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    static void main() {
        Iphone celular = new Iphone();

        celular.selecionarMusica("Estilo cachorro");
        celular.tocar();
        celular.pausar();

        celular.ligar("71988771199");
        celular.atender();
        celular.iniciarCorreioVoz();

        celular.exibirPagina("google");
        celular.adicionarNovaAba();
        celular.atualizarPagina();
    }

    public void tocar() {
        System.out.println("Tocando a música selecionada");
    }
    public void pausar() {
        System.out.println("Música pausada");
    }
    public void selecionarMusica(String musica) {
        System.out.printf(String.format("Música selecionada: %s\n", musica));
    }

    public void ligar(String numero) {
        System.out.printf(String.format("Ligando para: %s\n",numero));
    }
    public void atender() {
        System.out.println("Atendendo...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Inciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.printf(String.format("exibindo: www.%s.com\n", url));
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    public void atualizarPagina() {
        System.out.println("Aba atualizada");
    }


}
