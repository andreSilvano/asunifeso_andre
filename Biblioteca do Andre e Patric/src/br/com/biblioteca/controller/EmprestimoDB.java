/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.controller;

import br.com.biblioteca.model.Emprestimo;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoDB implements LogAplicacao{
    private List<Emprestimo> emprestimos;
    
    public EmprestimoDB(){
		emprestimos = new ArrayList<>();
	}
    
    public void inserirEmprestimo(Emprestimo emprestimo){
	this.emprestimos.add(emprestimo);
        gravarLog("Emprestimo Cadastrado: " + emprestimo.getDataEntrega());
    }
	
    public List<Emprestimo> retornarTodos(){
	return emprestimos;
    }
    
    @Override
    public void gravarLog(String log){
        System.out.println("Novo Funcionario " + log);
        
    }
}
