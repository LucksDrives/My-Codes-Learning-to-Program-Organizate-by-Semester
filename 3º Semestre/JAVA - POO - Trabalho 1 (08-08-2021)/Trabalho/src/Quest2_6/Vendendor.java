/*
2) Implemente o exemplo do UML a seguir: Pessoa/Empregado/Vendendor
    double valorVendas;
    int qntVendas;
-Métodos get(s) e set(s)encapsulados;
-Saída de Dados: nome, salário, valor das vendas e quantidade de vendas.
 */
package Quest2_6;

public class Vendendor extends Empregado{
    private double valorVendas;
    int qntVendas;
    
    //Get e Set
    public void setvalorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }
    
    public double getvalorVendas(){
        return this.valorVendas;
    }
}
