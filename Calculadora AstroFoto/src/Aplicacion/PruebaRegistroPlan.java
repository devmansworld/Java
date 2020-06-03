/*

 */
package Aplicacion;

import Libreria.RegistroPlan;

/**
 *
curso ing. en informatica
* examen 02 curso Taller de Java

 */
public class PruebaRegistroPlan {
    public static void main(String[] args) {
    
        RegistroPlan oca = new RegistroPlan();
        oca.setPlan(1); // recoge input de velocidad D/L
        oca.setIdFormatoFoto(3); //recoge el input de tipo de formato
        oca.setPesoMP(10);  // recoge el input de peso en MPX 
        oca.setCantidadFotos(6000);  //recoge el input e cantidad de fotos 
        oca.obtenerDatos();  
    
    }
}

/*
In addition to the eight primitive data types listed 
above, 
the Java programming language 
also provides special support
for character strings 
via the java.lang.String class. 

Enclosing your character string 
within double quotes 
will automatically create 
a new String object; 

for example, 
String s = "this is a string";. 

String objects are immutable,
which means that once created, 
their values cannot be changed. 

The String class 
is not technically a primitive data type, 
but considering 
the special support given to it by the language,
you'll probably tend 
to think of it as such.


You'll learn more 
about the String class
in Simple Data Objects

*/
