package com.mycompany.app.Model;

import java.util.ArrayList;

public class Pessoa {
	protected String nome;
	protected ArrayList<Livro> livros;

	public Pessoa() {
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.livros = new ArrayList<Livro>();
	}
	public Pessoa(String nome, ArrayList<Livro> livros) {
		this.nome = nome;
		this.livros = livros;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Livro> getLivros() {
		return this.livros;
	}
	
	
	public void setLivros(ArrayList<Livro> livros) {
		this.livros = livros;
	}
}
