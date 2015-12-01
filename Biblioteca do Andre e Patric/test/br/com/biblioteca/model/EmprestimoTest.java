/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 01016800
 */
public class EmprestimoTest {
    
    public EmprestimoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDataEntrega method, of class Emprestimo.
     */
    @Test
    public void testGetDataEntrega() {
        System.out.println("getDataEntrega");
        Emprestimo instance = new Emprestimo();
        instance.setDataEntrega("24/12/2024");
        String expResult = "24/12/2024";
        String result = instance.getDataEntrega();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDataEntrega method, of class Emprestimo.
     */
    @Test
    public void testSetDataEntrega() {
        System.out.println("setDataEntrega");
        String dataEntrega = "24/11/2055";
        Emprestimo instance = new Emprestimo();
        assertEquals(null, instance.getDataEntrega());
        instance.setDataEntrega(dataEntrega);
        assertEquals(dataEntrega, instance.getDataEntrega());
    }

    /**
     * Test of getLIvro method, of class Emprestimo.
     */
    @Test
    public void testGetLIvro() {
        System.out.println("getLIvro");
        Emprestimo instance = new Emprestimo();
        Editora kleytons = new Editora();
        Livro livrinho = new Livro(kleytons);
        instance.setLIvro(livrinho);
        Livro result = instance.getLIvro();
        assertEquals(livrinho, result);
    }

    /**
     * Test of setLIvro method, of class Emprestimo.
     */
    @Test
    public void testSetLIvro() {
        System.out.println("setLIvro");
        Editora editor = new Editora();
        Livro livrozinho = new Livro(editor);
        Livro LIvro = livrozinho;
        Emprestimo instance = new Emprestimo();
        assertEquals(null, instance.getLIvro());
        instance.setLIvro(LIvro);
        assertEquals(livrozinho, instance.getLIvro());
    }

    /**
     * Test of getFuncionario method, of class Emprestimo.
     */
    @Test
    public void testGetFuncionario() {
        System.out.println("getFuncionario");
        Emprestimo instance = new Emprestimo();
        assertEquals(null, instance.getFuncionario());
        Funcionario albertotorresjaiminho = new Funcionario();
        instance.setFuncionario(albertotorresjaiminho);
        assertEquals(albertotorresjaiminho, instance.getFuncionario());
    }

    /**
     * Test of setFuncionario method, of class Emprestimo.
     */
    @Test
    public void testSetFuncionario() {
        System.out.println("setFuncionario");
        Funcionario albertozeroberto = new Funcionario();
        Emprestimo instance = new Emprestimo();
        assertEquals(null, instance.getFuncionario());
        instance.setFuncionario(albertozeroberto);
        assertEquals(albertozeroberto, instance.getFuncionario());
    }

    /**
     * Test of getAluno method, of class Emprestimo.
     */
    @Test
    public void testGetAluno() {
        System.out.println("getAluno");
        Emprestimo instance = new Emprestimo();
        assertEquals(null, instance.getAluno());
        Aluno aluno = new Aluno();
        instance.setAluno(aluno);
        assertEquals(aluno, instance.getAluno());
    }

    /**
     * Test of setAluno method, of class Emprestimo.
     */
    @Test
    public void testSetAluno() {
        System.out.println("setAluno");
        Aluno aluno = new Aluno();
        Emprestimo instance = new Emprestimo();
        assertEquals(null, instance.getAluno());
        instance.setAluno(aluno);
        assertEquals(aluno, instance.getAluno());
    }
    
}
