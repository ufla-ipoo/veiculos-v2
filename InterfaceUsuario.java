import java.util.Scanner;

/**
 * Classe que faz a interface com usuario do simulador.
 * Permite cadastrar carros e caminhoes, lista-los e mudar suas velocidades.
 * 
 * @author Julio Cesar Alves
 * @version 2023.11.06
 */
public class InterfaceUsuario {
    // simulador de trânsito que possui as coleções de veículos
    private Simulador simulador;
    // Objeto usado para obter dados do usuário no terminal
    private Scanner entrada;

    /**
     * Construtor de objetos da Interface de usuário
     */
    public InterfaceUsuario() {
        simulador = new Simulador();
        entrada = new Scanner(System.in);
    }
    
    /**
     * Metodo principal que inicia a execucao do menu programa
     */
    public void executarMenu() {
        int opcaoMenu;
        do {
            opcaoMenu = exibirMenu();
            
            switch (opcaoMenu) {
                case 1:
                    adicionarVeiculo();
                    break;
                case 2:
                    alterarVelocidadeVeiculo();
                    break;
                case 3:
                    exibirVeiculos();
                    break;
                case 4: // nao faz nada, apenas vai sair do programa
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcaoMenu != 4);
    }
    
    /**
     * Exibe o menu para o usuario e retorna a opcao escolhida por ele
     * 
     * @return Opcao de menu escolhida pelo usuario
     */
    private int exibirMenu() {
        System.out.println("\n\n1) Adicionar Veiculo");
        System.out.println("2) Alterar velocidade");
        System.out.println("3) Listar Veiculos");
        System.out.println("4) Sair");
        System.out.print("\tDigite sua opcao: ");
        
        return Integer.parseInt(entrada.nextLine());
    }
    
    /**
     * Permite ao usuario adicionar um veiculo ao simulador.
     * O usuario passa os dados de acordo com o tipo de veiculo.
     */
    private void adicionarVeiculo() {        
        String modelo, marca, placa;
        int tipo;
        boolean adicionado = false;
        
        System.out.print("Digite o modelo: ");
        modelo = entrada.nextLine();
        System.out.print("Digite a marca: ");
        marca = entrada.nextLine();
        System.out.print("Digite a placa: ");
        placa = entrada.nextLine();
        
        System.out.print("Qual o tipo de veiculo (1-carro, 2-caminhao)? ");
        tipo = Integer.parseInt(entrada.nextLine());
        
        switch(tipo) {
            case 1: // carro
                System.out.print("Digite se eh flex (1-sim, 2-nao): ");
                int flex = Integer.parseInt(entrada.nextLine());
                boolean ehFlex = (flex == 1);                
                simulador.adicionarCarro(modelo, marca, placa, ehFlex);
                adicionado = true;
                break;
            case 2: // caminhao
                System.out.print("Digite a capacidade de carga (ton): ");
                int capacidadeCarga = Integer.parseInt(entrada.nextLine());
                simulador.adicionarCaminhao(modelo, marca, placa, capacidadeCarga);
                adicionado = true;
                break;
            default:
                System.out.println("Tipo de veiculo invalido!");
        }
        
        if (adicionado) {
            System.out.print("Veiculo adicionado!");
        }
        // espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
    
    /**
     * Permite ao usuario alterar a velocidade de um veiculo do simulador.
     * O usuario informa o tipo de veiculo e o modelo.
     */
    private void alterarVelocidadeVeiculo() {
        int tipo, velocidade;
        String modelo;
        boolean alterou = false;
       
        System.out.print("Qual o tipo de veiculo (1-carro, 2-caminhao)? ");        
        tipo = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite o modelo: ");
        modelo = entrada.nextLine();
        System.out.print("Digite a velocidade: ");
        velocidade = Integer.parseInt(entrada.nextLine());
        
        switch(tipo) {
            case 1: // carro
                alterou = simulador.mudarVelocidadeCarro(modelo, velocidade);
                break;
            case 2: // caminhao
                alterou = simulador.mudarVelocidadeCaminhao(modelo, velocidade);            
                break;
            default:
                System.out.println("Tipo de veiculo invalido!");
        }
        
        if (alterou) {
            System.out.println("Velocidade alterada!");
        }
        else {
            System.out.println("Veiculo nao encontrado ou velocidade invalida!");
        }
        // espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
    
    /**
     * Exibe na tela os veiculos retornados pelo simulador
     */
    private void exibirVeiculos() {
        System.out.println(simulador.obterDadosVeiculos());
        
        // espera usuario digitar uma tecla qualquer
        esperarTecla();
    }
    
    /**
     * Exibe na tela o texto "ENTER para continuar" e aguarda um ENTER
     */
    private void esperarTecla() {
        System.out.print("\n\nENTER para continuar...");
        entrada.nextLine();
    }
}
