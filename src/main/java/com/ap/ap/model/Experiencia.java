package com.ap.ap.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String Nombre;
    private String Empresa;
    private String Resumen;
    private Long Fecha;
    private String Descripcion;
    private String ImgUrl;
    @Column(nullable = false, updatable = false)
    private String ExperienciaCode;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, String empresa, String resumen, Long fecha, String descripcion, String imgUrl, String experienciaCode) {
        this.id = id;
        Nombre = nombre;
        Empresa = empresa;
        Resumen = resumen;
        Fecha = fecha;
        Descripcion = descripcion;
        ImgUrl = imgUrl;
        ExperienciaCode = experienciaCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String resumen) {
        Resumen = resumen;
    }

    public Long getFecha() {
        return Fecha;
    }

    public void setFecha(Long fecha) {
        Fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public String getExperienciaCode() {
        return ExperienciaCode;
    }

    public void setExperienciaCode(String experienciaCode) {
        ExperienciaCode = experienciaCode;
    }

    @Override
    public String toString() {
        return "Experiencia{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Empresa='" + Empresa + '\'' +
                ", Resumen='" + Resumen + '\'' +
                ", Fecha=" + Fecha +
                ", Descripcion='" + Descripcion + '\'' +
                ", ImgUrl='" + ImgUrl + '\'' +
                ", ExperienciaCode='" + ExperienciaCode + '\'' +
                '}';
    }
}


