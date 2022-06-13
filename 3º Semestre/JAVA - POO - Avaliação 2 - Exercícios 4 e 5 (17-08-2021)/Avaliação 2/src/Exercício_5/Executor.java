/*
5) Construa um programa de sua autoria (nenhum exercício visto em aula). Deve conter os pilares que
foram estudados em aula. Nas classes devem conter os métodos especiais. No principal deve ser
criado, pelo menos, um objeto e deve ser mostrado em tela. Ao final, faça um vídeo explicando o
código. Pode enviar o link da gravação. (1,5)

Tema: Bar
 */
package Exercício_5;

public class Executor {
    public static void main(String args[]){     
    Cliente cliente1 = new Cliente();
    Pedidos pedido1 = new Pedidos();
    Funcionario funcionario1 = new Funcionario();
    Garçom garçom1 = new Garçom();
    Caixa caixa1 = new Caixa();
    
    cliente1.setNome("Taís da Silva");
    cliente1.setIdade(26); 
    cliente1.setAltura(1.90);
    cliente1.imprimeInformacoes();
    
    pedido1.setComida("X-salada");
    pedido1.setBebida("Suco de Maracujá");
    pedido1.setValor(10.50);
    pedido1.imprimeInformacoes();
            
    funcionario1.setNome("Josberto Cunha");
    funcionario1.setCargo("Fachineiro");
    funcionario1.setTurno("Diurno");
    funcionario1.imprimeInformacoes();
    
    garçom1.setGorjeta(0);
    caixa1.setCaixa(3);
    }       
}
