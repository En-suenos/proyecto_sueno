package org.example.models;

import java.sql.Time;
import java.util.Date;

public class RegistroSueno {
    private Integer Id;
    private Usuario usuarioId;
    private Date fecha_inicio;
    private Time horaInicio;
    private Time horaDespertar;
    private Double duracionTotal;
    private String calidadEstimada;
    private String notas;

    public RegistroSueno(){

    }

    public RegistroSueno(Integer id, Usuario usuarioId, Date fecha_inicio, Time horaInicio, Time horaDespertar, Double duracionTotal, String calidadEstimada, String notas) {
        Id = id;
        this.usuarioId = usuarioId;
        this.fecha_inicio = fecha_inicio;
        this.horaInicio = horaInicio;
        this.horaDespertar = horaDespertar;
        this.duracionTotal = duracionTotal;
        this.calidadEstimada = calidadEstimada;
        this.notas = notas;
    }

    public RegistroSueno(Usuario usuarioId, Date fecha_inicio, Time horaInicio, Time horaDespertar, Double duracionTotal, String calidadEstimada, String notas) {
        this.usuarioId = usuarioId;
        this.fecha_inicio = fecha_inicio;
        this.horaInicio = horaInicio;
        this.horaDespertar = horaDespertar;
        this.duracionTotal = duracionTotal;
        this.calidadEstimada = calidadEstimada;
        this.notas = notas;
    }

    public RegistroSueno(Integer usuarioId, Date fecha_inicio, Time horaInicio, Time horaDespertar, Double duracionTotal, String calidadEstimada, String notas) {
        this.usuarioId=new Usuario();
        this.usuarioId.setId(usuarioId);
        this.fecha_inicio = fecha_inicio;
        this.horaInicio = horaInicio;
        this.horaDespertar = horaDespertar;
        this.duracionTotal = duracionTotal;
        this.calidadEstimada = calidadEstimada;
        this.notas = notas;
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

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Time getHoraDespertar() {
        return horaDespertar;
    }

    public void setHoraDespertar(Time horaDespertar) {
        this.horaDespertar = horaDespertar;
    }

    public Double getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(Double duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    public String getCalidadEstimada() {
        return calidadEstimada;
    }

    public void setCalidadEstimada(String calidadEstimada) {
        this.calidadEstimada = calidadEstimada;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
