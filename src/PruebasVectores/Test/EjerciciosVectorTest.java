package PruebasVectores.Test;


import PruebasVectores.Clases.EjerciciosVector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EjerciciosVectorTest {


    public EjerciciosVector vector = new EjerciciosVector(new double[]{1.0, 15.6, -60.78, 0.0, 55.14, -2.0});
    public EjerciciosVector vectorNulo = new EjerciciosVector(new double[0]);

    @Test
    void VectorCN1() {
        double[] datos = new double[]{1.0, 15.6, -60.78, 0.0, 55.14, -2.0};
        assertArrayEquals(new EjerciciosVector(datos).vector, datos, "(0010)Error del constructor.");
    }

    @Test
    void VectorCN2() {
        double[] datos = new double[]{};
        assertArrayEquals(new EjerciciosVector(datos).vector, datos, "(0020)Error del constructor.");
    }

    @Test
    void VectorNull() {
        boolean salta = false;
        try {
            new EjerciciosVector(null);
        } catch (Exception e) {
            salta = true;
        }
        assertTrue(salta, "(0030)Error al saltar la excepción.");
    }
    @org.junit.jupiter.api.Test
    void duplicarValoresVectorIniciado() {
        boolean exceptionProducida = false;
        try {
            EjerciciosVector ejerciciosVector = new EjerciciosVector(new double[]{4,5,6,8,9});
            ejerciciosVector.duplicarValores();
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método ha producido excepciones");
    }

    @org.junit.jupiter.api.Test
    void duplicarValoresVectorNoIniciado() {
        boolean exceptionProducida = false;
        try {
            EjerciciosVector vector = new EjerciciosVector(new double[0]);
        } catch (Exception e) {
            exceptionProducida = true;
        }
        assertFalse(exceptionProducida, "el método ha producido excepciones");

    }

    @Test
    void duplicarValoresCN1() throws Exception {
        EjerciciosVector vacio = new EjerciciosVector(new double[0]);
        vacio.duplicarValores();
        assertArrayEquals(vacio.vector, vectorNulo.vector, "(0040)No se han duplicado correctamente.");
    }

    @Test
    void duplicarValoresCN2() throws Exception {
        EjerciciosVector dobles = new EjerciciosVector(new double[]{2.0, 31.2, -121.56, 0.0, 110.28, -4.0});
        vector.duplicarValores();
        assertArrayEquals(dobles.vector, vector.vector, "No se han duplicado correctamente.");
    }

    @Test
    void duplicarValoresCN3() throws Exception {
        EjerciciosVector uno = new EjerciciosVector(new double[]{1.0});
        EjerciciosVector dos =  new EjerciciosVector(new double[]{2.0});
        uno.duplicarValores();
        assertArrayEquals(uno.vector, dos.vector, "No se han duplicado correctamente.");
    }
    @Test
    void obtenerMaximoCN1() throws Exception {
        assertEquals(55.14, vector.obtenerMaximo(), "Máximo no encontrado.");
    }

    @Test //Esta prueba no tiene sentido porque no es algo que el método pruebe.
    void obtenerMaximoCN2() throws Exception {
        assertNotEquals(70.0, vector.obtenerMaximo(), "Máximo encontrado.");
    }

    @Test
    void obtenerMaximoCN3() {
        boolean salta = false;
        try {
            vectorNulo.obtenerMaximo();
        } catch (Exception e) {
            salta = true;
        }
        assertTrue(salta,"La excepción no ha saltado como debiera.");
    }

    @Test
    void contieneValorCN1() throws Exception {
        assertTrue(vector.contieneValor(0.0), "No se ha encontrado el valor.");
    }

    @Test
    void contieneValorCN2() throws Exception {
        assertFalse(vector.contieneValor(8.0), "Se ha encontrado el valor.");
    }

    @Test
    void contieneValorCN3() throws Exception {
        assertFalse(vectorNulo.contieneValor(0.0), "Se ha encontrado el valor.");
    }

}