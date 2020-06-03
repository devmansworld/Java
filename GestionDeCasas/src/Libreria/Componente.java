
package Libreria;

import java.text.DecimalFormat;

public class Componente {
    // Atributos
    private int id_comp;
    private String nombre;
    private int precio;
    // Constructores
    public Componente() {
        this.id_comp = 0;
        this.nombre = "";
        this.precio = 0;
    }
    public Componente(int id_comp, String nombre, int precio) {
        this.id_comp = id_comp;
        this.nombre = nombre;
        this.precio = precio;
    }
    // Propiedades

    public int getId_comp() {
        return id_comp;
    }

    public void setId_comp(int id_comp) {
        this.id_comp = id_comp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    // Métodos
    public String obtenerDatos() {
        String patronN = "$ ###,###,###";
        DecimalFormat odf = new DecimalFormat(patronN);
        StringBuilder sb = new StringBuilder();
        sb.append("Id Componente\t: ").append(id_comp).append("\n");
        sb.append("Nombre\t: ").append(nombre).append("\n");
        sb.append("Precio\t: ").append(odf.format(precio)).append("\n");        
        return sb.toString();
    }
    
}
