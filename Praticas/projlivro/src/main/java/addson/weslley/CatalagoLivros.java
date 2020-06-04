package addson.weslley;

import java.util.ArrayList;
public class CatalagoLivros{

    private ArrayList<Livro> livros = new ArrayList<Livro>();

    public boolean adicionarLivro(Livro l1) {
        for (Livro temp : livros) {
            if (temp.getId() == l1.getId()) {
                return false;
            }
        }
        return livros.add(l1);
    }

    public boolean removeLivro(int id){
        if (id < 1 ) return false;
        return livros.removeIf(temp -> temp.getId() == id);
    }

    public String buscar (int id){
        if (id < 1) return "O numero deve ser maior que 0.";
        for (Livro temp : livros){
            if (temp.getId() == id){
                return temp.getTitulo();
            }
        }
        return "Não existe";
    }

    public void verCatalalogo(){
        System.out.println(livros);
    }


}
