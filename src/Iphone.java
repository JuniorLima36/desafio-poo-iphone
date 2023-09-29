import Apps.AparelhoTelefonico;
import Apps.NavegadorInternet;
import Apps.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar()  {
        System.out.println("Ligando...");
    }

    @Override
    public void atender()  {
        System.out.println("Alo");
    }

    @Override
    public void correioDeVoz()  {
        System.out.println("Correio de voz...");
    }

    @Override
    public void exibirPagina()  {
        System.out.println("Carregando pagina");
    }

    @Override
    public void novaAba()  {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina()  {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocar()  {
        System.out.println("Reproduzindo");
    }

    @Override
    public void pausar()  {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica()  {
        System.out.println("Selecionando musica");
    }
}
