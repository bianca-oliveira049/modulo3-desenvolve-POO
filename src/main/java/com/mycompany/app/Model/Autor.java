package com.mycompany.app.Model;
import java.util.ArrayList;
import com.mycompany.app.Interface.EstrategiaPublicacao;

public class Autor extends Pessoa{
	private String nacionalidade;
	private boolean isUsuario;
	private EstrategiaPublicacao estrategia;

	public Autor() {
		super();
	}

	public Autor(String nome, String nacionalidade) {
		super(nome);
		this.nacionalidade = nacionalidade;
	}
	
	public Autor(String nome, String nacionalidade, ArrayList<Livro> obrasPublicadas, boolean isUsuario) {
		super(nome, obrasPublicadas);
		this.nacionalidade = nacionalidade;
		this.isUsuario = isUsuario;
	}
	
	public void setNacionalidade(String novaNacionalidade) {
		this.nacionalidade = novaNacionalidade;
	}
	
	public void addObra(Livro livro) {
		this.livros.add(livro);
	}

	public void setIsUsuario(boolean isUsuario) {
		this.isUsuario = isUsuario;
	}

	public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
		this.estrategia = estrategia;
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
	
	public boolean getIsUsuario() {
		return this.isUsuario;
	}

	public void publicar(Publicacao publicacao) {
		this.estrategia.publicar(publicacao, this);
	}
	
}
