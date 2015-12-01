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
public class FuncionarioTest {
    
    public FuncionarioTest() {
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
     * Test of getNome method, of class Funcionario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Funcionario func = new Funcionario();
        String expResult = "TESTE Nome";
        assertEquals(null, func.getNome());
        func.setNome(expResult);
        assertEquals(expResult, func.getNome());
    }

    /**
     * Test of setNome method, of class Funcionario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Patric atendimentos faculdade";
        Funcionario instance = new Funcionario();
        assertEquals(null, instance.getNome());
        instance.setNome(nome);
        assertEquals(nome, instance.getNome());
    }

    /**
     * Test of getCpf method, of class Funcionario.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Funcionario instance = new Funcionario();
        assertEquals(null, instance.getCpf());
        String expResult = "123456";
        instance.setCpf(expResult);
        assertEquals(expResult, instance.getCpf());
    }

    /**
     * Test of setCpf method, of class Funcionario.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "123456";
        Funcionario instance = new Funcionario();
        assertEquals(null, instance.getCpf());
        instance.setCpf(cpf);
        assertEquals(cpf, instance.getCpf());
    }
    
}
