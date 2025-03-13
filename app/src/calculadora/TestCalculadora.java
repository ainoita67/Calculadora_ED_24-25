package calculadora;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import calculadora.Calculadora;

class TestCalculadora {

    // Instancia de la clase Calculadora
    Calculadora cal = new Calculadora();
    
 // test sumas
    @Test
    void testSuma() {
        int x = 18;
        int y = 7;
        assertEquals(25, cal.suma(x, y), "Error en el cálculo de suma");
    }
    
 // test resta normal
    @Test
    void testRestaNormal() {
        int x = 18;
        int y = 7;
        assertEquals(11, cal.resta(x, y), "Error en el cálculo de resta");
    }

// test resta con el 2º mayor
    @Test
    void testRestaConElSegundoMayor() {
        int x = 7;
        int y = 18;
        assertEquals(-11, cal.resta(x, y), "Error en la resta con el segundo número mayor");
    }

 // test restaMayorAlMenor normal
    @Test
    void testRestaMayorAlMenor() {
        int x = 7;
        int y = 18;
        assertEquals(11, cal.restaMayorAlMenor(x, y), "Error en el cálculo de resta mayor al menor");
    }
    
 // test restaMayorAlMenor inversa
    @Test
    void testRestaMayorAlMenorInversa() {
        int x = 7;
        int y = 18;
        assertEquals(11, cal.restaMayorAlMenor(y, x), "Error en el cálculo de resta mayor al menor");
    }

 // test dividir
    @Test
    void testDividir() {
        int x = 18;
        int y = 7;
        assertEquals(2, cal.dividir(x, y), "Error en el cálculo de la división");
    }

 // test dividir inverso
    @Test
    void testDividirInverso() {
        int x = 18;
        int y = 7;
        assertEquals(2, cal.dividir(x, y), "Error en el cálculo de la división");
    }

}

	
