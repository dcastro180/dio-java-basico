import java.util.Objects;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String cliente = ("MARIO ANDRADE");
        String Agencia = ("067-8");
        int numero = 1021;
        double saldo = 237.48;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por Favor, digite o número da agência: ");
        String ag = scanner.nextLine();
        String msg = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", cliente, ag, numero, saldo);
        if (Objects.equals(Agencia, ag)) {
        System.out.println(msg);
        } else {
            System.out.println("Agência não encontrada.");
        }

    }
    
}
