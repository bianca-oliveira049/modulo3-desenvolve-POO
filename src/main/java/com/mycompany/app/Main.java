package com.mycompany.app;

import com.mycompany.app.Model.*;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Usuario> users = new ArrayList<Usuario>();
		ArrayList<Livro> obras = new ArrayList<Livro>();
		Usuario user1 = new Usuario("Rafael", 25);
		Usuario user2 = new Usuario("Gabriela", 18);
		users.add(user1);
		users.add(user2);

		Autor autor1 = new Autor("Jessica Felix", "Brasileira", obras, false);

		Livro livro1 = new Livro("Java for Begginers", autor1, "Tecnologia", true);

		autor1.addObra(livro1);
		
		user1.empresta(livro1, users);
		user2.empresta(livro1, users);

		Artigo artigo = new Artigo("Entendendo Compiladores", autor1, "tecnologia", true);
	}
}
