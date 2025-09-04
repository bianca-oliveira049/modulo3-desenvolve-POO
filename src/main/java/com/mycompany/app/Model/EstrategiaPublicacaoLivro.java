package com.mycompany.app.Model;

import com.mycompany.app.Interface.EstrategiaPublicacao;

public class EstrategiaPublicacaoLivro implements EstrategiaPublicacao {
    @Override
    public void publicar(Publicacao publicacao, Autor autor) {
        publicacao.setAutor(autor);
    }
}