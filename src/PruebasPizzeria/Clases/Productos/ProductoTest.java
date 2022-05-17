package PruebasPizzeria.Clases.Productos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @Test
    void Producto() {
        new Producto(Producto.Tipo.FUNGUI);
        int numeroProductosPreparados = 1;
        int numeroProductosServidos = 0;
        verificarAtributosProducto(numeroProductosPreparados, numeroProductosServidos);
    }

    private void verificarAtributosProducto (int numeroProductosPreparados,int numeroProductosServidos){
        assertEquals(numeroProductosPreparados, Producto.getTotalProductosPreparados(),
                String.format("El número no es corecto %d, %d", numeroProductosPreparados, Producto.getTotalProductosPreparados()));
        assertEquals(numeroProductosServidos, Producto.getTotalProductosServidos(), "El número no es corecto.");
    }

    @Test
    void ProductoCajaBlanca() {
        new Producto(Producto.Tipo.CUATROESTACIONES);
        int numeroProductosPreparados = 2;
        int numeroProductosServidos = 0;
        verificarAtributosProducto(numeroProductosPreparados, numeroProductosServidos);
    }

    @Test
    void getTotalProductosPreparados() {
        new Producto(Producto.Tipo.FUNGUI);
        new Producto(Producto.Tipo.CUATROESTACIONES);
        new Producto(Producto.Tipo.MARGARITA);
        assertEquals(3, Producto.getTotalProductosPreparados(), "El total de preparados no coincide.");
    }

    @Test
    void getTotalProductosServidos() {
        Producto producto1 = new Producto(Producto.Tipo.FUNGUI);
        Producto producto2 = new Producto(Producto.Tipo.CUATROESTACIONES);
        Producto producto3 = new Producto(Producto.Tipo.MARGARITA);
        producto1.servir();
        producto2.servir();
        producto3.servir();
        assertEquals(3, Producto.getTotalProductosServidos(), "Productos servidos no es correcto.");
    }

    @Test
    void servir() {
        Producto producto = new Producto(Producto.Tipo.FUNGUI);
        producto.servir();
        assertEquals(1, Producto.getTotalProductosServidos(), "Productos servidos no es correcto");
    }
}