package com.ap.ap.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String descripcion;
    private String resumen;
    private String imglink;
    private String gitlink;
    @Column(nullable = false, updatable = false)
    private String ProyectoCode;

    public Proyectos() {
    }

    public Proyectos(Long id, String nombre, String descripcion, String resumen, String imglink, String gitlink, String proyectoCode) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.resumen = resumen;
        this.imglink = imglink;
        this.gitlink = gitlink;
        ProyectoCode = proyectoCode;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getImglink() {
        return imglink;
    }

    public void setImglink(String imglink) {
        this.imglink = imglink;
    }

    public String getGitlink() {
        return gitlink;
    }

    public void setGitlink(String gitlink) {
        this.gitlink = gitlink;
    }

    public String getProyectoCode() {
        return ProyectoCode;
    }

    public void setProyectoCode(String proyectoCode) {
        ProyectoCode = proyectoCode;
    }

    @Override
    public String toString() {
        return "Proyectos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", resumen='" + resumen + '\'' +
                ", imglink='" + imglink + '\'' +
                ", gitlink='" + gitlink + '\'' +
                ", ProyectoCode='" + ProyectoCode + '\'' +
                '}';
    }
}