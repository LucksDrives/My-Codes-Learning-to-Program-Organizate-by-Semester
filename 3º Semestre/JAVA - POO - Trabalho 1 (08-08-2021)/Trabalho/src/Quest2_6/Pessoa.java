/*
2) Implemente o exemplo do UML a seguir Pessoa
    String nome;
    int idade;
    String sexo;
-Métodos get(s) e set(s)encapsulados;
-Saída de Dados (Cliente): nome, idade, sexo, valor da divida e ano do nascimento.
-Saída de Dados (Empregado/Gerente): nome, matricula, nome da gerência, valor do INSS.
-Saída de Dados (Empregado/Vendedor): nome, salário, valor das vendas e quantidade de vendas.
 */
package Quest2_6;

public class Pessoa {
    String nome;
    int idade;
    private String sexo;
    
    //Get e Set
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getSexo(){
        return this.sexo;
    }    
}
