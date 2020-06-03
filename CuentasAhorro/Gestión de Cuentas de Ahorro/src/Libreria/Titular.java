package Libreria;

public class Titular {
    // Atributos
    private String run;
    private String nombre;
    private String appat;
    private String apmat;
    // Constructores
    public Titular() {
        run="";
        nombre="";
        appat="";
        apmat="";
    }
    public Titular(String run, String nombre, String appat, String apmat) {
        this.run = run;
        this.nombre = nombre;
        this.appat = appat;
        this.apmat = apmat;
    }    
    // Propiedades
     public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }
   // Métodos
    public String obtenerDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("RUN\t: ").append(run).append("\n");
        sb.append("Nombre\t: ").append(nombre).append(" ").append(appat).append(" ").append(apmat).append("\n");
        return sb.toString();
    }
}
