
/**
 * Classe para representar os carros no simulador de trânsito.
 * Tem tudo que todos os veículos têm e acrescenta a informação
 * se o combustível é flex ou normal.
 * 
 * @author Julio César Alves
 * @version 2023.11.09
 */
public class Carro extends Veiculo
{
    private boolean ehFlex;

    /**
     * Construtor para objetos da classe Carro
     */
    public Carro(String modelo, String marca, String placa, boolean ehFlex) {
        super(modelo, marca, placa);
        
        this.ehFlex = ehFlex;
    }

    /**
     * Retorna se o carro tem combustivel flex ou não
     */
    public boolean obterEhFlex() {
        return ehFlex;
    }
    
    /**
     * Retorna descricao detalhada do carro
     */
    public String obterDescricaoCarro() {
        String descricao = obterDescricaoVeiculo();
        
        if (ehFlex) {
            descricao += " e eh flex";
        }
        else {
            descricao += " e tem combustivel normal";
        }
        return descricao;
    }
}
