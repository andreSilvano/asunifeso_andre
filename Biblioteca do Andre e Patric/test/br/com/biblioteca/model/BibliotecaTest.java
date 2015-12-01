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
public class BibliotecaTest {
    
    public BibliotecaTest() {
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
     * Test of getNome method, of class Biblioteca.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Biblioteca instance = new Biblioteca();
        instance.setNome("xablau");
        String expResult = "xablau";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Biblioteca.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Couve Flor da Silvis";
        Biblioteca instance = new Biblioteca();
        assertEquals(null, instance.getNome());
        instance.setNome(nome);
        assertEquals(nome, instance.getNome());
    }
    
}
