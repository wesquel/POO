package addson.weslley;

public class Funcionario {
    private int matricula;
    private int idade;
    private String endereco;
    private String nome;
    private double salario;

    public Funcionario() {
        this.setMatricula(0);
        this.setEndereco("Não registrado!");
        this.setIdade(0);
        this.setNome("Não registrado!");
        this.setSalario(480);
    }

    public Funcionario(int matricula, int idade, String endereco, String nome, double salario) {
        this.setMatricula(matricula);
        this.setIdade(idade);
        this.setEndereco(endereco);
        this.setNome(nome);
        this.setSalario(salario);
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) this.salario = salario;
    }

    @Override
    public String toString() {
        return "addson.weslley.Funcionario{" +
                "matricula=" + matricula +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
