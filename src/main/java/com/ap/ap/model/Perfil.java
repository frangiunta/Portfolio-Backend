package com.ap.ap.model;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Perfil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String titulo;
    private String imgLink;
    private String resumen;
    private String bannerlink;
    @Column(nullable = false,updatable = false)
    private String perfilCode;

    public Perfil() {

    }

    public Perfil(String nombre, String titulo, String imgLink, String resumen, String bannerlink, String perfilCode) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.imgLink = imgLink;
        this.resumen = resumen;
        this.bannerlink = bannerlink;
        this.perfilCode = perfilCode;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getBannerlink() {
        return bannerlink;
    }

    public void setBannerlink(String bannerlink) {
        this.bannerlink = bannerlink;
    }

    public String getPerfilCode() {
        return perfilCode;
    }

    public void setPerfilCode(String perfilCode) {
        this.perfilCode = perfilCode;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", titulo='" + titulo + '\'' +
                ", imgLink='" + imgLink + '\'' +
                ", resumen='" + resumen + '\'' +
                ", bannerlink='" + bannerlink + '\'' +
                ", perfilCode='" + perfilCode + '\'' +
                '}';
    }
}