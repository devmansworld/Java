/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
 curso ing. en informatica
 * 
 * metodo TryParse verifica que se ingrese un String calculando su valor ENTERO
 */
public class TryParse {
   public boolean esEntero(String cnumero) {
        try {
            int numero = Integer.valueOf(cnumero);
            return true;
        } catch(Exception e){
            return false;
        }
    } 
}


/*

boolean: 
The boolean data type 
has only two possible values: 
true and false. 

Use this data type 
for simple flags that t
rack true/false conditions. 

This data type represents 
one bit of information,
but its "size" 
isn't something 
that's precisely defined.*/