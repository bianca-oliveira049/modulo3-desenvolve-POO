package biblioteca;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Usuario> users = new ArrayList<Usuario>();
		ArrayList<Livro> obras = new ArrayList<Livro>();
		Usuario user1 = new Usuario("Rafael", 25);
		Usuario user2 = new Usuario("Gabriela", 18);
		users.add(user1);
		users.add(user2);
		Autor autor1 = new Autor("Jessica Felix", "Brasileira", obras);
		Livro livro1 = new Livro("Java for Begginers", autor1, "Tecnologia");
		autor1.addObra(livro1);
		user1.empresta(livro1, users);
		user2.empresta(livro1, users);
	}
}
