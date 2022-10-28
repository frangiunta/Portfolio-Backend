package com.ap.ap.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Perfil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String Nombre;
    private String Titulo;
    private String ImgLink;
    private String Resumen;
    private String Bannerlink;
@Column(nullable = false,updatable = false)
    private String PerfilCode;

    public Perfil() {

    }

    public Perfil(Long id, String nombre, String titulo, String imgLink, String resumen, String bannerlink, String perfilCode) {
        this.id = id;
        Nombre = nombre;
        Titulo = titulo;
        ImgLink = imgLink;
        Resumen = resumen;
        Bannerlink = bannerlink;
        PerfilCode = perfilCode;
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

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getImgLink() {
        return ImgLink;
    }

    public void setImgLink(String imgLink) {
        ImgLink = imgLink;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String resumen) {
        Resumen = resumen;
    }

    public String getBannerlink() {
        return Bannerlink;
    }

    public void setBannerlink(String bannerlink) {
        Bannerlink = bannerlink;
    }

    public String getPerfilCode() {
        return PerfilCode;
    }

    public void setPerfilCode(String perfilCode) {
        PerfilCode = perfilCode;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", ImgLink='" + ImgLink + '\'' +
                ", Resumen='" + Resumen + '\'' +
                ", Bannerlink='" + Bannerlink + '\'' +
                ", PerfilCode='" + PerfilCode + '\'' +
                '}';
    }
}

