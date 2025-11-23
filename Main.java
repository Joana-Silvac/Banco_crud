package Banco_crud;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        System.out.println("Insira as informações da sua conta:");
        System.out.println("Titular: ");
        String nome= entrada.nextLine();
        System.out.println("senha: ");
        int senha= entrada.nextInt();
        System.out.println("número da conta: ");
        int numero= entrada.nextInt();


        Banco cliente= new Banco(nome, senha, numero);

        while ( true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("--BEM VINDO AO BANCO--");
            System.out.println("O que deseja fazer hoje?");
            System.out.println("Ver informações da conta--1");
            System.out.println("Saldo---------------------2");
            System.out.println("deposito------------------3");
            System.out.println("Sacar---------------------4");
            System.out.println("excluir conta-------------5");
            System.out.println("Sair----------------------6");

            int escolha= entrada.nextInt();
            if(escolha==1){
                System.out.println(cliente);
            } else if (escolha==2) {
                System.out.println(cliente.getSaldo());

            } else if (escolha==3) {
                System.out.println("Digite o valor que deseja depositar");
                Double valor= entrada.nextDouble();
                System.out.println(cliente.deposito(valor));
            } else if (escolha==4) {
                System.out.println("Digite o valor que deseja sacar");
                Double valor= entrada.nextDouble();
                System.out.println(cliente.sacar(valor));
            } else if (escolha==5) {
                System.out.println(cliente.deletar());

            } else if (escolha==6) {
                System.out.println("Tchau tchau");
                break;

            }else {
                System.out.println("Insira um número válido");
            }


        }




    }


}