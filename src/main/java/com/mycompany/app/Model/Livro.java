package com.mycompany.app.Model;

import com.mycompany.app.Interface.AutorInterface;

public class Livro implements AutorInterface{
	private String titulo;
	private Autor autor;
	private String genero;
	private boolean disponivel;
	
	public Livro() {
	}
	
	public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.disponivel = disponivel;
	}
	
	public void setTitulo(String novoTitulo) {
		this.titulo = novoTitulo;
	}
	public void setAutor(Autor novoAutor) {
		this.autor = novoAutor;
	}
	public void setGenero(String novoGenero) {
		this.genero = novoGenero;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public Autor getAutor() {
		return this.autor;
	}
	public String getGenero() {
		return this.genero;
	}
	
	public boolean isDisponivel() {
		return this.disponivel;
	}
	
	public void validaDisponibilidade() {
		if (this.isDisponivel()) System.out.println("O livro esta disponível");	
		else System.out.println("O livro esta indisponivel");
	}
	
	public void imprime() {
		System.out.println("Livro: " + this.titulo);
		System.out.println("Autor: " + this.autor.getNome());
		System.out.println("Genero: " + this.genero);
	}

	@Override
    public void publicar() {
        System.out.println("Livro publicando...");
	}
}
