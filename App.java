import java.util.Scanner;

/**
 * Classe que inicializa o programa (tem o método main)
 * 
 * @author Julio Cesar Alves
 * @version 2023.11.06
 */
public class App {
    /**
     * Metodo principal que inicia a execucao do menu programa
     *
     * @param args Parametros do programa (o programa nao espera nenhum)
     */
    public static void main(String[] args) {
        InterfaceUsuario iu = new InterfaceUsuario();
        iu.executarMenu();
    }
}
