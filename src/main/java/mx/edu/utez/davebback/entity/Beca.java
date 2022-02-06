package mx.edu.utez.davebback.entity;

public class Beca {
    
    private long id;
    private String nombre;
    private String descripción;
    private double monto;
    private String periodo;
    private String institución;

    public Beca() {
    }

    public Beca(long id, String nombre, String descripción, double monto, String periodo, String institución) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.monto = monto;
        this.periodo = periodo;
        this.institución = institución;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getInstitución() {
        return institución;
    }

    public void setInstitución(String institución) {
        this.institución = institución;
    }    
}

