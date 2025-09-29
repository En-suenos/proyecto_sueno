package org.example.models;

public class Sonido {
    private Integer Id;
    private String nombre;
    private String categoria;
    private String archivoAudio;
    private Double duracion;
    //private

    public Sonido(){

    }

    public Sonido(Integer id, String nombre, String categoria, String archivoAudio, Double duracion) {
        Id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.archivoAudio = archivoAudio;
        this.duracion = duracion;
    }

    public Sonido(String nombre, String categoria, String archivoAudio, Double duracion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.archivoAudio = archivoAudio;
        this.duracion = duracion;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getArchivoAudio() {
        return archivoAudio;
    }

    public void setArchivoAudio(String archivoAudio) {
        this.archivoAudio = archivoAudio;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
}
