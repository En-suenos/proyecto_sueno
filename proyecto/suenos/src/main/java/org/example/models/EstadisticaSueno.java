package org.example.models;

import java.util.Date;

public class EstadisticaSueno {
    private Integer Id;
    private Usuario usuarioId;
    private String periodo;
    private Date fechaInicio;
    private Date fechaFin;
    private Double promedioHoras;
    private String calidadPromedio;
    private Integer diasRegistrados;

    public EstadisticaSueno(){

    }

    public EstadisticaSueno(Integer id, Usuario usuarioId, String periodo, Date fechaInicio, Date fechaFin, Double promedioHoras, String calidadPromedio, Integer diasRegistrados) {
        Id = id;
        this.usuarioId = usuarioId;
        this.periodo = periodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.promedioHoras = promedioHoras;
        this.calidadPromedio = calidadPromedio;
        this.diasRegistrados = diasRegistrados;
    }

    public EstadisticaSueno(Usuario usuarioId, String periodo, Date fechaInicio, Date fechaFin, Double promedioHoras, String calidadPromedio, Integer diasRegistrados) {
        this.usuarioId = usuarioId;
        this.periodo = periodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.promedioHoras = promedioHoras;
        this.calidadPromedio = calidadPromedio;
        this.diasRegistrados = diasRegistrados;
    }

    public EstadisticaSueno(Integer usuarioId, String periodo, Date fechaInicio, Date fechaFin, Double promedioHoras, String calidadPromedio, Integer diasRegistrados) {
        this.usuarioId = new Usuario();//para trabajar con clases
        this.usuarioId.setId(usuarioId);

        this.periodo = periodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.promedioHoras = promedioHoras;
        this.calidadPromedio = calidadPromedio;
        this.diasRegistrados = diasRegistrados;
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
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

    public Double getPromedioHoras() {
        return promedioHoras;
    }

    public void setPromedioHoras(Double promedioHoras) {
        this.promedioHoras = promedioHoras;
    }

    public String getCalidadPromedio() {
        return calidadPromedio;
    }

    public void setCalidadPromedio(String calidadPromedio) {
        this.calidadPromedio = calidadPromedio;
    }

    public Integer getDiasRegistrados() {
        return diasRegistrados;
    }

    public void setDiasRegistrados(Integer diasRegistrados) {
        this.diasRegistrados = diasRegistrados;
    }
}
