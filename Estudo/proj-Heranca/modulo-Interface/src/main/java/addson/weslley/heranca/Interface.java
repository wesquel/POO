package addson.weslley.heranca;

import java.awt.*;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Universidade uni = new Universidade();
        Funcionario f1 = new Funcionario(2,23,"Weslley","Seila",2);
        Funcionario f2 = new Funcionario(23,23,"Weslldey","Seila",2);
        Funcionario f3 = new Funcionario(223,23,"Weslldey","Seila",2);
        System.out.println(uni.adicionarFuncionario(f1));
        System.out.println(uni.adicionarFuncionario(f2));
        System.out.println(uni.adicionarFuncionario(f3));
        System.out.println(uni.adicionarFuncionario(f1));
        System.out.println(uni.buscarFuncionario(2));
    }
}
