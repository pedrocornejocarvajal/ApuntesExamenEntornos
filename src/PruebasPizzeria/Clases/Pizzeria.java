package PruebasPizzeria.Clases;

import PruebasPizzeria.Clases.Productos.Panini;
import PruebasPizzeria.Clases.Productos.Pizza;
import PruebasPizzeria.Clases.Productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    public List<Producto> listaProductos = new ArrayList<>();

    public void crearProductos() {
        //Se crean las 3 pizzas
        listaProductos.add(new Pizza(Producto.Tipo.MARGARITA, Pizza.Tamano.FAMILIAR));
        listaProductos.add(new Pizza(Producto.Tipo.FUNGUI, Pizza.Tamano.FAMILIAR));
        listaProductos.add(new Pizza(Producto.Tipo.CUATROESTACIONES, Pizza.Tamano.MEDIANA));
        listaProductos.add(new Panini(Producto.Tipo.FUNGUI, Panini.TamanoPanini.SEVILLA, Panini.Racion.DOBLE));
        listaProductos.add(new Panini(Producto.Tipo.CUATROESTACIONES, Panini.TamanoPanini.GRANADA, Panini.Racion.SIMPLE));
    }

    public void servirTodosProductos(int[] posicion) {
        //Vamos a servir dos pizzas y un panini.
        for (int pos : posicion) {
            listaProductos.get(pos).servir();
        }
    }

    public void mostrarTodosProductos() {
        //Metodo mostrar pedidos y demas.
        for (Producto producto : listaProductos) {
            System.out.println(producto.toString());
        }
    }

    public void mostrarTotales () {
        //Metodo mostrar totales.
        System.out.printf("El total de pizzas pedidas es %d, ",
                Pizza.getTotalPizzasPreparadas());
        System.out.printf("y el total de pizzas servidas es %d.%n",
                Pizza.getTotalPizzasServidas());
        //pasar todo a printf o a format.
        System.out.println("El total de paninis pedidos es " + Panini.getTotalPaninisPreparados() + ", " +
                "y el total de paninis servidos es " + Panini.getTotalPaninisServidos());
        System.out.println("El total de productos es " + Producto.getTotalProductosPreparados() + ", " +
                "y el total servidos es " + Producto.getTotalProductosServidos());
    }
}
