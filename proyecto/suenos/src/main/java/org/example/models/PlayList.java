package org.example.models;

import java.util.Date;

public class PlayList {
    private Integer Id;
    private Usuario usuarioId;
    private String nombre;
    private Integer temporizador;
    private Date fechaCreacion;

    public PlayList(){

    }

    public PlayList(Integer id, Usuario usuarioId, String nombre, Integer temporizador, Date fechaCreacion) {
        Id = id;
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.temporizador = temporizador;
        this.fechaCreacion = fechaCreacion;
    }

    public PlayList(Usuario usuarioId, String nombre, Integer temporizador, Date fechaCreacion) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.temporizador = temporizador;
        this.fechaCreacion = fechaCreacion;
    }

    public PlayList(Integer usuarioId, String nombre, Integer temporizador, Date fechaCreacion) {
        this.usuarioId = new Usuario();//para trabajar con clases
        this.usuarioId.setId(usuarioId);

        this.nombre = nombre;
        this.temporizador = temporizador;
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTemporizador() {
        return temporizador;
    }

    public void setTemporizador(Integer temporizador) {
        this.temporizador = temporizador;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
