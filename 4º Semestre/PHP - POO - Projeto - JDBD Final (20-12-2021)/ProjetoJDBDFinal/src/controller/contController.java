package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.contModel;
import View.contView;

    public class contController {
     
    private contView view;
    private contModel model;
    
    public contController(contView view, contModel model) {
        this.view = view;
        this.model = model;
        
        System.out.println("Insert Controller [OK]");
        
        this.view.getBtnAdd().addActionListener(new contListener());        
    }
    
    class contListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String num1, num2, num3;
            
            System.out.println("Insert Listner [OK]");
            
            num1 = view.getTxtNum1().getText();
                     
            num2 = view.getTxtNum2().getText();
            
            num3 = view.getTxtNum3().getText();
                                               
           
            model.salvar(num1, num2, num3);
        }    
    }    
}