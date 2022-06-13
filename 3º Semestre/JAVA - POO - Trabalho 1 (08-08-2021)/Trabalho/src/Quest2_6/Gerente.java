/*
2) Implemente o exemplo do UML a seguir: Pessoa/Empregado/Gerente
    String nomeGerencia;
-Métodos get(s) e set(s)encapsulados;
-Saída de Dados: nome, matricula, nome da gerência, valor do INSS.
 */
package Quest2_6;

public class Gerente extends Empregado{
    private String nomeGerencia;
    
    //Get e Set
    public void setnomeGerencia(String nomeGerencia){
        this.nomeGerencia = nomeGerencia;
    }
    
    public String getnomeGerencia(){
        return this.nomeGerencia;
    } 
}
