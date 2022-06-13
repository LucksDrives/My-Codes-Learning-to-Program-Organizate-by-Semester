/*Implemente uma classe TestaConta com um método main, que crie alguns objetos do tipo
ContaCorrente. Deposite e saque valores das contas criadas e verifique o saldo.*/

package Exercicio3;

import java.util.Scanner;

public class TestaConta {
        public static void main(String[] args) {   
            
        /*Criar Novos Objetos*/
        ContaCorrente Conta1 = new ContaCorrente(); 
        ContaCorrente Conta2 = new ContaCorrente(); 
        ContaCorrente Conta3 = new ContaCorrente(); 
        
        /*Cadastrar Atributos nas Contas*/
        Conta1.cadastrarCliente("Leo Stronda", "1", 5000);        
        Conta2.cadastrarCliente("Tais Professora", "2", 100000); /*Rica*/
        Conta3.cadastrarCliente("José Asquidamini", "3", 1000); 
               
        /*Caso Selecione Depositar*/
        int seletor;
        do {
            
        /*Central de Seleção*/
        System.out.println("\n[1]Depositar" + "\n[2]Sacar" + "\n[3]Consultar Saldo" + "\n[4]Sair");
        Scanner input = new Scanner(System.in);
        seletor = input.nextInt(); 
        
                switch (seletor){
                case 1:
                    /*Depositar Valores nas Contas*/
                    System.out.println("\nDepositar");
                    Conta1.depositar();
                    Conta2.depositar();
                    Conta3.depositar();      
                    break;
                case 2:
                    /*Sacar Valores das Contas*/
                    System.out.println("\nSacar");
                    Conta1.sacar();
                    Conta2.sacar();
                    Conta3.sacar();        
                    break;
                case 3:
                    /*Verficar Saldo das Contas*/
                    System.out.println("\nConsultar Saldo");
                    Conta1.verificarSaldo();
                    Conta2.verificarSaldo();
                    Conta3.verificarSaldo(); 
                    break;
                default:
                    System.out.println("\nOpcao Invalida");
                    break;
            }
        }while (seletor != 4);
    }    
}
