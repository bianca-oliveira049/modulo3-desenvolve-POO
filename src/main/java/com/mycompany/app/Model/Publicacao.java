package com.mycompany.app.Model;

import com.mycompany.app.Model.Autor;

public abstract class Publicacao {
    private String titulo;
    private Autor autor;

    public Publicacao() {
    }

    public Publicacao(String título, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
