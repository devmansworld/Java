package Aplicacion;

import Libreria.*; // Significa que puede utilizar todas las clases de Libreria si lo requiriese.
import java.util.Date;

public class pruebaCuentaAhorro {
    public static void main(String[] args) {
        // Datos del titular
        String run="11111111-1";
        String nombre="Juan";
        String appat="Diaz";
        String apmat="Flores";
        // Instanciar un objeto ot de la clase Titular
        Titular ot = new Titular();
        // Asignamos los valores al objeto ot 
        // a través de las propiedades
        ot.setRun(run);
        ot.setNombre(nombre);
        ot.setAppat(appat);
        ot.setApmat(apmat);
        // Datos de la cuenta de Ahorro
        String numero="1";
        Date fecha= new java.util.Date();
        int saldo=100000;
        // Datos de movimientos
        int giro=250000;
        int deposito=200000;
        
        // Instanciar un objeto oca de la clase CuentaAhorro
        CuentaAhorro oca = new CuentaAhorro();
        // Asignamos los valores al objeto oca 
        // a través de las propiedades
        oca.setNumero(numero);
        oca.setFecha(fecha);
        oca.setSaldo(saldo);
        oca.setTitular(ot);
        
        mostrarDatos(oca);
        
        // Simula movimiento DEPOSITO
        if(oca.depositar(deposito)){
            System.out.println("Deposito se ha efectudo exitosamente ...");
        } else {
            System.out.println("Deposito no se efectuo, reintente ...");
        }
        
        mostrarDatos(oca);
        
        // Simula movimiento GIRO exitoso
        switch(oca.girar(giro)){
            case 0:
                System.out.println("Saldo insuficiente para efectuar giro ...");
                break;
            case 1:
                System.out.println("Giro se ha efectuado exitosamente ...");
                break;                
            default:
                System.out.println("Giro NO se ha efectuado, reintente ...");
                break;                
        }
       
        mostrarDatos(oca);
        
        // Simula movimiento GIRO, con saldo insuficiente.
        switch(oca.girar(giro)){
            case 0:
                System.out.println("Saldo insuficiente para efectuar giro ...");
                break;
            case 1:
                System.out.println("Giro se ha efectuado exitosamente ...");
                break;                
            default:
                System.out.println("Giro NO se ha efectuado, reintente ...");
                break;                              
        }
       
        mostrarDatos(oca);        
    }
    public static void mostrarDatos(CuentaAhorro oca){
        System.out.println(oca.obtenerDatos());
    }
}
