package org.example.models;

import java.util.Date;

public class AsistenteIA {
    private Integer Id;
    private Usuario usuarioId;
    private String sugerencia;
    private Date fechaGeneracion;
    private Boolean leida;

    public AsistenteIA(){

    }

    public AsistenteIA(Integer id, Usuario usuarioId, String sugerencia, Date fechaGeneracion, Boolean leida) {
        Id = id;
        this.usuarioId = usuarioId;
        this.sugerencia = sugerencia;
        this.fechaGeneracion = fechaGeneracion;
        this.leida = leida;
    }

    public AsistenteIA(Usuario usuarioId, String sugerencia, Date fechaGeneracion, Boolean leida) {
        this.usuarioId = usuarioId;
        this.sugerencia = sugerencia;
        this.fechaGeneracion = fechaGeneracion;
        this.leida = leida;
    }

    public AsistenteIA(Integer usuarioId, String sugerencia, Date fechaGeneracion, Boolean leida) {
        this.usuarioId = new Usuario();//para trabajar con clases
        this.usuarioId.setId(usuarioId);

        this.sugerencia = sugerencia;
        this.fechaGeneracion = fechaGeneracion;
        this.leida = leida;
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

    public String getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(String sugerencia) {
        this.sugerencia = sugerencia;
    }

    public Date getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(Date fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public Boolean getLeida() {
        return leida;
    }

    public void setLeida(Boolean leida) {
        this.leida = leida;
    }
}
