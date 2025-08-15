package com.mycompany.app;

import org.junit.Test;

import com.mycompany.app.Model.Artigo;
import com.mycompany.app.Model.Publicacao;

import static org.junit.Assert.*;

public class ArtigoTest {
    //getGenero
    @Test
    public void testGetGenero() {
        //Cria uma instancia de Artigo
        Artigo artigo = new Artigo();

        //Atribui um genero ao artigo
        artigo.setGenero("Tecnologia");

        //Verifica se o genero atribuído é igual ao retorno de getGenero()
        assertEquals("Tecnologia", artigo.getGenero());
    }

    //SetGenero
    @Test
    public void testSetGenero() {
        //Cria uma instancia de Artigo
        Artigo artigo = new Artigo();

        //Atribui um genero ao artigo
        artigo.setGenero("Tecnologia");

        //Verifica se o genero atribuído é igual ao retorno de getGenero()
        assertEquals("Tecnologia", artigo.getGenero());
    }

    //isPublicado
    @Test
    public void testIsPublicado() {
        //Cria instancias de Artigo
        Artigo artigo1 = new Artigo();
        Artigo artigo2 = new Artigo();
        
        //Atribui valores para o atributo de publicado
        artigo1.setPublicado(false);
        artigo2.setPublicado(true);

        //Verifica se o valor atribuído é igual ao retorno de isPublicado em cada caso
        assertFalse(artigo1.isPublicado());
        assertTrue(artigo2.isPublicado());
    }

    //setPublicado
    @Test
    public void testSetPublicado() {
        //Cria instancias de Artigo
        Artigo artigo1 = new Artigo();
        Artigo artigo2 = new Artigo();
        
        //Atribui valores para o atributo de publicado
        artigo1.setPublicado(false);
        artigo2.setPublicado(true);

        //Verifica se o valor atribuído é igual ao retorno de isPublicado em cada caso
        assertFalse(artigo1.isPublicado());
        assertTrue(artigo2.isPublicado());
        
    }
}
