package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Autor;
import com.mycompany.app.Livro;
import com.mycompany.app.Usuario;

import biblioteca.Emprestimo;

import static org.junit.Assert.*;

public class EmprestimoTest {

    //getDataRetirada()
    @Test
    public void testGetDataRetirada() {
        //cria uma instância de Emprestimo
        Date dataRetirada = new Date();
        com.mycompany.app.Emprestimo emprestimo = new Emprestimo();

        //Atribui uma data para o atributo dataRetirada do empréstimo
        emprestimo.setDataRetirada(dataRetirada);

        //Verifica se o retorno de getDataRetirada() é igual à data atribuída
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }

    //getDataDevolucao()
    @Test
    public void testGetDevolucao() {
        //cria uma instância de Emprestimo
        Date dataDevolucao = new Date();
        com.mycompany.app.Emprestimo emprestimo = new Emprestimo();

        //Atribui uma data para o atributo de dataDevolucao
        emprestimo.setDataDevolucao(dataDevolucao);

        //Verifica se o retorno de getDevolucao é igual à data atribuída
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }
    
    //getLivro()
    @Test
    public void testGetLivro() {
        //cria uma instância de Emprestimo
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        com.mycompany.app.Emprestimo emprestimo = new Emprestimo();

        //Atribui um livro para o empréstimo
        emprestimo.setLivro(livro);

        //Verifica se o retorno de getLivro() é igual ao livro atribuído
        assertEquals(livro, emprestimo.getLivro());
    }

    //getUsuario()
    @Test
    public void testGetUsuario() {
        //cria uma instância de Emprestimo
        Usuario usuario = new Usuario("Gabriel", 21);
        com.mycompany.app.Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        //Atribui um usuario ao empréstimo
        emprestimo.setUsuario(usuario);

        //Verifica se o retorno de getUsuario() é igual ao livro 
        assertEquals(usuario, emprestimo.getUsuario());
    }

    //setDataRetirada()
    @Test
    public void testSetDataRetirada() {
        //cria uma instância de Emprestimo
        Date dataRetirada = new Date();
        com.mycompany.app.Emprestimo emprestimo = new Emprestimo();

        //Atribui uma data para o atributo dataRetirada do empréstimo
        emprestimo.setDataRetirada(dataRetirada);

        //Verifica se o retorno de getDataRetirada() é igual à data atribuída
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
    }

    //setDataDevolucao()
    @Test
    public void testSetDataDevolucao() {
        //cria uma instância de Emprestimo
        Date dataDevolucao = new Date();
        com.mycompany.app.Emprestimo emprestimo = new Emprestimo();

        //Atribui uma data para o atributo de dataDevolucao
        emprestimo.setDataDevolucao(dataDevolucao);
        
        //Verifica se o retorno de getDevolucao é igual à data atribuída
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
    }

    //setLivro()
    @Test
    public void testSetLivro() {
        //cria uma instância de Emprestimo
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        com.mycompany.app.Emprestimo emprestimo = new Emprestimo();

        //Atribui um livro para o empréstimo
        emprestimo.setLivro(livro);
        
        //Verifica se o retorno de getLivro() é igual ao livro atribuído
        assertEquals(livro, emprestimo.getLivro());
    }

    //setUsuario()
    @Test
    public void testSetUsuario() {
        //cria uma instância de Emprestimo
        Usuario usuario = new Usuario("Gabriel", 21);
        com.mycompany.app.Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        //Atribui um usuario ao empréstimo
        emprestimo.setUsuario(usuario);
        
        //Verifica se o retorno de getUsuario() é igual ao livro 
        assertEquals(usuario, emprestimo.getUsuario());
    }
    
}
