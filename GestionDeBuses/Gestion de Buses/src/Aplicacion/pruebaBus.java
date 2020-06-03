/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Libreria.*;

/**
 *
 * @author bellavista
 */
public class pruebaBus {
    public static void main(String[] args) {
        // Datos de los asientos
        int numero00=0;
        char asiento00='P';
        int numero01=1;
        char asiento01='X';        
        int numero02=3;
        char asiento02='X';  
        int numero03=5;
        char asiento03='O'; 
        int numero04=7;
        char asiento04='X';        
        int numero05=9;
        char asiento05='X'; 
        int numero10=0;
        char asiento10='P';
        int numero11=2;
        char asiento11='X';        
        int numero12=4;
        char asiento12='O';  
        int numero13=6;
        char asiento13='X'; 
        int numero14=8;
        char asiento14='X';        
        int numero15=10;
        char asiento15='O'; 
        int numero20=0;
        char asiento20='P';
        int numero21=0;
        char asiento21='P';        
        int numero22=0;
        char asiento22='P';  
        int numero23=0;
        char asiento23='P'; 
        int numero24=0;
        char asiento24='P';        
        int numero25=11;
        char asiento25='X'; 
        int numero30=0;
        char asiento30='C';
        int numero31=13;
        char asiento31='X';        
        int numero32=15;
        char asiento32='X';  
        int numero33=17;
        char asiento33='X'; 
        int numero34=19;
        char asiento34='X';        
        int numero35=21;
        char asiento35='X'; 
        int numero40=0;
        char asiento40='C';
        int numero41=14;
        char asiento41='X';        
        int numero42=16;
        char asiento42='O';  
        int numero43=18;
        char asiento43='O'; 
        int numero44=20;
        char asiento44='X';        
        int numero45=22;
        char asiento45='O';   
        Asiento oa00 = new Asiento(numero00,asiento00);
        Asiento oa01 = new Asiento(numero01,asiento01);
        Asiento oa02 = new Asiento(numero02,asiento02);
        Asiento oa03 = new Asiento(numero03,asiento03);
        Asiento oa04 = new Asiento(numero04,asiento04);
        Asiento oa05 = new Asiento(numero05,asiento05);        
        Asiento oa10 = new Asiento(numero10,asiento10);
        Asiento oa11 = new Asiento(numero11,asiento11);
        Asiento oa12 = new Asiento(numero12,asiento12);
        Asiento oa13 = new Asiento(numero13,asiento13);
        Asiento oa14 = new Asiento(numero14,asiento14);
        Asiento oa15 = new Asiento(numero15,asiento15);        
        Asiento oa20 = new Asiento(numero20,asiento20);
        Asiento oa21 = new Asiento(numero21,asiento21);
        Asiento oa22 = new Asiento(numero22,asiento22);
        Asiento oa23 = new Asiento(numero23,asiento23);
        Asiento oa24 = new Asiento(numero24,asiento24);
        Asiento oa25 = new Asiento(numero25,asiento25);        
        Asiento oa30 = new Asiento(numero30,asiento30);
        Asiento oa31 = new Asiento(numero31,asiento31);
        Asiento oa32 = new Asiento(numero32,asiento32);
        Asiento oa33 = new Asiento(numero33,asiento33);
        Asiento oa34 = new Asiento(numero34,asiento34);
        Asiento oa35 = new Asiento(numero35,asiento35);        
        Asiento oa40 = new Asiento(numero40,asiento40);
        Asiento oa41 = new Asiento(numero41,asiento41);
        Asiento oa42 = new Asiento(numero42,asiento42);
        Asiento oa43 = new Asiento(numero43,asiento43);
        Asiento oa44 = new Asiento(numero44,asiento44);        
        Asiento oa45 = new Asiento(numero45,asiento45);                
        Asiento [][] listaAsientos = 
        {
            {oa00,oa01,oa02,oa03,oa04,oa05},
            {oa10,oa11,oa12,oa13,oa14,oa15},
            {oa20,oa21,oa22,oa23,oa24,oa25},
            {oa30,oa31,oa32,oa33,oa34,oa35},
            {oa40,oa41,oa42,oa43,oa44,oa45},            
        };
        String patente="XX-KK16";
        Bus ob = new Bus(patente, listaAsientos);
        
        mostrarDatos(ob);
        
        System.out.println("Cantidad Asientos Libres Ventana\t: " 
                + ob.obtenerCantidadAsientosLibres('V'));
        System.out.println("Cantidad Asientos Libres Pasillo\t: " 
                + ob.obtenerCantidadAsientosLibres('P'));        
        System.out.println("Cantidad Asientos Ocupados Ventana\t: " 
                + ob.obtenerCantidadAsientosOcupados('V'));
        System.out.println("Cantidad Asientos Ocupados Pasillo\t: " 
                + ob.obtenerCantidadAsientosOcupados('P'));                
    }
    public static void mostrarDatos(Bus ob) {
        System.out.println(ob.obtenerDatos());
    }
}
