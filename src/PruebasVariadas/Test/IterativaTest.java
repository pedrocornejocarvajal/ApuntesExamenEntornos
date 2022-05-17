package PruebasVariadas.Test;

import org.junit.jupiter.api.Test;
import PruebasVariadas.principal.Iterativa;

import static org.junit.jupiter.api.Assertions.*;

class IterativaTest {

    @Test
    void buscarMáximo() {
        double[] vector = { 1.7, 3.34, 5.7, 7.23, 11.88};
        double resultadoEsperado = 11.88;
        Iterativa iterativa = new Iterativa(null);
        double resultado = iterativa.buscarMáximo(vector);

        assertEquals(resultado, resultadoEsperado, 0.0001, "El maximo no es correcto");
    }

    @Test
    void buscarMáximoCB0() {
        double[] vector = {11.88};
        double resultadoEsperado = 11.88;
        Iterativa iterativa = new Iterativa(null);
        double resultado = iterativa.buscarMáximo(vector);

        assertEquals(resultado, resultadoEsperado, 0.0001, "El maximo no es correcto");
    }

    @Test
    void buscarMáximoCB1() {
        double[] vector = {2, 11.88};
        double resultadoEsperado = 11.88;
        Iterativa iterativa = new Iterativa(null);
        double resultado = iterativa.buscarMáximo(vector);

        assertEquals(resultado, resultadoEsperado, 0.0001, "El maximo no es correcto");
    }

    @Test
    void buscarMinimoInterno() {
        double[] vector = new double[]{2,67,3,7};
        Iterativa datos = new Iterativa(vector);
        double resultadoEsperado = 2;
        double resultado = datos.buscarMinimoInterno();
        assertEquals(resultado, resultadoEsperado, "El número no es el mínimo.");

    }
    @Test
    void buscarMinimoInternoCN2() {
        double[] vector = new double[]{-2,67,-3,-7, -98};
        Iterativa iterativa  = new Iterativa(vector);
        double resultadoEsperado = -98;
        double resultado = iterativa.buscarMinimoInterno();
        assertEquals(resultado, resultadoEsperado, "El número no es el mínimo.");
    }

    @Test
    void duplicarValoresDatos() {
        double[] vector = new double[]{2,15,3,7};
        Iterativa datos = new Iterativa(vector);
        double[] resultadoEsperado = new double[]{4,30,6,14};
        datos.duplicarValoresDatos();
        assertArrayEquals(resultadoEsperado,datos.datos, "No se han duplicado los valores.");

    }

    @Test
    void obtenerValorEntreExcepcion() {

        boolean exceptionProducida= false;
        try {
             new Iterativa(new double[]{20,9.5,8.1,10}).obtenerValorEntre(50,130);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");

    }

    @Test
    void obtenerValorEntreCN() throws Exception {
        double[] vector = new double[]{2,15,3,7,10};
        Iterativa datos = new Iterativa(vector);
        double x = 5;
        double y = 10;
        double resultadoEsperado = 7;
        assertEquals(resultadoEsperado, datos.obtenerValorEntre(x,y), "No funciona.");
    }

    @Test
    void obtenerValorEntreCN2() throws Exception {
        double[] vector = new double[]{5,2,15,3,7,10};
        Iterativa datos = new Iterativa(vector);
        double x = 5;
        double y = 10;
        double resultadoEsperado = 5;
        assertEquals(resultadoEsperado, datos.obtenerValorEntre(x,y), "No funciona.");
    }

    @Test
    void obtenerValorEntreCN3() throws Exception {
        double[] vector = new double[]{2,15,3,7,-12};
        Iterativa datos = new Iterativa(vector);
        double x = -20;
        double y = 0;
        double resultadoEsperado = -12;
        assertEquals(resultadoEsperado, datos.obtenerValorEntre(x,y), "No funciona.");
    }

    @Test
    void obtenerPrimerNegativo() throws Exception {
        double[] vector = new double[]{2,15,-3,7, -21};
        Iterativa datos = new Iterativa(vector);
        double x = 5;
        double y = 10;
        double resultadoEsperado = -3;
        assertEquals(resultadoEsperado, datos.obtenerPrimerNegativo(x, y), "No funciona.");

    }

    @Test
    void verificarDatosInternos1CN() {

        boolean exceptionProducida= false;
        try {
            new Iterativa(new double[]{20,9.5,8.1,10}).verificarDatosInternos();
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método no ha producido excepciones");

    }

    @Test
    void verificarDatosInternos2CN() {

        boolean exceptionProducida= false;
        try {
            new Iterativa(new double[]{-5456820,9.5,8.1,10}).verificarDatosInternos();
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");

    }

    @Test
    void verificarDatosInternos3CN() {

        boolean exceptionProducida= false;
        try {
            new Iterativa(new double[]{}).verificarDatosInternos();
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método no ha producido excepciones");

    }

    @Test
    void verificarDatosInternosCB() {
        double[] vector = new double[0];
        Iterativa datos = new Iterativa(vector);
        boolean exception = false;
        try {
            datos.verificarDatosInternos();
        }catch (Exception e){
            System.out.println("Datos incorrectos.");
        }
        assertArrayEquals(vector, datos.datos, "El array no está vacío.");
    }

    @Test
    void verificarDatosInternosCB2() {
        double[] vector = new double[]{2,15,3,7,21,-99,999};
        Iterativa datos = new Iterativa(vector);
        try {
            datos.verificarDatosInternos();
        }catch (Exception e){
            System.out.println("Datos incorrectos.");
        }
        assertArrayEquals(vector, datos.datos, "El array no es el mismo.");
    }

}