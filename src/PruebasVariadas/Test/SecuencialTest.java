package PruebasVariadas.Test;

import org.junit.jupiter.api.Test;
import PruebasVariadas.principal.Secuencial;

import static org.junit.jupiter.api.Assertions.*;

class SecuencialTest {

    @Test
    void sumar() {
        int x = 23;
        int y = 83;
        int resultadoEsperado = 106;
        Secuencial secuencial = new Secuencial();
        int resultado = secuencial.sumar(x, y);

        assertEquals(resultado, resultadoEsperado, "Suma no valida.");
    }

    @Test
    void sumarCajaNegra2() {
        int x = -23;
        int y = -70;
        int resultadoEsperado = -93;
        Secuencial secuencial = new Secuencial();
        int resultadoReal = secuencial.sumar(x, y);
        assertEquals(resultadoReal, resultadoEsperado, "Suma no válida.");
    }

    @Test
    void sumarCajaNegra3() {
        int x = -23;
        int y = 0;
        int resultadoEsperado = -23;
        Secuencial secuencial = new Secuencial();
        int resultadoReal = secuencial.sumar(x, y);
        assertEquals(resultadoReal, resultadoEsperado, "Suma no válida.");
    }

    @Test
    void sumarCajaNegra4() {
        int x = 0;
        int y = 0;
        int resultadoEsperado = 0;
        Secuencial secuencial = new Secuencial();
        int resultadoReal = secuencial.sumar(x, y);
        assertEquals(resultadoReal, resultadoEsperado, "Suma no válida.");
    }

    @Test
    void setContadorCajaNegra() {
        int contador = 675896412;
        int resultadoEsperado = 675896412;
        Secuencial secuencial = new Secuencial();
        secuencial.setContador(contador);
        assertEquals(resultadoEsperado, secuencial.contador, "El contador no funciona bien");
    }

    @Test
    void setContadorCajaNegra2() {
        int contador = -8;
        int resultadoEsperado = -8;
        Secuencial secuencial = new Secuencial();
        secuencial.setContador(contador);
        assertEquals(resultadoEsperado, secuencial.contador, "El contador no funciona bien");
    }

    @Test
    void setContadorCajaNegra3() {
        int contador = -0;
        int resultadoEsperado = -0;
        Secuencial secuencial = new Secuencial();
        secuencial.setContador(contador);
        assertEquals(resultadoEsperado, secuencial.contador, "El contador no funciona bien");
    }

    @Test
    void getContadorCajaNegra() {
        int contador = 12;
        int resultadoEsperado = 12;
        Secuencial secuencial = new Secuencial();
        secuencial.setContador(contador);
        assertEquals(resultadoEsperado, secuencial.getContador(), "El contador no funciona bien");
    }

    @Test
    void getContadorCajaNegra2() {
        int contador = -12560;
        int resultadoEsperado = -12560;
        Secuencial secuencial = new Secuencial();
        secuencial.setContador(contador);
        assertEquals(resultadoEsperado, secuencial.getContador(), "El contador no funciona bien");
    }

    @Test
    void getContadorCajaNegra3() {
        int contador = 0;
        int resultadoEsperado = 0;
        Secuencial secuencial = new Secuencial();
        secuencial.setContador(contador);
        assertEquals(resultadoEsperado, secuencial.getContador(), "El contador no funciona bien");
    }

    @Test
    void calcularMediaCajaNegra() {
        double a = 12;
        double b = 6;
        double resultadoEsperado = 9;
        Secuencial secuencial = new Secuencial();
        double resultado = secuencial.calcularMedia(a, b);
        assertEquals(resultadoEsperado,resultado,"La división no es posible.");
    }

    @Test
    void calcularMediaCajaNegra2() {
        double a = 113.2547;
        double b = 674.3654;
        double resultadoEsperado = 393.81005;
        Secuencial secuencial = new Secuencial();
        double resultado = secuencial.calcularMedia(a, b);
        assertEquals(resultadoEsperado,resultado,"La división no es posible.");
    }
    @Test
    void calcularMedia() {
        assertEquals(new Secuencial().calcularMedia(5,10), 7.5, "la media no es correcta");
    }
}