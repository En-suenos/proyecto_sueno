package org.example.models;

import java.util.Date;

public class DetectorFacial {
    private Integer Id;
    private Usuario usuarioId;
    private String estadoDetectado;
    private Date fechaDeteccion;
    private Boolean confianza;

    public DetectorFacial(){

    }

    public DetectorFacial(Integer id, Usuario usuarioId, String estadoDetectado, Date fechaDeteccion, Boolean confianza) {
        Id = id;
        this.usuarioId = usuarioId;
        this.estadoDetectado = estadoDetectado;
        this.fechaDeteccion = fechaDeteccion;
        this.confianza = confianza;
    }

    public DetectorFacial(Usuario usuarioId, String estadoDetectado, Date fechaDeteccion, Boolean confianza) {
        this.usuarioId = usuarioId;
        this.estadoDetectado = estadoDetectado;
        this.fechaDeteccion = fechaDeteccion;
        this.confianza = confianza;
    }

    public DetectorFacial(Integer usuarioId, String estadoDetectado, Date fechaDeteccion, Boolean confianza) {
        this.usuarioId = new Usuario();//para trabajar con clases
        this.usuarioId.setId(usuarioId);

        this.estadoDetectado = estadoDetectado;
        this.fechaDeteccion = fechaDeteccion;
        this.confianza = confianza;
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

    public String getEstadoDetectado() {
        return estadoDetectado;
    }

    public void setEstadoDetectado(String estadoDetectado) {
        this.estadoDetectado = estadoDetectado;
    }

    public Date getFechaDeteccion() {
        return fechaDeteccion;
    }

    public void setFechaDeteccion(Date fechaDeteccion) {
        this.fechaDeteccion = fechaDeteccion;
    }

    public Boolean getConfianza() {
        return confianza;
    }

    public void setConfianza(Boolean confianza) {
        this.confianza = confianza;
    }
}
