package com.ap.ap.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Usuario implements Serializable {
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
    private String UsuarioCode;

    public Usuario() {

    }

    public Usuario(Long id, String bannerlink, String nombre, String titulo, String imgLink, String resumen, String usuarioCode) {
        this.id = id;
        Bannerlink=bannerlink;
        Nombre = nombre;
        Titulo = titulo;
        ImgLink = imgLink;
        Resumen = resumen;
        UsuarioCode = usuarioCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBannerlink() {
        return Bannerlink;
    }

    public void setBannerlink(String bannerlink) {
        Bannerlink = bannerlink;
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

    public String getUsuarioCode() {
        return UsuarioCode;
    }

    public void setUsuarioCode(String usuarioCode) {
        UsuarioCode = usuarioCode;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Nombre='" + Nombre + '\'' +
                "Bannerlink='" + Bannerlink + '\'' +
                ", Titulo='" + Titulo + '\'' +
                ", ImgLink='" + ImgLink + '\'' +
                ", Resumen='" + Resumen + '\'' +
                ", UsuarioCode='" + UsuarioCode + '\'' +
                '}';
    }
}

