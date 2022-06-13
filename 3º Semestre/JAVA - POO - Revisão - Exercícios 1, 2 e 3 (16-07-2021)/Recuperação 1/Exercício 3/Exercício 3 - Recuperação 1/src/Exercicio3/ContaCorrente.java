/*3) Implemente uma classe ContaCorrente. A conta corrente deverá conter: (2,0)
 nomeCliente (String);
 numConta (String);
 saldo (float).
Implemente um construtor para a classe que receba os dados para a inicialização dos atributos. Crie
também os métodos: get e set para os atributos, sacar(float valor) – se não houver saldo, emite
mensagem e depositar(float valor).*/

package Exercicio3;

import java.util.Scanner;

public class ContaCorrente {
    public String nomeCliente;
    public String numConta;
    public float saldo;

    /*Método - Cadastrar Cliente - Conta*/
    public void cadastrarCliente(String infonomeCliente, String infonumConta, float infosaldo) {
    nomeCliente = infonomeCliente;
    numConta = infonumConta;
    saldo = infosaldo;
    }
    
    /*Método - Sacar*/
    public void sacar() {  
        float valor;        
        System.out.println("\nValor a Sacar [Conta: " + numConta + "]: " + "/ Valor Disponível: " + saldo);
        Scanner input = new Scanner(System.in);
        valor = input.nextInt();
        if(valor <= saldo){
            saldo -= valor;        
        }
        else{
          System.out.println("\nSaldo Insuficiente");     
        }
    }
    
    /*Método - Depositar*/
    public void depositar() {   
        float valor;
        System.out.println("\nValor a Depositar [Conta: " + numConta + "]: ");
        Scanner input = new Scanner(System.in);
        valor = input.nextInt();
        saldo += valor;
    }
    
    /*Método - Verificar Saldo*/
    public void verificarSaldo() {   
        System.out.println("\nSaldo da conta " + numConta + ": " + saldo);
    }
}
