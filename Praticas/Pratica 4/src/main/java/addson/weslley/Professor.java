package addson.weslley;

public class Professor extends Funcionario{
    private int numHoras;

    public Professor(int numHoras) {
        this.numHoras = numHoras;
    }

    public Professor(int matricula, int idade, String endereco, String nome, double salario, int numHoras) {
        super(matricula, idade, endereco, nome, salario);
        this.numHoras = numHoras;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        if (numHoras > 0) this.numHoras = numHoras;
    }

    @Override
    public double getSalario(){
        return super.getSalario() + (2*getNumHoras());
    }


    @Override
    public String toString() {
        return "Professor{" +
                "numHoras=" + numHoras +
                '}';
    }
}
