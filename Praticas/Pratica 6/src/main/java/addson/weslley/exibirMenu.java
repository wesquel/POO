package addson.weslley;

import java.awt.font.NumericShaper;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exibirMenu {
    public static void main(String[] args) {

        contaCorrente conta = new contaCorrente(1, "SEM TITULAR");

        String titular;

        var nome = new Scanner(System.in);

        while (conta.getTitular() == null || conta.getTitular().equals("SEM TITULAR")){
            System.out.print("Digite o titular: ");
            titular = nome.nextLine();
            conta.setTitular(titular);
        }

        System.out.println("--- Projeto Conta Corrente ---\n" +
                        "   1. Saque\n" +
                        "   2. Deposito\n" +
                        "   3. Saldo na tela\n" +
                        "   4. Extrato na tela\n" +
                        "   5. Sair\n" +
                        "------------------------------");

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int num1 = 0;

        while (num1 != 5) {
            try {
                System.out.print("Digite uma Opção:\n");

                num1 = sc1.nextInt();

                if (num1 == 1) {
                    int num2 = sc2.nextInt();
                    conta.saque(num2);
                } else if (num1 == 2) {
                    int num2 = sc2.nextInt();
                    conta.deposito(num2);
                } else if (num1 == 3) {
                    System.out.println(conta.getSaldo());
                } else if (num1 == 4) {
                    System.out.println(conta.extrato());
                }
            } catch (InputMismatchException ime) {
                System.err.println("\nEntrada Invalida");
                break;
            }
        }
        sc1.close();
    }
}
