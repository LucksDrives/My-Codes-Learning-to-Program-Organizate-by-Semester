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

public abstract class Funcionario {

    protected double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalario();

    String calcularsalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
