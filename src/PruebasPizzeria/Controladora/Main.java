package PruebasPizzeria.Controladora;/*
Ejercicio 1: Crea la clase Pizza con los atributos y métodos necesarios, teniendo en cuenta que:
Sobre cada pizza se necesita saber el tamaño- mediana o familiar - el tipo - margarita, cuatro
quesos o funghi - y su estado - pedida o servida. La clase debe almacenar información sobre el
número total de pizzas que se han pedido y que se han servido. Siempre que se crea una pizza
nueva, su estado es “pedida”.
Además, en la pizzería hacen Paninis. Los Paninis tienen las mismas características que las pizzas,
pero el tamaño en lugar de ser mediana o familiar, se describe como Almería, Granada o Sevilla.
Además, se debe indicar si el Panini es doble o simple. En este caso, también se tiene que llevar la
cuenta de cuantos paninis se han pedido y se han servido.
Las pizzas y los paninis se servirán mediante un método llamado servir.
En el programa principal se deben pedir 3 pizzas de distintos tipos (construir 3 pizzas), luego crear
dos paninis distintos entre sí, después se pasa a servir 2 de esas pizzas y 1 panini. Por último, debe
de mostrar un resumen de pizzas y paninis pedidos y servidos.
Debido a que las pizzas y los paninis tienen algunas propiedades en común, pero también algunas
diferentes, se deberá crear una clase genérica de la que hereden Pizza y Panini.
 */

import PruebasPizzeria.Clases.Pizzeria;

public class Main {

    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        pizzeria.crearProductos();
        pizzeria.servirTodosProductos(new int[]{0,1,3});
        pizzeria.mostrarTodosProductos();
        pizzeria.mostrarTotales();
    }
}
