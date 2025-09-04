package com.mycompany.app.Model;

import com.mycompany.app.Interface.EstrategiaPublicacao;

public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao{
    @Override
    public void publicar(Publicacao publicacao, Autor autor) {
        if (autor.getIsUsuario()) publicacao.setAutor(autor);
    }
}
