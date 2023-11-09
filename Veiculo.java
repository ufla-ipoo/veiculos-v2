
/**
 * Classe que representa os veiculos do simulador de transito.
 * 
 * @author Julio César Alves
 * @version 2023.11.09
 */
public class Veiculo
{
    // modelo do veiculo (Onix, Gol, etc.)
    private String modelo;
    // marca do veiculo (Fiat, VW, etc.)
    private String marca;
    // placa do veiculo
    private String placa;
    // velocidade atual do veiculo
    private int velocidadeAtual;
    

    /**
     * Construtor para objetos da classe Veiculo
     */
    public Veiculo(String modelo, String marca, String placa)
    {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        velocidadeAtual = 0;
    }
    
    /**
     * Retorna o modelo do veiculo
     */
    public String obterModelo() {
        return modelo;
    }
    
    /**
     * Retorna o marca do veiculo
     */
    public String obterMarca() {
        return marca;
    }
    
    /**
     * Retorna o placa do veiculo
     */
    public String obterPlaca() {
        return placa;
    }
    
    /**
     * Retorna o velocidade atual do veiculo
     */
    public int obterVelocidadeAtual() {
        return velocidadeAtual;
    }

    /**
     * Altera a velocidade do veiculo
     */
    public void definirVelocidadeAtual(int velocidade) {
        this.velocidadeAtual = velocidade;
    }
    
    /**
     * Retorna uma descrição do veiculo como String
     */
    public String obterDescricaoVeiculo() {
        return "Veiculo " + modelo + " da marca " + marca
               + " de placa " + placa + " a " + velocidadeAtual + " km/h";
    }
}
