package com.ap.ap.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Experiencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ Soluciona el error de la secuencia en MySQL
    @Column(nullable = false, updatable = false)
    private Long id;

    // Convención de Java: Los atributos deben empezar con minúscula (camelCase)
    private String nombre;
    private String empresa;
    private String resumen;
    private Long fecha;
    private String descripcion;
    private String imgUrl;

    @Column(nullable = false, updatable = false)
    private String experienciaCode;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombre, String empresa, String resumen, Long fecha, String descripcion, String imgUrl, String experienciaCode) {
        this.id = id;
        this.nombre = nombre;
        this.empresa = empresa;
        this.resumen = resumen;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.imgUrl = imgUrl;
        this.experienciaCode = experienciaCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Long getFecha() {
        return fecha;
    }

    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getExperienciaCode() {
        return experienciaCode;
    }

    public void setExperienciaCode(String experienciaCode) {
        this.experienciaCode = experienciaCode;
    }

    @Override
    public String toString() {
        return "Experiencia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", empresa='" + empresa + '\'' +
                ", resumen='" + resumen + '\'' +
                ", fecha=" + fecha +
                ", descripcion='" + descripcion + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", experienciaCode='" + experienciaCode + '\'' +
                '}';
    }
}