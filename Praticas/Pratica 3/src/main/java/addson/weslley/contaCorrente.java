package addson.weslley;

public class contaCorrente {

    private int numero;
    private double saldo;
    private String titular;

    public contaCorrente() {
        this.setNumero(0);
        this.saldo = 0;
        this.setTitular("Nao configurado");
    }

    public contaCorrente(int numero, String titular) {
        this.setNumero(numero);
        this.saldo = 0;
        this.setTitular(titular);
    }

    public void deposito(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public void saque(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    public String extrato(){
        return  "------------Extrato-----------\n" +
                "Numero: " + this.numero + "\n" +
                "Titular: " + this.titular + "\n" +
                "Saldo: " + this.saldo + "\n" +
                "------------------------------";
    }

    public double calcularCPMF(double valor){
        return valor *= 0.01;
    }

    public void descontarCPMF(double num){
        double CPMF = calcularCPMF(num);
        if ((this.saldo - CPMF) >= 0){
            this.saldo = this.saldo - CPMF;
        }
    }

    //getters and setters

    public void setNumero(int numero) {
        if (numero > 0){
            this.numero = numero;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

}
