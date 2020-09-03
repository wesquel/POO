package addson.weslley;

import java.util.Scanner;

public class exibirMenu {
    public static void main(String[] args) {

        contaCorrente conta = new contaCorrente(1,"Weslley Addson Silva de Carvalho");

        System.out.println(
                "--- Projeto Conta Corrente ---\n" +
                "   1. Saque\n" +
                "   2. Deposito\n" +
                "   3. Saldo na tela\n" +
                "   4. Extrato na tela\n" +
                "   5. Sair\n" +
                "------------------------------");

        Scanner sc1 = new Scanner(System.in);

        int num1 = 0;

        while (num1 != 5) {

            System.out.print("Digite uma Opção: ");

            num1 = sc1.nextInt();

            Scanner sc2 = new Scanner(System.in);

            if (num1 == 1){
                int num2 = sc2.nextInt();
                conta.saque(num2);
            }
            else if (num1 == 2){
                int num2 = sc2.nextInt();
                conta.deposito(num2);
            }
            else if (num1 == 3){
                System.out.println(conta.getSaldo());
            }
            else if (num1 == 4){
                System.out.println(conta.extrato());
            }
        }

    }
}
