import addson.weslley.*;

public class gui {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Professor p1 = new Professor(23);
        Gerente g1 = new Gerente(12);

        System.out.println(f1.toString());
        System.out.println(p1.toString());
        System.out.println(g1.toString());

    }
}
