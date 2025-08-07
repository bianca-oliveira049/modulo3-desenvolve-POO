package com.mycompany.app.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Usuario extends Pessoa{
	private int idade;
	private ArrayList<Emprestimo> historicoEmprestimo;
	
	public Usuario() {

	}
	
	public Usuario(String nome, int idade) {
		super(nome);
		this.idade = idade;
		this.historicoEmprestimo = new ArrayList<Emprestimo>();
	}
	
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	public void sethistoricoEmprestimo(ArrayList<Emprestimo> novoHistorico) {
		this.historicoEmprestimo = novoHistorico;
	}
	
	public int getIdade() {
		return this.idade;
	}
	public ArrayList<Emprestimo> getHistoricoEmprestimo() {
		return this.historicoEmprestimo;
	}
	
	public boolean empresta(Livro livro, ArrayList<Usuario> users) {
		Date dataAtual = new Date();
		for (int i = 0; i < this.historicoEmprestimo.size(); i++) {
			if (this.historicoEmprestimo.get(i).getDataDevolucao().before(dataAtual)) return false;
		}
		if (this.idade < 18 && (livro.getGenero().equals("Terror") || livro.getGenero().equals("True Crime")))
			return false;
		if (livro.isDisponivel()) {
			Calendar calendario = new GregorianCalendar();
			calendario.setTime(dataAtual);
			calendario.add(Calendar.WEEK_OF_YEAR, 2);
			Date dataDev = calendario.getTime();
			
			Emprestimo novoEmp = new Emprestimo(dataAtual, dataDev, livro, this);
			this.historicoEmprestimo.add(novoEmp);
			
			livro.setDisponivel(false);
			
			return true;
		}
		else {
			for (int k = 0; k < users.size(); k++) {
				for (int j = 0; j < users.get(k).getHistoricoEmprestimo().size(); j++) {
					if (livro.equals(users.get(k).getHistoricoEmprestimo().get(j).getLivro())) {
						livro.validaDisponibilidade();
						livro.imprime();
						users.get(k).getHistoricoEmprestimo().get(j).imprime();
					}
				}
			}
		}
		
		return false;
	}
	
	public void devolve(Livro livro) {
		Date dataAtual = new Date();
		for (int i = this.historicoEmprestimo.size() - 1; i >= 0; i--) {
			if (this.historicoEmprestimo.get(i).getLivro().equals(livro)) {
				this.historicoEmprestimo.get(i).setDataDevolucao(dataAtual);
				livro.setDisponivel(true);
				break;
			}
		}
	}
	
}
