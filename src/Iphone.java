import Interface.AparelhoTelefonico;
import Interface.NavegadorInternet;
import Interface.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Ligando o iphone.. Pifou!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o celular...");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Correio de voz aberto..");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página aberta");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova página aberta...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada....");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música....");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }



     public static void main(String[] args) {

         Iphone iphone = new Iphone();

         Scanner sc = new Scanner(System.in);
        System.out.println("Deseja ligar o celular? 1 - Sim | 2 - Não");
        int yesOrNo = sc.nextInt();

        if(yesOrNo == 1){
            iphone.ligar();
        } else {
            System.out.println("O aparelho permanece desligado.");
        }
    }


}
