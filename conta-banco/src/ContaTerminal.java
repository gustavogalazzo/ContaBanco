
/**
 * (US)This program demonstrates how to create a bank account using the Scanner class in Java.
 * (PT-BR)Este programa demonstra como criar uma conta bancária usando a classe Scanner em Java.
 * 
 * @author Gustavo Galazzo
 */
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * (US)This method creates a bank account and displays a message to the user.
     * (PT-BR) Este método cria uma conta bancária e exibe uma mensagem ao usuário.
     * 
     * @param args command line arguments (not used) / argumentos de linha de
     *             comando (não usados)
     */
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // (US)Prompt the user to enter the account information / (PT-BR)Solicitar ao
        // usuário que insira as informações da conta
        System.out.println("Informe o numero da agencia da conta: ");
        String agencia = scanner.next();
        System.out.println("Informe o número da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Informe o nome do titular da conta: ");
        String nomeCliente = scanner.next();
        double saldo = 237.48;

        // (US)Display a message to the user / (PT-BR)Exibir uma mensagem ao usuário
        System.out.println(
                "Olá " + nomeCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", " + "conta " + numero + " e seu saldo " + "R$" + saldo + " já está disponível para saque");
    }
}
