;3. Faça um programa que conta até 10.;
.code                                 
INI: LDA AUX
    ADD CONTADOR 
    STA CONTADOR
    LDA AUX2
    NOT
    ADD #01H
    ADD CONTADOR
    JZ VDD
    JMP INI

    VDD:LDA #01H
        HLT
.endcode


.data
      NUMBER: DB #00H
      AUX: DB #01H
      AUX2: DB #0AH
      CONTADOR: DB #00H
.enddata
                                       
