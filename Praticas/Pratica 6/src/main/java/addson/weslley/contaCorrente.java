package addson.weslley;

import java.math.BigDecimal;
import java.util.InputMismatchException;

public class contaCorrente {

    private int numero;
    private double saldo;
    private String titular;

    public contaCorrente() {
        this.setNumero(0);
        this.saldo = 10;
        this.setTitular("SEM TITULAR");
    }

    public contaCorrente(int numero, String titular) {
        this.setNumero(numero);
        this.saldo = 10;
        this.setTitular(titular);
    }

    public void deposito(double valor){
        try {
            if (valor < 0){
                throw new QuantiaNegativaException();
            }
            if (valor > 0){
                this.saldo += valor;
            }
        }
        catch (QuantiaNegativaException qne){
            System.err.println("\nQuantidade Negativa!");
        }

    }

    public void saque(double valor){
        try {
            if (valor > this.saldo) throw new SaldoInsuficienteException();
            if (valor < 0) throw new QuantiaNegativaException();
            if (this.saldo >= valor){
                this.saldo -= valor;
            }
        }
        catch (SaldoInsuficienteException sie){
            System.err.println("\nSaldo Insuficiente!");
        }
        catch (QuantiaNegativaException qne)
        {
            System.err.println("\nValor negativo!");
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
        boolean chk = false;
        try {
            for (int i = 0; i<titular.length(); i++){
                char crt = titular.charAt(i);
                if (Character.isDigit(crt)){
                    chk = true;
                    throw new EntradaInvalidaException();
                }
            }
        }
        catch (EntradaInvalidaException eie){
            System.err.println("\nEntra Invalida!");
        }
        if (!chk){
            this.titular = titular;
        }
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

}

class EntradaInvalidaException extends Exception{
    public EntradaInvalidaException(){
        this( "Entrada Invalida" );
    }
    public EntradaInvalidaException (String message){ super(message); }
}

class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(){
        this( "Saldo Insuficente!" );
    }
    public SaldoInsuficienteException (String message){
        super(message);
    }
}

class QuantiaNegativaException extends Exception{
    public QuantiaNegativaException (){
        this( "Quantia Negativa!" );
    }
    public QuantiaNegativaException (String message){
        super(message);
    }
}

