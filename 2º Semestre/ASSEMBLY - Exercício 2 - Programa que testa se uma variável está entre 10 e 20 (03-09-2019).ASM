;2. Faça um programa que testa se uma variável está entre 10 e 20.;

.code
  LDA AUX
  NOT
  ADD #01
  ADD NUMBER                               
  JZ VDD1
  JN VDD2
  LDA AUX2
  NOT
  ADD #01
  ADD NUMBER
  JZ VDD3
  JN VDD4
  JMP VDD2
  HLT                                                       
  VDD1: LDA #01
        STA E10
        HLT                     
  VDD2: LDA #01
        STA NaoEstaNoIntervalo
        HLT
  VDD3: LDA #01
        STA E20
        HLT
  VDD4: LDA #01
        STA EstaNoIntervalo
        HLT
.endcode


.data
  NUMBER: DB #0fh
  AUX: DB #0Ah
  AUX2: DB #014h
  EstaNoIntervalo: DB #00h
  NaoEstaNoIntervalo: DB #00h
  E10: DB #00h
  E20: DB #00H

.enddata

