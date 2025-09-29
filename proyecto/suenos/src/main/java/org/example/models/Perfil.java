package org.example.models;

public class Perfil {
    private Integer Id;
    private Usuario usuarioId;
    private String idioma;
    private Boolean notificaciones;
    private String tema;

    public Perfil(){

    }

    public Perfil(Integer id, Usuario usuarioId, String idioma, Boolean notificaciones, String tema) {
        Id = id;
        this.usuarioId = usuarioId;
        this.idioma = idioma;
        this.notificaciones = notificaciones;
        this.tema = tema;
    }

    public Perfil(Usuario usuarioId, String idioma, Boolean notificaciones, String tema) {
        this.usuarioId = usuarioId;
        this.idioma = idioma;
        this.notificaciones = notificaciones;
        this.tema = tema;
    }

    public Perfil(Integer usuarioId, String idioma, Boolean notificaciones, String tema) {
        this.usuarioId=new Usuario();
        this.usuarioId.setId(usuarioId);

        this.idioma = idioma;
        this.notificaciones = notificaciones;
        this.tema = tema;
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Boolean getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(Boolean notificaciones) {
        this.notificaciones = notificaciones;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}
