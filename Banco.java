package Banco_crud;

public class Banco {
    private String titular;
    private int senha;
    private int numero_conta;
    private Double saldo;
    private boolean ativa=true;

    public Banco(String titular,int senha,int numero_conta){
        this.numero_conta=numero_conta;
        this.titular=titular;
        this.senha=senha;
        saldo=0.0;

    }

    public String toString(){
        return "Conta {"+ titular +", senha:"+senha+", número da conta:"+numero_conta+"}";
    }

    public int getNumero_conta() {
        if (!ativa){
            System.out.println("Conta inativa");
            return 0;
        }
        else {
            return numero_conta;

        }

    }

    public String getTitular() {
        if (!ativa){
            return "Conta inativa";
        }
        else {
            return titular;
        }
    }

    public int getSenha() {
        if (!ativa){
            System.out.println("Conta inativa");
            return 0;
        }
        else {
            return senha;

        }

    }

    public Double getSaldo() {
        if (!ativa){
            System.out.println("Conta inativa");
            return 0.0;
        }
        else {
            return saldo;

        }

    }

    public String deposito(double valor){
        if (!ativa){
            return "Conta inativa!";
        }
        else {
            if (valor<0){
                return  "Você não pode depositar números negativos";
            }
            saldo = saldo + valor;
            return "Você depositou " + valor + " reais.";

        }


    }
    public String sacar(double valor){
        if (!ativa){
            return "Conta inativa!";
        }
        else{
            if (valor>saldo){
                return "você não pode sacar mais do que possui na conta";
            }
            saldo = saldo - valor;
            return "Retirando" + valor + " reais";
        }

    }

    public String deletar(){
         if (!ativa){
            return "Está conta já foi apagada";
        }
        ativa=false;
        return "Conta apagada com sucesso!";

    }

}


