package mx.edu.utez.davebback.entity;

import java.util.Date;

import mx.edu.utez.davebback.validator.EmailFormat;

public class Estudiante {
    private long id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String matricula;
    private String gradoEstudio;
    private String escuela;
    private String telefono;
    
    @EmailFormat
    private String correo;
    
    private String beca;

    public Estudiante() {
    }

    public Estudiante(long id, String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento,
            String matricula, String gradoEstudio, String escuela, String telefono, String correo, String beca) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.matricula = matricula;
        this.gradoEstudio = gradoEstudio;
        this.escuela = escuela;
        this.telefono = telefono;
        this.correo = correo;
        this.beca = beca;
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

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getGradoEstudio() {
        return gradoEstudio;
    }

    public void setGradoEstudio(String gradoEstudio) {
        this.gradoEstudio = gradoEstudio;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }    
}
