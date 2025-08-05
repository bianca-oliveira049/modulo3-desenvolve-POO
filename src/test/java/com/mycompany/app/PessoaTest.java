package com.mycompany.app;

import org.junit.Test;

import biblioteca.Pessoa;

import static org.junit.Assert.*;

//getNome
//getLivros
//setNome
//setLivros

public class PessoaTest {
    @Test
    public void testGetNome() {
        // Cria uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa();

        //Atribuir um nome para a pessoa
        pessoa.setNome("Jess");

        //Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
    }
    
}
