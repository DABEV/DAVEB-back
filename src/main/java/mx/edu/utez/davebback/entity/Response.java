package mx.edu.utez.davebback.entity;

public class Response {
    private int estatus;
    private String título;
    private String mensaje;

    public Response() {
    }

    public Response(int estatus, String título, String mensaje) {
        this.estatus = estatus;
        this.título = título;
        this.mensaje = mensaje;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }    
}
