
package Libreria;


public class Conversor implements IConversor {
    // Atributos
    private int valorPeso;
    // Constructores
    public Conversor() {
        this.valorPeso = 0;
    }
    public Conversor(int valorPeso) {
        this.valorPeso = valorPeso;
    }
    // Propiedades

    public int getValorPeso() {
        return valorPeso;
    }

    public void setValorPeso(int valorPeso) {
        this.valorPeso = valorPeso;
    }
    // Métodos

    @Override
    public float obtenerValorResultante(int tipoMoneda) {
        try {
            switch(tipoMoneda){
                case 1:
                    return valorPeso / IConversor.DOLAR;
                case 2:
                    return valorPeso / IConversor.UF;                    
                default:
                    return valorPeso / IConversor.UTM;                    
            }
        } catch(Exception e) {
            return -1.0F;
        }
    }
    
}
