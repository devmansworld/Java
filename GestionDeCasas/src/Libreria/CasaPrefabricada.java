package Libreria;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CasaPrefabricada implements ICasaPrefabricada{
    // Atributos
    private int numero;
    private String nombre;
    private ArrayList<Componente> listaComponentes;
    // Constructores
    public CasaPrefabricada() {
        this.numero = 0;
        this.nombre = "";
        this.listaComponentes = new ArrayList<>();
    }
    public CasaPrefabricada(int numero, String nombre, ArrayList<Componente> listaComponentes) {
        this.numero = numero;
        this.nombre = nombre;
        this.listaComponentes = listaComponentes;
    }
    // Propiedades

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Componente> getListaComponentes() {
        return listaComponentes;
    }

    public void setListaComponentes(ArrayList<Componente> listaComponentes) {
        this.listaComponentes = listaComponentes;
    }
    // Métodos
    public boolean agregarComponente(Componente componente){
        try {
            listaComponentes.add(componente);
            return true;
        }catch(Exception e) {
            return false;
        }
    }
    public int eliminarComponente(int id_comp){
        try {
            for(Componente e : listaComponentes){
                if(e.getId_comp()==id_comp){
                    listaComponentes.remove(e);
                    return 1; // Eliminado
                }
            }
            return 0; // No eliminado
        } catch(Exception e) {
            return -1;
        }        
    }
    @Override
    public int obtenerPrecioFinal(){
        try {
            int precio=0;
            for(Componente e : listaComponentes){
                precio += e.getPrecio();
            } 
            return precio;
        } catch(Exception e){
            return -1;
        }
    }
    public String obtenerDatos() {
        String patronN = "$ ###,###,###";
        DecimalFormat odf = new DecimalFormat(patronN);
        StringBuilder sb = new StringBuilder();
        sb.append("Datos Casa Prefabricada").append("\n");
        sb.append("Número\t: ").append(numero).append("\n");
        sb.append("Nombre\t: ").append(nombre).append("\n");
        sb.append("Precio\t: ").append(odf.format(obtenerPrecioFinal())).append("\n");        
        sb.append("Datos Componetes Casa").append("\n");        
        for(Componente e : listaComponentes){
            sb.append(e.obtenerDatos()).append("\n");                
        }
        return sb.toString();
    }    
}
