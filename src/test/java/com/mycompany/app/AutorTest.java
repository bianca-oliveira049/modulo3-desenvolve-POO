package com.mycompany.app;

import org.junit.Test;
import java.util.ArrayList;
import com.mycompany.app.Model.Autor;
import com.mycompany.app.Model.Livro;
import com.mycompany.app.Model.Usuario;

import static org.junit.Assert.*;

public class AutorTest {

    public AutorTest() {
    }

    //getNacionalidade
    @Test
    public void testGetNacionalidade() {
        //Cria uma instância de Autor
        Autor autor = new Autor();

        //Atribui uma nacionalidade ao autor
        autor.setNacionalidade("Brasileiro");

        //Verifica se a nacionalidade atribuída é igual ao retorno de getNacionalidade()
        assertEquals("Brasileiro", autor.getNacionalidade());
    }

    //setNacionalidade
    @Test
    public void testSetNacionalidade() {
        //Cria uma instância de Autor
        Autor autor = new Autor();

        //Atribui uma nacionalidade ao autor
        autor.setNacionalidade("Brasileiro");

        //Verifica se a nacionalidade atribuída é igual ao retorno de getNacionalidade()
        assertEquals("Brasileiro", autor.getNacionalidade());
    }

    //addObra
    @Test 
    public void testAddObra() {
        //Cria uma instancia de autor e uma de livro
        Autor autor = new Autor();
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        //Adiciona um livro às obras publicadas do autor
        autor.addObra(livro1);

        //Verifica se o último elemento do array de obras do autor é igual ao livro adicionado
        assertEquals(livro1, autor.getObrasPublicadas().get(autor.getObrasPublicadas().size()-1));

    }  

     //getObrasPublicadasGenero
    @Test 
    public void testGetObrasPublicadasGenero() {
        //Cria uma instancia de autor e livros
        Autor autor = new Autor();
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor,"culinaria", false);
        
        //Cria um array de livros e adiciona um dos livros a ele
        ArrayList<Livro> livros = new ArrayList<Livro>();
        livros.add(livro1);

        //Atribui o array às obras publicadas do autor
        autor.setLivros(livros);

        //Adiciona separadamente o outro livro às obras publicadas
        autor.addObra(livro2);

        //Verifica se o retorno de getObrasPublicadasGenero() é igual ao array livros
        assertEquals(livros, autor.getObrasPublicadasGenero("tecnologia"));
        
    }

    //getIsUsuario
    @Test 
    public void testGetIsUsuario() {
        //Cria instancias de Autor
        Autor autor1 = new Autor();
        Autor autor2 = new Autor();

        //Atribui valores para o campo de IsUsuario para cada autor
        autor1.setIsUsuario(false);
        autor2.setIsUsuario(true);

        //Verifica se o valor atribuído corresponde ao retorno de getIsUsuario()
        assertFalse(autor1.getIsUsuario());
        assertTrue(autor2.getIsUsuario());
    }

    //setIsUsuario
    @Test 
    public void testSetIsUsuario() {
        //Cria instancias de Autor
        Autor autor1 = new Autor();
        Autor autor2 = new Autor();

        //Atribui valores para o campo de IsUsuario para cada autor
        autor1.setIsUsuario(false);
        autor2.setIsUsuario(true);

        //Verifica se o valor atribuído corresponde ao retorno de getIsUsuario()
        assertFalse(autor1.getIsUsuario());
        assertTrue(autor2.getIsUsuario());
    }
}
