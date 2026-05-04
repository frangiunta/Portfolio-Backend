package com.ap.ap.model;

import jakarta.persistence.*;
import java.io.Serializable;
@Entity
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String Nombre;
    private String Descripcion;

    @Column(nullable = false, updatable = false)
    private String SkillCode;

    public Skills (String descripcion){
        Descripcion = descripcion;
    };

    public Skills(Long id, String nombre, String Descripcion, String descripcion, String skillCode) {
        this.id = id;
        Nombre = nombre;
        this.Descripcion = descripcion;
        SkillCode = skillCode;
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

    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getSkillCode() {
        return SkillCode;
    }

    public void setSkillCode(String skillCode) {
        SkillCode = skillCode;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", SkillCode='" + SkillCode + '\'' +
                '}';
    }
}

