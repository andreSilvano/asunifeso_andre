/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.controller;

import br.com.biblioteca.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01016789
 */
public class FuncionarioDB implements LogAplicacao{
    private List<Funcionario> funcionarios;
    
    public FuncionarioDB(){
		funcionarios = new ArrayList<>();
	}
    
    public void inserirFuncionario(Funcionario funcionario){
	this.funcionarios.add(funcionario);
        gravarLog("Funcionario Inserido: " + funcionario.getNome());
    }
	
    public List<Funcionario> retornarTodos(){
	return funcionarios;
    }
    
    @Override
    public void gravarLog(String log){
        System.out.println("Novo Funcionario " + log);
        
    }
}
