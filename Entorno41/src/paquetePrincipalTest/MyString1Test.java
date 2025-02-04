package paquetePrincipalTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import paquetePrincipal.MyString1;

class MyString1Test {

	@Test
	void testContarPalabras() {
		assertEquals(0, MyString1.contarPalabras(null));
		assertEquals(0, MyString1.contarPalabras(" "));
		assertEquals(0, MyString1.contarPalabras("     "));
		assertEquals(3, MyString1.contarPalabras("Hola buenas Mundo"));
		assertEquals(4, MyString1.contarPalabras("Ignacion es un profesor"));
		assertEquals(1, MyString1.contarPalabras("Palabra"));
	}

	@Test
    void testContarLetrasDiferentes() {
        assertEquals(4, MyString1.contarLetrasDiferentes("Hola"));
        assertEquals(3, MyString1.contarLetrasDiferentes("aaa bbb ccc"));
        assertEquals(0, MyString1.contarLetrasDiferentes("1234"));
        assertEquals(0, MyString1.contarLetrasDiferentes(""));
        assertEquals(0, MyString1.contarLetrasDiferentes(" "));
        assertEquals(0, MyString1.contarLetrasDiferentes("@&$%"));
    }

    @Test
    void testEsPalindroma() {
        assertTrue(MyString1.esPalindroma("reconocer"));
        assertFalse(MyString1.esPalindroma("java"));
        assertTrue(MyString1.esPalindroma("Anita lava la tina"));
        assertTrue(MyString1.esPalindroma("123454321"));
    }

    @Test
    void testContarFrecuenciaPalabras() {
        Map<String, Integer> esperado1 = new HashMap<>();
        esperado1.put("hola", 2);
        esperado1.put("mundo", 3);
        assertEquals(esperado1, MyString1.contarFrecuenciaPalabras("Hola hola mundo mundo mundo"));
        Map<String, Integer> esperado2 = new HashMap<>();
        esperado2.put("buenas", 1);
        esperado2.put("tardes", 4);
        esperado2.put("las", 1);
        esperado2.put("de", 1);
        esperado2.put("hoy", 1);
        assertEquals(esperado2, MyString1.contarFrecuenciaPalabras("buenas tardes las tardes de hoy tardes tardes"));
    }

    @Test
    void testContarFrecuenciaLetras() {
        Map<Character, Integer> esperado3 = new HashMap<>();
        esperado3.put('h', 2);
        esperado3.put('o', 2);
        esperado3.put('l', 2);
        esperado3.put('a', 2);
        assertEquals(esperado3, MyString1.contarFrecuenciaLetras("Hola Hola"));
        Map<Character, Integer> esperado4 = new HashMap<>();
        esperado4.put('s', 2);
        esperado4.put('i', 1);
        esperado4.put('h', 1);
        esperado4.put('a', 1);
        esperado4.put('y', 1);
        esperado4.put('o', 1);
        esperado4.put('l', 1);
        assertEquals(esperado4, MyString1.contarFrecuenciaLetras("si hay sol"));
    }

}
