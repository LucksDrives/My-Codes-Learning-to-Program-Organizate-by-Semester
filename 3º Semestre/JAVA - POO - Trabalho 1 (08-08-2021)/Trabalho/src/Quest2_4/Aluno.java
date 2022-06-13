/*
2) Implemente o exemplo que está no arquivo “Classes, modificadores, métodos, construtores” classe 
Classes Aluno e ComparaAlunos (exemplo 3.1.6).
 */
package Quest2_4;

// Arquivo Aluno.java
public class Aluno{
    private int matricula;
    private String nome;
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public boolean equals(Object obj){
        Aluno alun = (Aluno)obj;
    if (matricula == alun.getMatricula()){
        if (nome.equals(alun.getNome())){
            return true;
        }
    }
    return false;
    }
}