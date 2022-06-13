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

public class FuncionarioAbstrata {

    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Funcionario g = new Gerente();
        g.setSalario(1000);
        System.out.println("Salario Gerente: " + g.calcularsalario());
        Funcionario d = new Diretor();
        d.setSalario(1000);
        System.out.println("Salario Diretor: " + d.calcularSalario());
        Funcionario p = new Presidente();
        p. - setSalario(1000);
        System.out.println("Salario Presidente: " + p.calcularSalario());
    }

    private static void setSalario(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public abstract class Funcionario {

    protected String nome;

    protected String cpf;

    protected double salario;

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public String getcpf() {
        return cpf;

    }

    public void setcCpf(String cpf) {
        this.cpf = cpf;

    }

    public double getSalario() {
        return salario;

    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public abstract double calcularSalario();

}
