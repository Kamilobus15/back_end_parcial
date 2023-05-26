package com.example.camilo_bustos.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Libro {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String referencia;
    private String autor;
    private float precio;
    private String ubicación;


    

    public Libro() {
    }

    




    public Libro(Long id, String titulo, String referencia, String autor, float precio, String ubicación) {
        this.id = id;
        this.titulo = titulo;
        this.referencia = referencia;
        this.autor = autor;
        this.precio = precio;
        this.ubicación = ubicación;
    }



    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getUbicación() {
        return ubicación;
    }
    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    

}
