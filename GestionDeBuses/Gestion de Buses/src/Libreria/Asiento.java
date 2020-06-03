
package Libreria;

public class Asiento {
    // Atributos
    private int numero;
    private char tipo;
    // Constructores
    public Asiento() {
        this.numero = 0;
        this.tipo = ' ';
    }
    public Asiento(int numero, char tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    // Propiedades

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    // Métodos
    public String obtenerDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número\t: ").append(numero).append("\n");
        sb.append("Tipo\t: ").append((tipo=='P'?"Pasillo":"Ventana")).append("\n");        
        return sb.toString();
    }
}
