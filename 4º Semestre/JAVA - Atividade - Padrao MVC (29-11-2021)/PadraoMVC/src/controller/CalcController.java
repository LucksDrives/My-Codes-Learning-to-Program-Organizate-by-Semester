
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CalcModel;
import view.CalcView;

    public class CalcController {
     
    private CalcView view;
    private CalcModel model;
    
    public CalcController(CalcView view, CalcModel model) {
        this.view = view;
        this.model = model;
        
        this.view.getBtnAdd().addActionListener(new CalcListener());
        this.view.getBtnAdd2().addActionListener(new CalcListener2());
    }
    
    class CalcListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int num1 = Integer.parseInt(view.getTxtNum1().getText());
            int num2 = Integer.parseInt(view.getTxtNum2().getText());
            
            model.somar(num1, num2);
            
            view.setLblResultado(Integer.toString(model.getResultado()));            
        }
    
    }
    
    class CalcListener2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
           
            int num3 = Integer.parseInt(view.getTxtNum3().getText());
            int num4 = Integer.parseInt(view.getTxtNum4().getText());          
            
            model.multiplicar(num3,num4);
            
            view.setLblResultado2(Integer.toString(model.getResultado2()));
        }
    
    }

 }
