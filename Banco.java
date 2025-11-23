package Banco_crud;

public class Banco {
    private String titular;
    private int senha;
    private int numero_conta;
    private Double saldo;

    public Banco(String titular,int senha,int numero_conta){
        this.numero_conta=numero_conta;
        this.titular=titular;
        this.senha=senha;
        saldo=0.0;

    }

    public String tostring(){
        return "Conta {"+ titular +",senha:"+senha+"número da conta:"+numero_conta+"}";
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public String getTitular() {
        return titular;
    }

    public int getSenha() {
        return senha;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String deposito(double valor){
        saldo = saldo + valor;
        return "Você depositou"+ valor +" reais.";
    }
    public String sacar(double valor){
        saldo = saldo - valor;
        return "Retirando"+ valor + " reais";

    }
}


