package model;

import dao.noticiasDAO;

public class NotiModel {
    
    public void salvar(String num1, int num2, String num3, String num4, int num5){
        Noticias AUX = new Noticias();
        AUX.setNome(num1);
        AUX.setQuantidade(num2);
        AUX.setImagem(num3);
        AUX.setDescricao(num4);
        AUX.setNumeroGalpao(num5);
        
        noticiasDAO noticiasDAOO = new noticiasDAO();
        noticiasDAOO.inserir(AUX);
    }
}