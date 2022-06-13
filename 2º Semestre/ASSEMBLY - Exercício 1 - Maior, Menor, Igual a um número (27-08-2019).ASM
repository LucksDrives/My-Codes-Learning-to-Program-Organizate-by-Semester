;1. Faça um programa que testa se uma variável é maior que 10.;       
         
.code                       
  LDA AUX     
  NOT      
  ADD #01  
  ADD NUMBER
  JZ VDD1  
  JN VDD2    
  LDA #1         
  STA MAIORQ10                         
  HLT
  VDD1: LDA #01
        STA E10
        HLT
  VDD2: LDA #01
       STA MENORQ10
       HLT
.endcode


.data
  NUMBER: DB #02      
  AUX: DB #0Ah
  MAIORQ10: DB #00h
  MENORQ10: DB #00h
  E10: DB #00h
.enddata

