package org.example.models;

public class PlayListSonido {
    private Integer Id;
    private PlayList playListId;
    private Sonido sonidoId;
    private Integer bolumenPista;
    private Integer orden;

    public PlayListSonido(){

    }

    public PlayListSonido(Integer id, PlayList playListId, Sonido sonidoId, Integer bolumenPista, Integer orden) {
        Id = id;
        this.playListId = playListId;
        this.sonidoId = sonidoId;
        this.bolumenPista = bolumenPista;
        this.orden = orden;
    }

    public PlayListSonido(PlayList playListId, Sonido sonidoId, Integer bolumenPista, Integer orden) {
        this.playListId = playListId;
        this.sonidoId = sonidoId;
        this.bolumenPista = bolumenPista;
        this.orden = orden;
    }

    public PlayListSonido(Integer playListId, Integer sonidoId, Integer bolumenPista, Integer orden) {
        this.playListId = new PlayList();//para trabajar con clases
        this.playListId.setId(playListId);

        this.sonidoId = new Sonido();//para trabajar con clases
        this.sonidoId.setId(sonidoId);

        this.bolumenPista = bolumenPista;
        this.orden = orden;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public PlayList getPlayListId() {
        return playListId;
    }

    public void setPlayListId(PlayList playListId) {
        this.playListId = playListId;
    }

    public Sonido getSonidoId() {
        return sonidoId;
    }

    public void setSonidoId(Sonido sonidoId) {
        this.sonidoId = sonidoId;
    }

    public Integer getBolumenPista() {
        return bolumenPista;
    }

    public void setBolumenPista(Integer bolumenPista) {
        this.bolumenPista = bolumenPista;
    }

    public Integer getOrden() {
        return orden;
    }

    public void setOrden(Integer orden) {
        this.orden = orden;
    }
}
