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
        assertEquals(0, MyString1.contarLetrasDiferentes(null));
    }

    @Test
    void testEsPalindroma() {
        assertTrue(MyString1.esPalindroma("reconocer"));
        assertFalse(MyString1.esPalindroma("java"));
        assertTrue(MyString1.esPalindroma("Anita lava la tina"));
        assertTrue(MyString1.esPalindroma("123454321"));
        assertFalse(MyString1.esPalindroma("45"));
    }

    @Test
    void testContarFrecuenciaPalabras() {
        Map<String, Integer> esperado = new HashMap<>(Map.of("hola", 2, "mundo", 3));
        assertEquals(esperado, MyString1.contarFrecuenciaPalabras("Hola hola mundo mundo mundo"));
        esperado.clear();
        esperado = new HashMap<>(Map.of("hola", 2, "mundo", 3));
        assertEquals(esperado, MyString1.contarFrecuenciaPalabras("  Hola hola  mundo   mundo mundo "));
        
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
        assertEquals(esperado4, MyString1.contarFrecuenciaLetras(" si hay  sol"));
    }

}
