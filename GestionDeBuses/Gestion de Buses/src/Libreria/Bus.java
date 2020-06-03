
package Libreria;

public class Bus implements IBus {
    // Atributos
    private String patente;
    private Asiento [][] listaAsientos;
    // Constructores
    public Bus() {
        this.patente = "";
        this.listaAsientos = new Asiento[5][6]; // fila, columna
    }
    public Bus(String patente, Asiento[][] listaAsientos) {
        this.patente = patente;
        this.listaAsientos = listaAsientos;
    }
    // Propiedades

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Asiento[][] getlistaAsientos() {
        return listaAsientos;
    }

    public void setListaAsientos(Asiento[][] listaAsientos) {
        this.listaAsientos = listaAsientos;
    }
    
    // Métodos

    @Override
    public int obtenerCantidadAsientosLibres(char tipo) {
        try {
            int cal=0;
            if(tipo=='V'){
                for(int f=0;f<listaAsientos[0].length;f+=4){
                    for(int c=0;c<listaAsientos[1].length;c++) {
                        if(listaAsientos[f][c].getTipo()=='O'){
                            cal++;
                        }
                    }
                }
            } else {
                cal=0;
                for(int f=1;f<listaAsientos[0].length-1;f+=2){
                    for(int c=0;c<listaAsientos[1].length;c++) {
                        if(listaAsientos[f][c].getTipo()=='O'){
                            cal++;
                        }
                    }
                } 
                if(listaAsientos[2][5].getTipo()=='O'){
                    cal++;
                }
            }
            return cal;
        } catch(Exception e){
            return -1;
        }
    }

    @Override
    public int obtenerCantidadAsientosOcupados(char tipo) {
        
        try {
            int cal=0;   
            if(tipo=='V'){
                for(int f=0;f<listaAsientos[0].length;f+=4){
                    for(int c=0;c<listaAsientos[1].length;c++) {
                        if(listaAsientos[f][c].getTipo()=='X'){
                            cal++;
                        }
                    }
                }
            } else {
                cal=0;
                for(int f=1;f<listaAsientos[0].length-1;f+=2){
                    for(int c=0;c<listaAsientos[1].length;c++) {
                        if(listaAsientos[f][c].getTipo()=='X'){
                            cal++;
                        }
                    }
                } 
                if(listaAsientos[2][5].getTipo()=='X'){
                    cal++;
                }
            }
            return cal;
        } catch(Exception e){
            return -1;
        }
    }
    public String obtenerDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patente\t: ").append(patente).append("\n");
        for(int f=0;f<listaAsientos[0].length-1;f++){
            for(int c=0;c<listaAsientos[1].length;c++) {
                sb.append(listaAsientos[f][c].getTipo()).append(" ");
            }
            sb.append("\n");
        }         
        return sb.toString();
    }
}
