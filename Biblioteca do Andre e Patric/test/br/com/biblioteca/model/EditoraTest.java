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
public class EditoraTest {
    
    public EditoraTest() {
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
     * Test of getNome method, of class Editora.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Editora instance = new Editora();
        instance.setNome("Higuinho alvinho xuxuzinho");
        String expResult = "Higuinho alvinho xuxuzinho";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Editora.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Pastor alemão castrado";
        Editora instance = new Editora();
        assertEquals(null, instance.getNome());
        instance.setNome(nome);
        assertEquals(nome, instance.getNome());
    }
    
}
