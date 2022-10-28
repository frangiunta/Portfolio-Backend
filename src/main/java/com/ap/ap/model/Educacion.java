package com.ap.ap.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String Titulo;
    private String Institucion;
    private Long Fecha;
    private String imgUrl;
    @Column(nullable = false, updatable = false)
    private String EducacionCode;

    public Educacion() {}

    public Educacion(Long id, String titulo, String institucion, Long fecha, String imgUrl, String educacionCode) {
        this.id = id;
        Titulo = titulo;
        Institucion = institucion;
        Fecha = fecha;
        this.imgUrl = imgUrl;
        EducacionCode = educacionCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String institucion) {
        Institucion = institucion;
    }

    public Long getFecha() {
        return Fecha;
    }

    public void setFecha(Long fecha) {
        Fecha = fecha;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getEducacionCode() {
        return EducacionCode;
    }

    public void setEducacionCode(String educacionCode) {
        EducacionCode = educacionCode;
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "id=" + id +
                ", Titulo='" + Titulo + '\'' +
                ", Institucion='" + Institucion + '\'' +
                ", Fecha=" + Fecha +
                ", imgUrl='" + imgUrl + '\'' +
                ", EducacionCode='" + EducacionCode + '\'' +
                '}';
    }
}