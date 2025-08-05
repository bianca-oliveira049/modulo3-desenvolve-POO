package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Autor;
import com.mycompany.app.Livro;

public class LivroTest {

    //setTitulo
    @Test
    public void testSetTitulo() {
        //Cria uma instancia de Livro
         Livro livro1 = new Livro();

        //Atribui um titulo para o livro
        livro1.setTitulo("Java Basico");

        //Verifica se o titulo atribuído é igual ao retorno de getTitulo()
        assertEquals("Java Basico", livro.getTitulo());
    }

    //setAutor
    @Test 
    public void testSetAutor() {
        //Cria um autor e uma instancia de livro
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro();

        //Atribui um autor para o livro
        livro1.setAutor(autor);

        //Verifica se o autor atribuído é igual ao retorno de getAutor()
        assertEquals(autor, livro1.getAutor());
    }

    //setGenero
    @Test
    public void testSetGenero() {
        //Cria uma instancia de Livro
         Livro livro1 = new Livro();

        //Atribui um titulo para o livro
        livro1.setGenero("tecnologia");

        //Verifica se o genero atribuído é igual ao retorno de getGenero()
        assertEquals("tecnologia", livro1.getGenero());
    }

    //setDisponivel
    @Test 
    public void testSetDisponivel() {
        //Cria duas instancias de Livro
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        //Atribui valores para o atributo disponivel de cada livro
        livro1.setDisponivel(true);
        livro2.setDisponivel(false);

        //Verifica se os valores atribuídos são iguais ao retorno e isDisponivel()
        assertEquals(true, livro1.isDisponivel());
        assertEquals(false, livro2.isDisponivel());
    }

    //getTitulo
    @Test
    public void testGetTitulo() {
        //Cria uma instancia de Livro
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        //Verifica se o titulo atribuído é igual ao retorno de getTitulo()
        assertEquals("Java Basico", livro.getTitulo());
    }

    //getAutor
    @Test 
    public void testGetAutor() {
        //Cria um autor e uma instancia de livro e uma de autor
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        //Verifica se o autor atribuído é igual ao retorno de getAutor()
        assertEquals(autor, livro1.getAutor());
    }

    //getGenero
    @Test
    public void testGetGenero() {
        //Cria uma instancia de Livro
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        //Verifica se o genero atribuído é igual ao retorno de getGenero()
        assertEquals("tecnologia", livro1.getGenero());
    }

    //isDisponivel
    @Test 
    public void testIsDisponivel() {
        //Cria um autor e duas instancias de Livro
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        assertEquals(true, livro1.isDisponivel());
        asserEquals(false, livro2.isDisponivel());
    }
}
