package model;

import dao.contatoDAO;

public class contModel {
    
    public void salvar(String num1, String num2, String num3){
        
        System.out.println("Insert Model [OK]");
                       
        Contato c1 = new Contato();
        c1.setNome(num1);
        c1.setTelefone(num2);
        c1.setEmail(num3);
        
        contatoDAO contatoDAOO = new contatoDAO();
        contatoDAOO.inserir(c1);
    }
}
