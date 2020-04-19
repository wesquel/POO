package addson.weslley.pratica3;

public class contaCorrente {

    private int numero;
    private double saldo;
    private String titular;


    public contaCorrente() {
        this.numero = 0;
        this.saldo = 0;
        this.titular = "---Sem nome---";

    }

    public void deposito(double num){
        if (num >= 0) {
            this.saldo = num + this.saldo;
        }
    }

    public void saque(double num){
        double CPMF = calcularCPMF(num);
        double total = this.saldo - num - CPMF;
        if (total >= 0 && num >0){
            this.saldo = this.saldo - num;
            descontarCPMF(num);
        }
    }

    public double saldo(){
        return this.saldo;
    }

    public String extrato(){
        return "Titular: " + this.titular + "\n"+
               "Numero: " + this.numero + "\n"+
               "Saldo: " + this.saldo;
    }


    public double calcularCPMF(double num){
        return num*0.01;
    }

    public void descontarCPMF(double num){
        double CPMF = calcularCPMF(num);
        if ((this.saldo - CPMF) >= 0){
            this.saldo = this.saldo - CPMF;
        }
    }

}