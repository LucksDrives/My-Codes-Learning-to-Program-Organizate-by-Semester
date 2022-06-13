/*
2) Implemente o exemplo do UML a seguir: Pessoa/Empregado
    double salário;
    String matricula;
-Métodos get(s) e set(s)encapsulados;
-Saída de Dados (Gerente): nome, matricula, nome da gerência, valor do INSS.
-Saída de Dados (Vendedor): nome, salário, valor das vendas e quantidade de vendas.
 */
package Quest2_6;

public class Empregado extends Pessoa {
    private double salario;
    String matricula;
    
    //Get e Set
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    } 
}
