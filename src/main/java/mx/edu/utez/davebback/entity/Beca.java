package mx.edu.utez.davebback.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

import mx.edu.utez.davebback.validator.DescriptionFormat;
import mx.edu.utez.davebback.validator.NameFormat;
import mx.edu.utez.davebback.validator.ParagraphFormat;

public class Beca {
    
    private long id;

    @NotBlank
    @NotNull
    @DescriptionFormat
    @Size(max = 45)
    private String nombre;

    @NotBlank
    @NotNull
    @ParagraphFormat
    @Size(max = 150)
    private String descripcion;

    @NotNull
    @Min(1)
    @NumberFormat(pattern = "^([0-9]{1,})([\\.]{0,1})([0-9]{1,2})$")
    private double monto;

    @NotBlank
    @NotNull
    @NameFormat
    @Size(max = 45)
    private String periodo;

    @NotBlank
    @NotNull
    @NameFormat
    @Size(max = 45)
    private String institucion;

    public Beca() {
    }

    public Beca(long id, String nombre, String descripcion, double monto, String periodo, String institucion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.monto = monto;
        this.periodo = periodo;
        this.institucion = institucion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }    
}

