package com.mycompany.app;
import java.util.ArrayList;

public class Autor extends Pessoa{
	private String nacionalidade;

	public Autor() {
	}
	
	public Autor(String nome, String nacionalidade, ArrayList<Livro> obrasPublicadas) {
		super(nome, obrasPublicadas);
		this.nacionalidade = nacionalidade;
	}
	
	public void setNacionalidade(String novaNacionalidade) {
		this.nacionalidade = novaNacionalidade;
	}
	
	public void addObra(Livro livro) {
		this.livros.add(livro);
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public ArrayList<Livro> getObrasPublicadas() {
		return this.getLivros();
	}
	public ArrayList<Livro> getObrasPublicadasGenero(String genero) {
		ArrayList<Livro> livrosGenero = new ArrayList<Livro>();
		for (int i = 0; i < this.getLivros().size(); i++) {
			if (this.livros.get(i).getGenero() == genero) {
				livrosGenero.add(this.livros.get(i));
			}
		}
		return livrosGenero;
	}
	
	
}
