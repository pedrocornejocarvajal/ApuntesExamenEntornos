package PruebasPizzeria.Clases.Productos;

public class Panini extends Producto {

    public enum TamanoPanini {ALMERIA, GRANADA, SEVILLA}

    public enum Racion {DOBLE, SIMPLE}

    private final TamanoPanini tamano;
    private final Racion racion;
    private static int totalPaninisPreparados = 0;
    private static int totalPaninisServidos = 0;

    public Panini(Tipo tipo, TamanoPanini tamano, Racion racion) {
        super(tipo);
        this.tamano = tamano;
        this.racion = racion;
        totalPaninisPreparados++;
    }

    public static int getTotalPaninisPreparados() {
        return totalPaninisPreparados;
    }

    public static int getTotalPaninisServidos() {
        return totalPaninisServidos;
    }

    @Override
    public void servir() {
        super.servir();
        totalPaninisServidos++;
    }

    @Override
    public String toString() {
        return String.format(
                "El panini pedido es %s , de tamaño %s y de ración %s",
                super.toString(), tamano, racion);
    }
}
