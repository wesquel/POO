package addson.weslley;
import addson.weslley.Calculadora;

import java.util.Scanner;

public class TestarCalculadora{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        double n1 = s1.nextDouble();
        double n2 = s1.nextDouble();
        int n3 = 0;
        Calculadora c1 = new Calculadora(n1,n2);
        while (n3 != 6){
            System.out.println("Calculadora\n================\n1. Soma\n2. Subtrair\n3. Mutiplicar\n4. Dividir\n5. Sobre a Calculadora\n6. Sair");
            Scanner s2 = new Scanner(System.in);
            n3 = s2.nextInt();
            switch (n3){
                case 1:
                    System.out.println( c1.somar());
                    break;
                case 2:
                    System.out.println(c1.subtracao());
                    break;
                case 3:
                    System.out.println(c1.multiplicacao());
                    break;
                case 4:
                    System.out.println(c1.divizao());
                    break;
                case 5:
                    System.out.println("..........");
                    break;
                case 6:
                    System.out.println("Fim do programa.");
                    break;
            }
        }
    }
}
