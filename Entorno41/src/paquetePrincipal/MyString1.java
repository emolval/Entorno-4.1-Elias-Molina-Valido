package paquetePrincipal;

import java.util.HashMap;
import java.util.Map;

public class MyString1 {

// Método para contar el número de palabras en una cadena
//Se añade .trim() para solucionar problemas con los espacion vacios
public static int contarPalabras(String str) {
	if (str == null || str.trim().isEmpty()) {
		return 0;
	}
	String[] palabras = str.trim().split("\\s+");
	return palabras.length;
}

// Método para contar el número de letras diferentes en una cadena
public static int contarLetrasDiferentes(String str) {
	if (str == null || str.isEmpty()) {
		return 0;
	}
	str = str.toLowerCase().replaceAll("[^a-z]", "");
	return (int) str.chars().distinct().count();
}

// Método para contar las veces que aparece cada palabra en una cadena
//Con la linea 33 eliminamos cualquier cosa que no sea 1 espacio o letras, para que el split haga mejor su funcion
public static Map<String, Integer> contarFrecuenciaPalabras(String str) {
	Map<String, Integer> frecuenciaPalabras = new HashMap<>();
	if (str == null || str.trim().isEmpty()) {
		return frecuenciaPalabras;
	}
	str = str.toLowerCase().replaceAll("[^a-z\\s]", "");
	String[] palabras = str.trim().split("\\s+");
	for (String palabra : palabras) {
		frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
	}
	return frecuenciaPalabras;
}

// Método para contar las veces que aparece cada letra en una cadena
public static Map<Character, Integer> contarFrecuenciaLetras(String str) {
	Map<Character, Integer> frecuenciaLetras = new HashMap<>();
	if (str == null || str.isEmpty()) {
		return frecuenciaLetras;
	}
	str = str.toLowerCase().replaceAll("[^a-z]", "");
	for (char c : str.toCharArray()) {
		frecuenciaLetras.put(c, frecuenciaLetras.getOrDefault(c, 0) + 1);
	}
	return frecuenciaLetras;
}

// Método para verificar si una palabra es palíndroma
//Añadiendo el 0-9 verificamos numeros también y con el .trim() comprobamos cadenas de espacios
public static boolean esPalindroma(String palabra) {
	if (palabra == null || palabra.trim().isEmpty()) {
		return false;
	}
	palabra = palabra.toLowerCase().replaceAll("[^a-z0-9]", "");
	int izquierda = 0;
	int derecha = palabra.length() - 1;
	while (izquierda < derecha) {
		if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
			return false;
		}
		izquierda++;
		derecha--;
	}
	return true;
}

 
}
