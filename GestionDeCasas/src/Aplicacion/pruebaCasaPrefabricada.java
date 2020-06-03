
package Aplicacion;

import Libreria.*;
import java.util.ArrayList;

public class pruebaCasaPrefabricada {
    public static void main(String[] args) {
        // Datos Componentes
        int id_comp01=1;
        String nombre_comp01="Techo";
        int precio_comp01=100000;
        int id_comp02=2;
        String nombre_comp02="Muro Lateral";
        int precio_comp02=150000;
        int id_comp03=3;
        String nombre_comp03="Ventana Normal";
        int precio_comp03=80000;        
        int id_comp04=4;
        String nombre_comp04="Ventanal";
        int precio_comp04=200000;                
        int id_comp05=5;
        String nombre_comp05="Puerta Entrada";
        int precio_comp05=120000;                
        int id_comp06=6;
        String nombre_comp06="Puerta Cocina";
        int precio_comp06=120000; 
        int id_comp07=7;
        String nombre_comp07="Muro Interior Cocina";
        int precio_comp07=90000;         
        int id_comp08=8;
        String nombre_comp08="Muro Interior Habitacion";
        int precio_comp08=110000; 
        int id_comp09=9;
        String nombre_comp09="Puerta Interior Habitación";
        int precio_comp09=80000;        
        Componente oc01 = new Componente(id_comp01,nombre_comp01,precio_comp01);
        Componente oc02 = new Componente(id_comp01,nombre_comp01,precio_comp01);
        Componente oc03 = new Componente(id_comp02,nombre_comp02,precio_comp02);        
        Componente oc04 = new Componente(id_comp02,nombre_comp02,precio_comp02);        
        Componente oc05 = new Componente(id_comp02,nombre_comp02,precio_comp02);        
        Componente oc06 = new Componente(id_comp02,nombre_comp02,precio_comp02);                
        Componente oc07 = new Componente(id_comp03,nombre_comp03,precio_comp03);                
        Componente oc08 = new Componente(id_comp03,nombre_comp03,precio_comp03);                
        Componente oc09 = new Componente(id_comp03,nombre_comp03,precio_comp03);                
        Componente oc10 = new Componente(id_comp03,nombre_comp03,precio_comp03);
        Componente oc11 = new Componente(id_comp04,nombre_comp04,precio_comp04);
        Componente oc12 = new Componente(id_comp05,nombre_comp05,precio_comp05);
        Componente oc13 = new Componente(id_comp06,nombre_comp06,precio_comp06);
        Componente oc14 = new Componente(id_comp07,nombre_comp07,precio_comp07);        
        Componente oc15 = new Componente(id_comp07,nombre_comp07,precio_comp07);                
        Componente oc16 = new Componente(id_comp08,nombre_comp08,precio_comp08);
        Componente oc17 = new Componente(id_comp08,nombre_comp08,precio_comp08);        
        Componente oc18 = new Componente(id_comp09,nombre_comp09,precio_comp09);                
        // Datos Casa Prefabricada
        int numero=1;
        String nombre="Casa Básica";
        ArrayList<Componente> listaComponentes = new ArrayList<>();
        listaComponentes.add(oc01);
        listaComponentes.add(oc02);
        listaComponentes.add(oc03);
        listaComponentes.add(oc04);
        listaComponentes.add(oc05);
        listaComponentes.add(oc06);
        listaComponentes.add(oc07);
        listaComponentes.add(oc08);
        listaComponentes.add(oc09);
        listaComponentes.add(oc10);
        listaComponentes.add(oc11);
        listaComponentes.add(oc12);
        listaComponentes.add(oc13);
        listaComponentes.add(oc14);
        listaComponentes.add(oc15);
        listaComponentes.add(oc16);
        listaComponentes.add(oc17);
        listaComponentes.add(oc18);
        
        CasaPrefabricada ocp = new CasaPrefabricada(numero,nombre,listaComponentes);
        
        mostrarDatos(ocp);
    }
    public static void mostrarDatos(CasaPrefabricada ocp){
        System.out.println(ocp.obtenerDatos());
    }
}
