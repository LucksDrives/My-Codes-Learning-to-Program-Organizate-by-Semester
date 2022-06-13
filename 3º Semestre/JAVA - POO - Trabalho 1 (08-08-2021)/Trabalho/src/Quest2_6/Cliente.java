/*
2) Implemente o exemplo do UML a seguir: Pessoa/Cliente
    double valorDivida;
    int anoNascim;
-Métodos get(s) e set(s)encapsulados;
-Saída de Dados: nome, idade, sexo, valor da divida e ano do nascimento.
 */
package Quest2_6;

public class Cliente extends Pessoa {
    private double valorDivida;
    int anoNascim;
    
    //Get e Set
    public void setvalorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }
    
    public double getvalorDivida(){
        return this.valorDivida;
    } 
}
