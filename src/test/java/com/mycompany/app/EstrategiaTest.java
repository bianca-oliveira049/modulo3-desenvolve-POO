package com.mycompany.app;

import org.junit.Test;
import com.mycompany.app.Model.*;
import static org.junit.Assert.*;


public class EstrategiaTest {
    //
    @Test
    public void publicarLivroTest() {
        //Cria uma instância de Livro e uma de Autor, além de uma estrategia
        Livro livro = new Livro();
        Autor autor = new Autor();
        EstrategiaPublicacaoLivro estrategia = new EstrategiaPublicacaoLivro();

        //Atribui uma estratégia de publicação pro autor e publica um livro
        autor.setEstrategiaPublicacao(estrategia);
        autor.publicar(livro);

        //Verifica se o autor atribuído ao livro é igual ao autor criado
        assertEquals(autor, livro.getAutor());
    }

    @Test 
    public void publicarArtigoTest() {
        //Cria uma instância de Artigo e uma de Autor, além de uma estrategia
        Artigo artigo = new Artigo();
        Autor autor = new Autor();
        EstrategiaPublicacaoArtigo estrategia = new EstrategiaPublicacaoArtigo();

        //Atribui uma estratégia de publicação pro autor, atribui true para isUsuario e publica um artigo
        autor.setEstrategiaPublicacao(estrategia);
        autor.setIsUsuario(true);
        autor.publicar(artigo);
        
        //Verifica se o autor atribuído ao livro é igual ao autor criado
        assertEquals(autor, artigo.getAutor());
    }

}
