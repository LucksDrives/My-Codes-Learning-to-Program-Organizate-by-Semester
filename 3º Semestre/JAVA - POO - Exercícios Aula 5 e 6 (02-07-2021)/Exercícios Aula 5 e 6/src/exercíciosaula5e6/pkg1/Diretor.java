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

public class Diretor extends Gerente {

    @Override
    public double calcularSalario() {
        return super.getSalario() * 1.40;
    }

    @Override
    boolean autenticar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean autenticar(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class Diretor implements Autenticavel {

    private final int senha = 1234;

    public double calcularsalario() {
        return super.getSalario() * 1.40;
    }

    public boolean autenticar(int senha) {
        return this.senha == senha;
    }
}
