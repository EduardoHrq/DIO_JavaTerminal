import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Eduardo Henrique
 * @since 24 / 08 / 2023
 * @version 1
 *
 * */


public class ContaTerminal {

    public static void main(String[] args) {

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente;
        double saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nOlá! Vamos abrir sua conta no nosso banco?\n");

        System.out.print("Primeiramente me informe o seu nome: ");
        nomeCliente = entrada.nextLine();

        System.out.print("\nAgora me informe quanto de saldo você irá adicionar a sua conta: ");
        saldo = entrada.nextDouble();

        System.out.printf("\n\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu" +
                " saldo R$ %.2f já está disponível para saque.\n\n", nomeCliente, agencia, numero, saldo);


    }
}