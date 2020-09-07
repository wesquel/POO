package addson.weslley;

public class Gerente extends Funcionario{

    private int comicao;

    public Gerente(int comicao) {
        this.comicao = comicao;
    }

    public Gerente(int matricula, int idade, String endereco, String nome, double salario, int comicao) {
        super(matricula, idade, endereco, nome, salario);
        this.comicao = comicao;
    }

    public int getComicao() {
        return comicao;
    }

    public void setComicao(int comicao) {
        if (comicao > 0) this.comicao = comicao;
    }

    @Override

    public double getSalario(){
        return super.getSalario() + 1200;
    }

    @Override
    public String toString() {
        return "Gerente{" + super.toString() +
                " comicao=" + comicao +
                '}';
    }
}
