package addson.weslley;
public class Livro {

    private int id;
    private String titulo;

    public Livro() {
    }

    public Livro(int id, String titulo) {
        this.setId(id);
        this.setTitulo(titulo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.length() > 0) {
            this.titulo = titulo;
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + getId() +
                ", titulo='" + getTitulo() + '\'' +
                '}';
    }
}
