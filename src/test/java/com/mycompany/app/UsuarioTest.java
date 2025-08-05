package com.mycompany.app;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

import com.mycompany.app.Autor;
import com.mycompany.app.Livro;
import com.mycompany.app.Usuario;
import com.mycompany.app.Emprestimo;

import static org.junit.Assert.*;

public class UsuarioTest {

    public UsuarioTest() {
    }

    //setIdade
    @Test
    public void testSetIdade() {
        //Cria uma instancia de Usuario
        Usuario usuario = new Usuario();

        //Atribui uma idade ao usuario
        usuario.setIdade(18);

        //Verifica se a idade atribuída é igual ao retorno de getIdade()
        assertEquals(18, usuario.getIdade());
    }
    
    //setHistoricoEmprestimo
    @Test
    public void testSetHistoricoEmprestimo() {
        //Cria uma instancia de Usuario
        Usuario usuario = new Usuario();

        //Cria um array de usuarios e adiciona o usuário criado
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        //Cria um autor e livros
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        //Cria emprestimos e os coloca em um array
        Date dataAtual = new Date();
        Emprestimo emprestimo1 = new Emprestimo(dataAtual, dataAtual, livro1, usuario);
        Emprestimo emprestimo2 = new Emprestimo(dataAtual, dataAtual, livro2, usuario);
        ArrayList<Emprestimo> historico = new ArrayList<Emprestimo>();

        //Atribui o array ao usuario
        usuario.sethistoricoEmprestimo(historico);

        //Verifica se o array atribuido é igual ao retorno de getHistoricoEmprestimo()
        assertArrayEquals(historico, usuario.getHistoricoEmprestimo());
    }

    @Test
    //getIdade
    public void testGetIdade() {
        //Cria uma instancia de Usuario
        Usuario usuario = new Usuario();

        //Atribui uma idade ao usuario
        usuario.setIdade(18);

        //Verifica se a idade atribuída é igual ao retorno de getIdade()
        assertEquals(18, usuario.getIdade());
    }

    //getHistoricoEmprestimo
     @Test
    public void testGetHistoricoEmprestimo() {
        //Cria uma instancia de Usuario
        Usuario usuario = new Usuario();

        //Cria um array de usuarios e adiciona o usuário criado
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        //Cria um autor e livros
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        //Cria emprestimos e os coloca em um array
        Date dataAtual = new Date();
        Emprestimo emprestimo1 = new Emprestimo(dataAtual, dataAtual, livro1, usuario);
        Emprestimo emprestimo2 = new Emprestimo(dataAtual, dataAtual, livro2, usuario);
        ArrayList<Emprestimo> historico = new ArrayList<Emprestimo>();
        historico.add(emprestimo1);
        historico.add(emprestimo2);


        //Atribui o array ao usuario
        usuario.sethistoricoEmprestimo(historico);

        //Verifica se o array atribuido é igual ao retorno de getHistoricoEmprestimo()
        assertArrayEquals(historico, usuario.getHistoricoEmprestimo());
    }

    //Empresta
    @Test
    public void testEmpresta() {
        //Cria uma instancia de Usuario
        Usuario usuario = new Usuario();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario);

        //Cria um autor e livros
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        //Empresta o livro para o usuario e verifica se a função retorna true
        assertTrue(usuario.empresta(livro, usuarios));

        //Verifica se o livro contido no emprestimo é o livro emprestado
        assertTrue(livro1.equals(usuario.getHistoricoEmprestimo().get(0).getLivro()));

        //Verifica se o livro agora está com o status de indisponivel
        asserFalse(livro1.isDisponivel());

        //Verifica se a data de devolução é duas semanas após a data de retirada
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(usuario.getHistoricoEmprestimo().get(0).getDataRetirada());
        cal.add(Calendar.WEEK_OF_YEAR, 2);
        assertEquals(cal, usuario.getHistoricoEmprestimo().get(0).getDataDevolucao());

        //Verifica se Empresta() retorna falso para o caso de tentativa de empréstimo de usuario com empréstimos pendentes
        usuario.empresta(livro1, usuarios);

        //Devolve o livro para realizar um novo empréstimo
        usuario.devolve(livro1);

        //Verifica se Empresta() retorna falso para o caso de tentativa de empréstimo de livro indisponível
        assertFalse(usuario.empresta(livro2));
    }

    //Devolve
    @Test
    public void testDevolve() {
        //Cria uma instancia de Usuario
        Usuario usuario = new Usuario();
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario);

        //Cria um autor e um livro
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        //Empresta o livro para o usuario
        usuario.empresta(livro1, usuarios);

        //Devolve o livro
        usuario.devolve(livro1);

        //Verifica se o livro está disponível após a devolução
        assertTrue(livro1.isDisponivel());

        //Verifica se a data de devolução foi atualizada
        GregorianCalendar cal1 = new GregorianCalendar();
        cal1.setTime(usuario.getHistoricoEmprestimo().get(0).getDataRetirada());

        GregorianCalendar cal2 = new GregorianCalendar();
        cal2.setTime(usuario.getHistoricoEmprestimo().get(0).getDataDevolucao());

        boolean dia = (cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH));
        boolean mes = (cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH));
        boolean ano = (cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR));

        assertTrue(dia && mes && ano);
    }
}
