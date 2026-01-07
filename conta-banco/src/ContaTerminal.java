
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite o saldo");
        double saldo = scanner.nextDouble();
        System.out.println(saldo);

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque!"
        );
    }
}
