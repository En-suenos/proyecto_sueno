package org.example.models;

import java.util.Date;

public class Suscripcion {
    private Integer Id;
    private Usuario usurarioId;
    private String tipoPlan;
    private Date fechaInicio;
    private Date fechaFin;
    private Boolean activa;

    public Suscripcion(){

    }

    public Suscripcion(Integer id, Usuario usurarioId, String tipoPlan, Date fechaInicio, Date fechaFin, Boolean activa) {
        Id = id;
        this.usurarioId = usurarioId;
        this.tipoPlan = tipoPlan;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activa = activa;
    }

    public Suscripcion(Usuario usurarioId, String tipoPlan, Date fechaInicio, Date fechaFin, Boolean activa) {
        this.usurarioId = usurarioId;
        this.tipoPlan = tipoPlan;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activa = activa;
    }

    public Suscripcion(Integer usurarioId, String tipoPlan, Date fechaInicio, Date fechaFin, Boolean activa) {
        this.usurarioId = new Usuario();//para trabajar con clases
        this.usurarioId.setId(usurarioId);

        this.tipoPlan = tipoPlan;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activa = activa;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Usuario getUsurarioId() {
        return usurarioId;
    }

    public void setUsurarioId(Usuario usurarioId) {
        this.usurarioId = usurarioId;
    }

    public String getTipoPlan() {
        return tipoPlan;
    }

    public void setTipoPlan(String tipoPlan) {
        this.tipoPlan = tipoPlan;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Boolean getActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }
}
