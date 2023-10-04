public class Iphone implements Player, Telefone, Internet{
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Ligação Atendida.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada Encerrada.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página...");
    }

    @Override
    public void adicionarNovaGuia() {
        System.out.println("Adicionando Nova Guia...");
    }

    @Override
    public void atualizarGuia() {
        System.out.println("Atualizando Guia...");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música Pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada.");
    }
}
