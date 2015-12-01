/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.controller;

import br.com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01016789
 */
public class LivroDB implements LogAplicacao{
    private List<Livro> livros;
    
    public LivroDB(){
		livros = new ArrayList<>();
	}
    
    public void inserirLivro(Livro livro){
	this.livros.add(livro);
        gravarLog("Livro Inserido: " + livro.getNome());
    }
	
    public List<Livro> retornarTodos(){
	return livros;
    }
    
    @Override
    public void gravarLog(String log){
        System.out.println("Novo Funcionario " + log);
        
    }
}
