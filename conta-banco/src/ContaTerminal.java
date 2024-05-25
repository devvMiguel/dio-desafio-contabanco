import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e Importar a classe Scanner
        
        //Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, preencha os dados requeridos abaixo:");

        System.out.println("Qual o nome do cliente? ");
        String nomeCliente = sc.nextLine();

        System.out.println("Qual o número da agência?");
        String numeroAgencia = sc.nextLine();

        System.out.println("Qual o número da conta ? (Com dígito)");
        int numeroConta = sc.nextInt();

        System.out.println("Qual o saldo do cliente?");
        double saldo = sc.nextDouble();

        System.out.println();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque!");
        System.out.println();
        System.out.println("Agradecemos pela preferência! ^^");

        sc.close();
    }
}
