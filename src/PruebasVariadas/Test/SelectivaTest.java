package PruebasVariadas.Test;

import org.junit.jupiter.api.Test;
import PruebasVariadas.principal.Selectiva;

import static org.junit.jupiter.api.Assertions.*;

class SelectivaTest {
    @Test
    void obtenerMaximoPositivos() {
        int x = 30;
        int y = 50;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.obtenerMaximo(x, y);

        assertEquals(resultado, y, "El resultado es incorrecto");
    }

    @Test
    void obtenerMaximoNegativos() {
        int x = -30;
        int y = -50;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.obtenerMaximo(x, y);

        assertEquals(resultado, x, "El resultado es incorrecto");
    }

    @Test
    void obtenerMaximoExtremos() {
        int x = 305648978;
        int y = 506987542;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.obtenerMaximo(x, y);

        assertEquals(resultado, y, "El resultado es incorrecto");
    }

    @Test
    void actualizarMinimo() {
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(0);
        assertEquals(0 , selectiva.minimo,"el valor no se actualiza bien");

        selectiva.actualizarMinimo(20);
        assertEquals(0 , selectiva.minimo,"el valor no se actualiza bien");

        selectiva.actualizarMinimo(-20);
        assertEquals(-20 , selectiva.minimo,"el valor no se actualiza bien");
    }
    @Test
    void actualizarMinimoCajaNegraCambia() {
        int x = -15;
        int resultadoEsperado = -15;
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(x);
        assertEquals(resultadoEsperado,selectiva.minimo,"El mínimo no se ha actualizado.");
    }

    @Test
    void actualizarMinimoCajaNegraIgual() {
        int x = 0;
        int resultadoEsperado = 0;
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(x);
        assertEquals(resultadoEsperado,selectiva.minimo,"El mínimo no se ha actualizado.");
    }

    @Test
    void actualizarMinimoCajaNegraMayor() {
        int x = 15;
        int resultadoEsperado = 0;
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(x);
        assertEquals(resultadoEsperado,selectiva.minimo,"El mínimo no se ha actualizado.");
    }
    @Test
    void restaurarMinimoPositivo() {
        Selectiva selectiva = new Selectiva();
        selectiva.actualizarMinimo(-20);
        selectiva.restaurarMinimoPositivo();
        assertEquals(0, selectiva.minimo, "No se ha restaurado correctamente");
    }

    @Test
    void restaurarMinimoPositivoCajaNegra2() {
        Selectiva selectiva = new Selectiva();
        selectiva.minimo=60;
        selectiva.restaurarMinimoPositivo();
        assertNotEquals(0,selectiva.minimo,"El mínimo no se ha reseteado a 0");
    }

    @Test
    void multiplicacionPorSigno() {
        Selectiva selectiva = new Selectiva();
        selectiva.minimo = 20;
        selectiva.multiplicacionPorSigno();
        assertEquals(60, selectiva.minimo, "No se ha restaurado correctamente");

        selectiva.actualizarMinimo(-20);
        selectiva.multiplicacionPorSigno();
        assertEquals(40, selectiva.minimo, "No se ha restaurado correctamente");
    }

    @Test
    void multiplicacionPorSignoCN() {
        Selectiva selectiva = new Selectiva();
        selectiva.minimo=-100;
        selectiva.multiplicacionPorSigno();
        assertEquals(200, selectiva.minimo, "El extraño no ha funcionado bien.");
    }

    @Test
    void multiplicacionPorSignoCN2() {
        Selectiva selectiva = new Selectiva();
        selectiva.minimo=10000;
        selectiva.multiplicacionPorSigno();
        assertEquals(30000, selectiva.minimo, "El extraño no ha funcionado bien.");
    }

    @Test
    void multiplicacionPorSignoCN3() {
        Selectiva selectiva = new Selectiva();
        selectiva.minimo=0;
        selectiva.multiplicacionPorSigno();
        assertEquals(0, selectiva.minimo, "El extraño no ha funcionado bien.");
    }
    @Test
    void realizarCalculoOpcion0Positivos() {
        int opcion = 0;
        int a = 2;
        int b = 8;
        int resultadoEsperado = 10;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCalculoOpcion0Negativos() {
        int opcion = 0;
        int a = -2;
        int b = -8;
        int resultadoEsperado = -10;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCalculoOpcion0Extremos() {
        int opcion = 0;
        int a = 26598736;
        int b = 82165987;
        int resultadoEsperado = a+b;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCalculoOpcion1Positivos() {
        int opcion = 1;
        int a = 2;
        int b = 8;
        int resultadoEsperado = 16;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCalculoOpcion1Negativos() {
        int opcion = 1;
        int a = -2;
        int b = -8;
        int resultadoEsperado = 16;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCalculoOpcion1Extremos() {
        int opcion = 1;
        int a = 254895549;
        int b = 86598754;
        int resultadoEsperado = a*b;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCalculoOpcionDefaultPositivos() {
        int opcion = 34;
        int a = 2;
        int b = 8;
        int resultadoEsperado = -1;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCalculoOpcionDefaultNegativos() {
        int opcion = -34;
        int a = -2;
        int b = -8;
        int resultadoEsperado = -1;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }

    @Test
    void realizarCalculoOpcionDefaultExtremos() {
        int opcion = 34594546;
        int a = 254987;
        int b = 821864;
        int resultadoEsperado = -1;
        Selectiva selectiva = new Selectiva();
        int resultado = selectiva.realizarCalculo(opcion, a, b);
        assertEquals(resultado, resultadoEsperado, "El resultado es incorrecto");

    }
}