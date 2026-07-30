package com.ap.ap.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false, updatable = false)
    private String skillCode;

    // JPA requires a no-arg constructor
    public Skills() {
    }

    public Skills(String nombre, String descripcion, String skillCode) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.skillCode = skillCode;
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

    public String getSkillCode() {
        return skillCode;
    }

    public void setSkillCode(String skillCode) {
        this.skillCode = skillCode;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", skillCode='" + skillCode + '\'' +
                '}';
    }
}