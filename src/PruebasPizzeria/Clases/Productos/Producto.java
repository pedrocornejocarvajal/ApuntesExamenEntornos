package PruebasPizzeria.Clases.Productos;

public class Producto {

    public enum Tipo {MARGARITA, FUNGUI, CUATROESTACIONES}

    private enum Estado {PEDIDO, SERVIDO}

    protected Tipo tipo;
    private Estado estado;
    private static int totalProductosPreparados = 0;
    private static int totalProductosServidos = 0;

    public Producto(Tipo tipo) {
        this.tipo = tipo;
        estado = Estado.PEDIDO;
        totalProductosPreparados++;
    }

    public static int getTotalProductosPreparados() {
        return totalProductosPreparados;
    }

    public static int getTotalProductosServidos() {
        return totalProductosServidos;
    }

    public void servir() {
        estado = Estado.SERVIDO;
        totalProductosServidos++;
    }

    @Override
    public String toString() {
        return String.format(
                "del tipo %s, se encuentra en estado %s",
                tipo, estado);
    }
}
