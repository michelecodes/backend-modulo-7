// Classe que representa um objeto do mundo real: Carro
public class Carro {

    // Propriedades do carro
    private String modelo;
    private String cor;
    private int anoFabricacao;

    // Construtor para inicializar as propriedades do carro
    public Carro(String modelo, String cor, int anoFabricacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    // Método para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }

    // Método para definir o modelo do carro
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método para obter a cor do carro
    public String getCor() {
        return cor;
    }

    // Método para definir a cor do carro
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Método para obter o ano de fabricação do carro
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    // Método para definir o ano de fabricação do carro
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
    }

    // Método para ligar o carro
    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    // Método para desligar o carro
    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    // Método principal para testar a classe Carro
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Fusca", "Azul", 2000);

        // Exibindo informações do carro
        meuCarro.exibirInformacoes();

        // Ligando o carro
        meuCarro.ligar();

        // Desligando o carro
        meuCarro.desligar();
    }
}
