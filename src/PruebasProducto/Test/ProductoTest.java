package PruebasProducto.Test;

import PruebasProducto.Clases.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void setDescripcionMayorMaximo() throws Exception {

        boolean exceptionProducida= false;
        try {
            Producto producto = new Producto("holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 45);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");
    }

    @Test
    void setDescripcionMenorMinimo() throws Exception {

        boolean exceptionProducida= false;
        try {
            Producto producto = new Producto("", 45);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");
    }
    @Test
    void setDescripcionDentroRango() {
        boolean exceptionProducida = false;
        try {
            Producto producto = new Producto("hola", 45);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método ha producido excepciones");
    }


    @Test
    void setPrecioMenorCero() {
        boolean exceptionProducida = false;
        try {
            Producto producto = new Producto("hola", -45);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");
    }


    @Test
    void setPrecioMayorCero() {
        boolean exceptionProducida = false;
        try {
            Producto producto = new Producto("hola", 45);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método ha producido excepciones");
    }


    @Test
    void setPrecioCero() {
        boolean exceptionProducida = false;
        try {
            Producto producto = new Producto("hola", 0);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertTrue(exceptionProducida, "el método no ha producido excepciones");
    }

    @Test
    void constructorCB() {
        boolean saltaExcepcion = false;
        try {
           Producto producto = new Producto("", 0.0);
        } catch (Exception e){
            saltaExcepcion = true;
        }
        assertTrue(saltaExcepcion, "La excepción no ha saltado como debería.");
    }
}