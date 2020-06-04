package addson.weslley;

public class InterfaceTextual {
    public static void main(String[] args) {
        Livro l1 = new Livro(1,"Weslley");
        Livro l2 = new Livro(2,"Weslley2");
        Livro l3 = new Livro(3,"Weslley3");
        CatalagoLivros c1 = new CatalagoLivros();
        c1.adicionarLivro(l1);
        c1.verCatalalogo();
        c1.adicionarLivro(l2);
        c1.verCatalalogo();
        c1.adicionarLivro(l3);
        c1.verCatalalogo();
        c1.removeLivro(3);
        c1.verCatalalogo();
        c1.removeLivro(1);
        c1.verCatalalogo();
        System.out.println(c1.buscar(2));
    }
}
