/*
realizado en netbeansols | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
curso ing. en informatica
 */




/*
int: By default, 
the int data type 
is a 32-bit signed two's complement integer, 
which has a minimum value of -231 and a maximum value of 231-1. 
In Java SE 8 and later, 
you can use the int data type
to represent an unsigned 32-bit integer, 
which has a minimum value of 0 
and a maximum value of 232-1. 
Use the Integer class
to use int data type
as an unsigned integer. 
*/   

public class RegistroPlan {
    //Atributos
    private int plan;
    private int idFormatoFoto;
    private int pesoMP;
    private int cantidadFotos;
    //Constructor

    public RegistroPlan() {
        this.plan = 0;
        this.idFormatoFoto = 0;
        this.pesoMP = 0;
        this.cantidadFotos = 0;
    }
    public RegistroPlan(int plan, int idFormatoFoto, int pesoMP, int cantidadFotos) {
        this.plan = plan;
        this.idFormatoFoto = idFormatoFoto;
        this.pesoMP = pesoMP;
        this.cantidadFotos = cantidadFotos;
    }
    
    //Propiedades

    public int getPlan() {
        return plan;
    }

    public void setPlan(int plan) {
        this.plan = plan;
    }

    public int getIdFormatoFoto() {
        return idFormatoFoto;
    }

    public void setIdFormatoFoto(int idFormatoFoto) {
        this.idFormatoFoto = idFormatoFoto;
    }

    public int getPesoMP() {
        return pesoMP;
    }

    public void setPesoMP(int pesoMP) {
        this.pesoMP = pesoMP;
    }

    public int getCantidadFotos() {
        return cantidadFotos;
    }

    public void setCantidadFotos(int cantidadFotos) {
        this.cantidadFotos = cantidadFotos;
    }
    
    //Metodos
    public int obtenerVelocidadDescargaPlan()
    {
        try{
        switch(getPlan()) {
            case 1:
                return 3277;
            case 2:
                return 4096;
            case 3:
                return 8192;
            case 4:
                return 16384;
            case 5:
                return 24576;
            case 6:
                return 32768;
            default:
                return 0;
        }
        } catch(Exception e){
            return -1;
        }
   
    }
    
    public int obtenerPesoFormatoFoto()
    {
        try{
   switch(getIdFormatoFoto()) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 3;
            default:
                return 0;
        }  
   } catch(Exception e){
            return -1;
        }
    }
    
    

    public long obtenerPesoTotalaDescargar()
    {
        try{
        int pesoTotal = obtenerPesoFormatoFoto() * pesoMP * cantidadFotos * 1024;
    return pesoTotal;
    } catch(Exception e){
            return -1;
        }
    }
    
    public String obtenerTiempoDescarga()
    {
        try
        {
        long horaDescarga = Math.round(obtenerPesoTotalaDescargar()/obtenerVelocidadDescargaPlan()/3600); // calculo horas
        float a =(float)obtenerPesoTotalaDescargar();
        float b = (float)obtenerVelocidadDescargaPlan();
        float auxA = a/b/3600;
        float auxB = auxA - horaDescarga;
        int minutoDescarga = Math.round(auxB*60);
        String calculo = String.valueOf(horaDescarga) + ":" + String.valueOf(minutoDescarga);
    return calculo;
    } catch(Exception e){
            return "Error obteniendo datos";
        }
    }
    
    public String obtenerDatos()
    {
        try{
    StringBuilder sb = new StringBuilder();
    sb.append(obtenerTiempoDescarga());
    return sb.toString(); 
    } catch(Exception e){
            return "Error al obtener datos";
        }
    }
    
}




    /* 
    The long data type is a 64-bit two's complement integer. 
    The signed long has a minimum value of -263 and a maximum value of 263-1.
    In Java SE 8 and later, 
    you can use the long data type to represent an unsigned 64-bit long,
    which has a minimum value of 0 
    and a maximum value of 264-1. 
    Use this data type
    when you need a range of values wider
    than those provided by int.
    
    
    The Long class 
    also contains methods
    like compareUnsigned, 
    divideUnsigned 
    etc 
    to support arithmetic 
    operations for unsigned long.
    
    
    */

/*



float: 
The float data type 
is a single-precision 
32-bit IEEE 754 floating point.

Its range of values 
is beyond the scope of this discussion, 
but is specified 
in the Floating-Point Types, Formats,
and Values section of the Java Language Specification. 

As with the recommendations
for byte and short,
use a float (instead of double) 
if you need to save memory 
in large arrays
of floating point numbers.


This data type 
should never be used
for precise values, such as currency.
ESTE TIPO DE DATOS NO DEBE NUNCA SER USADO
PARA VALORES PRECISOS COMO DIVISAS



For that,
you will need to use 
the java.math.BigDecimal class instead. 


Numbers and Strings 
covers BigDecimal 
and other useful classes

provided by the Java platform.


*/