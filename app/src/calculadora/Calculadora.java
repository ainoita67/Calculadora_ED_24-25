/**
 * Calculadora
 * 
 * @author Dpto. Informática CPIFP Bajo Aragón
 * @version 1.0, 2023/12/01
 * 
 * Clase que a utilizar para realizar pruebas con JUnit
 * 
 * Requisitos para los parámetros en todas las operaciones (métodos):
 * 		- Parámetro > 0.
 * 		- Parámetro < 1000.
 * 
 * Requisitos para la operación (método) dividir:
 * 		- El resultado debe ser igual al recibido si la operación fuese sobre numeros reales.
 * 		- Debemos controlar la divisón por 0.
 */

package calculadora;

public class Calculadora {

	Calculadora() {

	}
	
	/**
	 * Suma
	 * Realiza la suma de dos números enteros.
	 * 
	 * @param n1	Entero. Primer número de la suma.
	 * @param n2	Entero. Segundo número de la suma.
	 * @return		Entero. Resultado de la suma.
	 */
	public int suma (int n1, int n2) {
		return n1 + n2;
	}
	
	/**
	 * Resta
	 * Realiza la resta de dos números enteros.
	 * 
	 * @param n1	Entero. Primer número de la resta.
	 * @param n2	Entero. Segundo número de la resta.
	 * @return		Entero. Resultado de la resta.
	 */	
	public int resta (int n1, int n2) {
		return n1 - n2;
	}
	
	
	/**
	 * Resta el Mayor al Menor
	 * Realiza la resta al mayor número recibido como parámetro el menor número recibido.
	 * 
	 * @param n1	Entero. Primer número de la resta.
	 * @param n2	Entero. Segundo número de la resta.
	 * @return		Entero. Resultado de la resta.
	 */		
	public int restaMayorAlMenor(int n1, int n2) {
		int resultado;
		resultado = n1 - n2;
		
		if (resultado < 0) {
			resultado = resultado * -1;
		}
		
		return resultado;
	}
	
	
	/**
	 * División
	 * Realiza la división de dos números.
	 * 
	 * @param n1	Entero. Numerador.
	 * @param n2	Entero. Denominador.
	 * @return		Entero. Resultado de la división.
	 */		
	public int dividir(int n1, int n2) {
		int resultado;
		resultado = n1 / n2;
		
		return resultado;
	}	
	
}
