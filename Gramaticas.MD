## Gramatica utilizadas

main::= LLAVE_IZQ sentencias LLAVE_DER

sentencias::= sentencias sentencia 

        | sentencia


sentencia::= conjunto

        | expRel


conjunto ::= CONJ DOSPUNTOS ID FLECHA expCon PUNTOCOMA 



expRel::= ID FLECHA e PUNTOCOMA 




expCon::= ID  

        |CARACTER
        |STRING
        |expCon


expCon1::= CULEBRACARACTER 

        |CULEBRA ID 
        |CULEBRA STRING 
        |COMA CARACTER 
        |COMA ID 
        |COMA STRING 
    

e    ::= valor

        |op


valor::= PAR_IZQ valor1 PAR_DER 

        | valor1


valor1 ::= ID

        |CARACTER
        |STRING
      

op   ::= BARRA_V e e 

        | op1

op1  ::= PUNTO e e 

        |op2


op2  ::= INT e

        |op3


op3  ::= MAS e 

        |op4


op4 ::= POR e 