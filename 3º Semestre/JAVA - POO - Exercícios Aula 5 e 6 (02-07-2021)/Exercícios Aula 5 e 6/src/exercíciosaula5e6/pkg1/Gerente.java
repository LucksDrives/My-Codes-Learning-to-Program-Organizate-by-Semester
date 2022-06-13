/*
1) Implemente os exemplos dos slides de aula:
a. Encapsulamento;
b. Relacionamentos;
c. Herança;
d. Polimorfismo;
e. Classes abstratas;
f. Interfaces.
2) Faça seus próprios exemplos com base no exercício 1.
 */
package exercíciosaula5e6.pkg1;

public class Gerente extends Funcionario {

    @Override
    public double calcularSalario() {
        return super.getSalario() * 1.20;
    }

    boolean autenticar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean autenticar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

publilic Class Presidente extends Funcionario{
public double calcularSalario() {
return super.getSalario() * 1.80;
}
}
