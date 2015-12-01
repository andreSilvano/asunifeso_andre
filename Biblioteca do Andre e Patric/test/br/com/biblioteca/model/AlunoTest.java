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
public class AlunoTest {
    
    public AlunoTest() {
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
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Aluno aluno = new Aluno();
        aluno.setNome("Arnaldo boladao");
        String expResult = "Arnaldo boladao";
        String result = aluno.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Aluno.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Patriczinho";
        Aluno aluno = new Aluno();
        assertEquals(null, aluno.getNome());
        aluno.setNome(nome);
        assertEquals(nome, aluno.getNome());
    }

    /**
     * Test of getMatricula method, of class Aluno.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Aluno aluno = new Aluno();
        aluno.setMatricula("01079593");
        String expResult = "01079593";
        String result = aluno.getMatricula();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMatricula method, of class Aluno.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "01016800";
        Aluno aluno = new Aluno();
        assertEquals(null, aluno.getMatricula());
        aluno.setMatricula(matricula);
        assertEquals(matricula, aluno.getMatricula());
    }

    /**
     * Test of toString method, of class Aluno.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Aluno aluno = new Aluno();
        aluno.setNome("Robson Jaime");
        aluno.setMatricula("01016800");
        String expResult = "01016800 - Robson Jaime";
        String result = aluno.toString();
        assertEquals(expResult, result);
    }
    
}
