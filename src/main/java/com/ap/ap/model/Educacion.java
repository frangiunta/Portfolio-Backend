package com.ap.ap.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "educacion")
public class Educacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String institucion;

    private Long fecha;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "educacion_code", nullable = false, updatable = false)
    private String educacionCode;

    // Constructor vacío (requerido por JPA)
    public Educacion() {}

    // Constructor sin ID (para crear nuevos registros)
    public Educacion(String titulo, String institucion, Long fecha, String imgUrl, String educacionCode) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.fecha = fecha;
        this.imgUrl = imgUrl;
        this.educacionCode = educacionCode;
    }

    // Constructor completo con ID (para pruebas o mapeos específicos)
    public Educacion(Long id, String titulo, String institucion, Long fecha, String imgUrl, String educacionCode) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.fecha = fecha;
        this.imgUrl = imgUrl;
        this.educacionCode = educacionCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Long getFecha() {
        return fecha;
    }

    public void setFecha(Long fecha) {
        this.fecha = fecha;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getEducacionCode() {
        return educacionCode;
    }

    public void setEducacionCode(String educacionCode) {
        this.educacionCode = educacionCode;
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", institucion='" + institucion + '\'' +
                ", fecha=" + fecha +
                ", imgUrl='" + imgUrl + '\'' +
                ", educacionCode='" + educacionCode + '\'' +
                '}';
    }
}