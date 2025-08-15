package com.mycompany.app.Model;


public class Artigo extends Publicacao{
    private String genero;
    private boolean publicado;

    public Artigo() {
        super();
    }
    
    public Artigo(String titulo, Autor autor, String genero, boolean publicado) {
        super(titulo, autor);
        this.genero = genero;
        this.publicado = publicado;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isPublicado() {
        return this.publicado;
    }

    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }
}
