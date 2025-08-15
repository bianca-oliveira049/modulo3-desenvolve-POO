package com.mycompany.app.Model;

import com.mycompany.app.Interface.AutorInterface;

public class Livro extends Publicacao{
	private String genero;
	private boolean disponivel;
	
	public Livro() {
	}
	
	public Livro(String titulo, Autor autor, String genero, boolean disponivel) {
		super(titulo, autor);
		this.genero = genero;
		this.disponivel = disponivel;
	}
	
	public void setGenero(String novoGenero) {
		this.genero = novoGenero;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
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
		System.out.println("Livro: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor().getNome());
		System.out.println("Genero: " + this.genero);
	}
}
