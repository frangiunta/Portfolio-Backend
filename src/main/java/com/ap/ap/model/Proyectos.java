package com.ap.ap.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "proyectos")
public class Proyectos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ✅ Evita la búsqueda de secuencias en MySQL
    @Column(nullable = false, updatable = false)
    private Long id;

    private String nombre;

    @Column(columnDefinition = "TEXT") // Recomendado si la descripción es larga
    private String descripcion;
    @Column(columnDefinition = "TEXT")
    private String resumen;

    @Column(name = "img_link")
    private String imgLink;

    @Column(name = "git_link")
    private String gitLink;

    @Column(name = "proyecto_code", nullable = false, updatable = false)
    private String proyectoCode; // ✅ Corregido a camelCase

    // Constructor vacío requerido por JPA
    public Proyectos() {}

    // Constructor sin ID (útil para crear nuevos registros)
    public Proyectos(String nombre, String descripcion, String resumen, String imgLink, String gitLink, String proyectoCode) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.resumen = resumen;
        this.imgLink = imgLink;
        this.gitLink = gitLink;
        this.proyectoCode = proyectoCode;
    }

    // Constructor completo con ID
    public Proyectos(Long id, String nombre, String descripcion, String resumen, String imgLink, String gitLink, String proyectoCode) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.resumen = resumen;
        this.imgLink = imgLink;
        this.gitLink = gitLink;
        this.proyectoCode = proyectoCode;
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

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getGitLink() {
        return gitLink;
    }

    public void setGitLink(String gitLink) {
        this.gitLink = gitLink;
    }

    public String getProyectoCode() {
        return proyectoCode;
    }

    public void setProyectoCode(String proyectoCode) {
        this.proyectoCode = proyectoCode;
    }

    @Override
    public String toString() {
        return "Proyectos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", resumen='" + resumen + '\'' +
                ", imgLink='" + imgLink + '\'' +
                ", gitLink='" + gitLink + '\'' +
                ", proyectoCode='" + proyectoCode + '\'' +
                '}';
    }
}