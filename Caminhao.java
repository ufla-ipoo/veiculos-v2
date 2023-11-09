
/**
 * Classe para representar os caminhoes no simulador de trânsito.
 * Tem tudo que todos os veículos têm e acrescenta a informação
 * da capacidade de carga.
 * 
 * @author Julio César Alves
 * @version 2023.11.09
 */
public class Caminhao extends Veiculo
{
    private int capacidadeDeCarga;

    /**
     * Construtor para objetos da classe Caminhao
     */
    public Caminhao(String modelo, String marca, String placa, int capacidadeDeCarga) {
        super(modelo, marca, placa);
        
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    /**
     * Retorna se a capacidade de carga do caminhão
     */
    public int obterCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }
    
    /**
     * Retorna descricao detalhada do caminhao
     */
    public String obterDescricaoCaminhao() {
        String descricao = obterDescricaoVeiculo();
        descricao += " capacidade " + capacidadeDeCarga + " toneladas";
        return descricao;
    }
}
