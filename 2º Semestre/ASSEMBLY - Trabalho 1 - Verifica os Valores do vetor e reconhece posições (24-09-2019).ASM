;Lucas Asquidamini e Maicon Vidi;
;O Código verifica os Valores do vetor e reconhece, se os mesmos estão no intervalo de 10 a 20, se não estão no intervalo, se são 10, ou se são 20;       

;LINHA DE CÓDIGO;

.code

;TESTE COM DEZ;
         
LOOP:  LDA end1 ;Carrega o Vetor para comparar com 10;
       ADD #01h ;Muda a posição em que o vetor se encontra;
       STA end1 ;Salva essa nova Posição;
       LDA end1,I ;Carrega indiretamente a Posição do Vetor;
       LDA AUX ;Subtrai dez do valor testado/ Caso 0 = 10;
       NOT ;Negar o Auxiliar;
       ADD #01 ;Atribui 1 para deixar o Auxiliar Negativo;
       ADD end1,I ;valor testado e comparado com 10;    
       JZ VDD1 ;Caso VDD1=0, é 10;
       JN VDD2 ;Caso VDD2=Negativo, Ñ está no intervalo;
                                                          
;TESTE COM 20;                                                   
       LDA end1,I;Carrega o Vetor para comparar com 20; 
       LDA AUX2 ;Subtrai vinte do valor testado/ Caso 0 = 20;
       NOT ;Negar o Auxiliar;                    
       ADD #01 ;Atribui 1 para deixar o Auxiliar Negativo;  
       ADD end1,I ;valor testado e comparado com 20;      
       JZ VDD3 ;Caso VDD3=0, é 20;
       JN VDD4 ;Caso VDD4=Negativo, Está no intervalo;
       JN END ;Encerra o Loop;               
       JMP VDD2 ;Caso Ñ entre nas outras opções, Ñ está no intervalo;
       JMP LOOP ;Repete o Loop;

;Caso for 10;

  VDD1: LDA #01
        STA E10

;Caso Ñ está no intervalo;

  VDD2: LDA #01
        STA NaoEstaNoIntervalo           

;Caso for 20;

  VDD3: LDA #01
        STA E20
        
;Caso está no intervalo;

  VDD4: LDA #01
        STA EstaNoIntervalo  
              
;Encerra o código;
  END: HLT        
.endcode


;VARIÁVEIS;                                            

.data
                                                            
;VETOR;                                       
          
  NUMBER: DB #00h ;Valor reservado apenas para iniciar o acrescimo do end1;
          DB #01h ;Recebe o Primeiro Valor a ser Testado;
          DB #0Ah  ;Recebe o Segundo Valor a ser Testado;
          DB #013h  ;Recebe o Terceiro Valor a ser Testado;
          DB #01Eh ;Variavel para Encerrar o Loop;
          
          ;Contadores que chamam o vetor;
          end1: DB NUMBER               
          
;AUXILIARES E RECEPTORES;

  AUX: DB #0Ah ;Subtrai dez do valor testado/ Caso 0 = 10;
  AUX2: DB #014h ;Subtrai vinte do valor testado/ Caso 0 = 20;
  EstaNoIntervalo: DB #00h ;Valor testado é salvo aqui/ caso o valor entre no intervalo;
  NaoEstaNoIntervalo: DB #00h ;Valor testado é salvo aqui/ caso o valor Ñ entre no intervalo;
  E10: DB #00h ;Valor testado é salvo aqui/ caso o valor seja 10;
  E20: DB #00H ;Valor testado é salvo aqui/ caso o valor seja 20;                                                                      
.enddata
                                        
