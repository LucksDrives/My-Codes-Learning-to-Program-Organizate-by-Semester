
package model;

public class Noticias{
    private int idnoticias;
    private String nome;
    private int quantidade;
    private String imagem;
    private String descricao;
    private int numero_galpao;
    
    public Noticias(){
    
    }
    
//-----------------------------------------------------  Get e Set - ID
    public int getIdNoticias(){
        return idnoticias;
    }
    
    public void setIdNoticias(int idnoticias){
        this.idnoticias = idnoticias;
    }

//-----------------------------------------------------  Get e Set - NOME
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

//-----------------------------------------------------  Get e Set - QUANTIDADE
    
    public int getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade (int quantidade){
        this.quantidade = quantidade;
    }

//-----------------------------------------------------  Get e Set - IMAGEM
    
    public String getImagem(){
        return imagem;
    }
    
    public void setImagem(String imagem){
        this.imagem = imagem;
    }
    
//-----------------------------------------------------   Get e Set - DESCRICAO   
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

//-----------------------------------------------------  Get e Set - NUMERO
    
    public int getNumeroGalpao(){
        return numero_galpao;
    }
    
    public void setNumeroGalpao(int numero_galpao){
        this.numero_galpao = numero_galpao;
    }   
}

