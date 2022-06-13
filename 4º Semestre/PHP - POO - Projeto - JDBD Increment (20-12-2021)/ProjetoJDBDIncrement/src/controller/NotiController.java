
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.NotiModel;
import View.NotiView;

    public class NotiController {
     
    private NotiView view;
    private NotiModel model;
    
    public NotiController(NotiView view, NotiModel model) {
        this.view = view;
        this.model = model;
        
        System.out.println("Insert Controller [OK]");
        
        this.view.getBtnAdd().addActionListener(new NotiListener());
    }
    
    class NotiListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String num1, num3, num4;    
            int num2, num5;
            
            num1 = view.getTxtNum1().getText();
         
            num2 = Integer.parseInt(view.getTxtNum2().getText());
            
            num3 = view.getTxtNum3().getText();
            
            num4 = view.getTxtNum4().getText();
                                   
            num5 = view.getTxtNum5();
            
           
            model.salvar(num1, num2, num3, num4, num5);
        }    
    }    
}