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
public class LivroTest {
    
    public LivroTest() {
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
     * Test of getCodigo method, of class Livro.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Editora editore = new Editora();
        Livro instance = new Livro(editore);
        String expResult = null;
        assertEquals(expResult, instance.getCodigo());
    }

    /**
     * Test of setCodigo method, of class Livro.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Livro instance = null;
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Livro.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Livro instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Livro.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Livro instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEditora method, of class Livro.
     */
    @Test
    public void testGetEditora() {
        System.out.println("getEditora");
        Livro instance = null;
        Editora expResult = null;
        Editora result = instance.getEditora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEditora method, of class Livro.
     */
    @Test
    public void testSetEditora() {
        System.out.println("setEditora");
        Editora editora = null;
        Livro instance = null;
        instance.setEditora(editora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
