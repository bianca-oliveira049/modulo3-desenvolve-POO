package biblioteca;
import java.util.Date;

public class Emprestimo {
	private Date dataRetirada;
	private Date dataDevolucao;
	private Livro livro;
	private Usuario usuario;
	
	public Emprestimo(Date dataRetirada, Date dataDevolucao, Livro livro, Usuario usuario) {
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
		this.livro = livro;
		this.usuario = usuario;
	}
	
	public void setDataRetirada(Date novaDataRetirada) {
		this.dataRetirada = novaDataRetirada;
	}
	public void setDataDevolucao(Date novaDataDevolucao) {
		this.dataDevolucao = novaDataDevolucao;
	}
	
	public Date getDataRetirada() {
		return this.dataRetirada;
	}
	public Date getDataDevolucao() {
		return this.dataDevolucao;
	}
	public Livro getLivro() {
		return this.livro;
	}
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void imprime() {
		System.out.println("Usuário: " + this.usuario.getNome());
		System.out.println("Idade: " + this.usuario.getIdade());
		System.out.println("Data de Retirada: " + this.dataRetirada);
		System.out.println("Data de Devolução: " + this.dataDevolucao);
	}
}
