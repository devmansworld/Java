
package Libreria;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CuentaAhorro {
    // Atributos
    private String numero;
    private Date fecha;
    private int saldo;
    private Titular titular;
    // Constructores
    public CuentaAhorro() { // Constructor por defecto
        numero="";
        fecha = new java.util.Date(); // Fecha y hora actual
        saldo=0;
        titular=new Titular();
    }
     public CuentaAhorro(String numero, Date fecha, int saldo, Titular titular) {
        this.numero = numero;
        this.fecha = fecha;
        this.saldo = saldo;
        this.titular= titular;        
    }  
    // Propiedades

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    // Métodos
    public int girar(int giro){
        try {
            if(saldo>=giro){
                saldo -= giro;
                return 1;
            } else {
                return 0;
            }
        } catch(Exception e) {
           return -1; 
        }
    }
    public boolean depositar(int deposito) {
        try {
            saldo += deposito;
            return true;
        }catch(Exception e) {
            return false;
        }
    }
   
    public String obtenerDatos() {
        String patronF="dd/MM/yyyy hh:mm:ss";
        String patronM="$ ###,###,###";
        DecimalFormat df = new DecimalFormat(patronM);
        SimpleDateFormat sdf = new SimpleDateFormat(patronF);
        StringBuilder sb = new StringBuilder();
        sb.append("Número\t: ").append(numero).append("\n");
        sb.append("Fecha\t: ").append(sdf.format(fecha)).append("\n");
        sb.append("Saldo\t: ").append(df.format(saldo)).append("\n");
        sb.append(titular.obtenerDatos()).append("\n");        
        return sb.toString();
    }
}
