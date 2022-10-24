package com.ap.ap.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String Nombre;
    private Long Porcentaje;

    @Column(nullable = false, updatable = false)
    private String SkillCode;

    public Skills (){};

    public Skills(Long id, String nombre, Long porcentaje, String skillCode) {
        this.id = id;
        Nombre = nombre;
        Porcentaje = porcentaje;
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

    public Long getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(Long porcentaje) {
        Porcentaje = porcentaje;
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
                ", Porcentaje=" + Porcentaje +
                ", SkillCode='" + SkillCode + '\'' +
                '}';
    }
}

